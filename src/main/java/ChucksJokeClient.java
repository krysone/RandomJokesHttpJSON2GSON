import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChucksJokeClient {

    public static Set<String> getSeveralRandomJokes(int howManyJokes) throws IOException {
        Set<String> randomJokeSet = new HashSet<>();

        int counter = 0;

        while (randomJokeSet.size() != howManyJokes) {
            randomJokeSet.add(getChucksJoke());
        }
        for (String joke : randomJokeSet) {
            counter++;
            System.out.println("Joke no. " + counter + " : " + joke);
        }

        return randomJokeSet;
    }

    public static String getChucksJoke() throws IOException {

        String chucksJoke = getJsonToGSon(getJson());
        return chucksJoke;
    }

    public static String getJson() throws IOException {

        URL url = new URL("https://api.chucknorris.io/jokes/random");

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setRequestProperty("User-Agent", "Chrome");
        connection.setRequestMethod("GET");

        Scanner scanner = new Scanner(connection.getInputStream());
        String jsonRecieved = scanner.nextLine();

        return jsonRecieved;
    }

    public static String getJsonToGSon(String jsonRecieved) throws IOException {

        Gson gson = new Gson();

        Joke chucksJson = gson.fromJson(getJson(), Joke.class);
        String chucksJoke = chucksJson.getValue();

        return chucksJoke;
    }

}
