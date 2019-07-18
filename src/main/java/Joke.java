public class Joke {
    /*
     * {"categories":[],
     * "created_at":"2016-05-01 10:51:41.584544",
     * "icon_url":"https://assets.chucknorris.host/img/avatar/chuck-norris.png",
     * "id":"KCBX4-4pS0SuBTHfSk7JkA",
     * "updated_at":"2016-05-01 10:51:41.584544",
     * "url":"https://api.chucknorris.io/jokes/KCBX4-4pS0SuBTHfSk7JkA",
     * "value":"The last time Chuck Norris went carolling, he wound up getting signed to a five-album solo contract with Sony."}

     * */

    String[] categories;
    String created_at;
    String icon_url;
    String id;
    String updated_at;
    String url;
    String value;


    public String[] getCategories() {
        return categories;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public String getId() {
        return id;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getUrl() {
        return url;
    }

    public String getValue() {
        return value;
    }
}
