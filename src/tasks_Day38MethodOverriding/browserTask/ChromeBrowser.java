package tasks_Day38MethodOverriding.browserTask;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
