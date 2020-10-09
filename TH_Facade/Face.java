package TH_Facade;

public class Face implements SocialShare {
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;

    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + this.message);

    }
}
