package week1.day2;

public class BrowserLaunch {
    public String launchBrowser(String browserName){
        System.out.println(""+browserName+" Browser is launched successfully");
        return browserName;
    }
    public void loadUrl(){
        System.out.println("Application url loaded successfully");
    }
    public static void main(String[] args) {
        BrowserLaunch obj = new BrowserLaunch();
        obj.launchBrowser("Chrome");
        obj.loadUrl();
        }
}
