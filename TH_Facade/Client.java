package TH_Facade;

public class Client {
    public void share(String message){
        Facade socialMediaFacade = new Facade(new Twitter(), new Face());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
