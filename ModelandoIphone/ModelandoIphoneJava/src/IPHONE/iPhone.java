package IPHONE;

public class iPhone implements MusicPlayer, Phone, WebBrowser {

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void next() {
        System.out.println("Next track");
    }

    @Override
    public void previous() {
        System.out.println("Previous track");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Receiving call from " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + ": " + message);
    }

    @Override
    public void loadPage(String url) {
        System.out.println("Loading page: " + url);
    }

    @Override
    public void navigate(String url) {
        System.out.println("Navigating to: " + url);
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing page");
    }
}
