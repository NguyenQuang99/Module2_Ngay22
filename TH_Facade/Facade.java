package TH_Facade;

public class Facade {
    private Twitter twitter;
    private Face facebook;

    public Facade(Twitter twitter, Face facebook) {
        this.twitter = twitter;
        this.facebook = facebook;
    }
    public void share(String message) {
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.twitter.share();
        this.facebook.share();
    }
}
