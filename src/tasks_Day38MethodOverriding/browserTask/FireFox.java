package tasks_Day38MethodOverriding.browserTask;

public class FireFox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Firefox browser");
    }
}
