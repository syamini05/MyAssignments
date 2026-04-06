package week1.day1;
//SUGGESTION FOR REFACTORING:
//Consider creating a Browser parent class with Chrome and Firefox as subclassesto eliminate code duplication and improve maintainability.


public class BrowserDetails {
    public void ChromeDetails(){
        float browserVersion = 91.0f;
        String developer = "Google";
        boolean isBeta = false;
        int releaseYear = 2008;
        char shortcutKey = 'C';
        System.out.println("Here are the details of the Chrome Browser");
        System.out.println("Browser Version:"+browserVersion+"\n"+
                           "Developer:"+developer+"\n"+
                           "Beta Version:"+isBeta+"\n"+
                           "Release Year:"+releaseYear+"\n"+
                           "Shortcut Key:"+shortcutKey);
    }
    public void FirefoxDetails(){
        float browserVersion = 100.2f;
        String browserName  = "Firefox";
        boolean isVisible = true;
        int releaseYear = 1998;
        char browserLogo = 'f';
         System.out.println("Here are the details of the Firefox Browser");
        System.out.println("Browser Version:"+browserVersion+"\n"+
                           "Browser Name:"+browserName +"\n"+
                           "Is Visible:"+isVisible+"\n"+
                           "Release Year:"+releaseYear+"\n"+
                           "Browser Logo:"+browserLogo);
    }
    public static void main(String[] args) {
        BrowserDetails details = new BrowserDetails();
        details.ChromeDetails();
        details.FirefoxDetails();
    }
}



        