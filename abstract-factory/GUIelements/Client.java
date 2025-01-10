public class Client {
    private Button button;
    private ScrollBar scrollBar;
    private Menu menu;

    public Client(GUIFactory factory) {
        button = factory.createButton();
        scrollBar = factory.createScrollBar();
        menu = factory.createMenu();
    }

    public void render() {
        button.render();
        scrollBar.scroll();
        menu.display();
    }

    public static void main(String[] args) {
        // Example: Using the Windows Factory
        GUIFactory windowsFactory = new WindowsFactory();
        Client windowsClient = new Client(windowsFactory);
        windowsClient.render();

        // Example: Using the Mac Factory
        GUIFactory macFactory = new MacFactory();
        Client macClient = new Client(macFactory);
        macClient.render();

        // Example: Using the Linux Factory
        GUIFactory linuxFactory = new LinuxFactory();
        Client linuxClient = new Client(linuxFactory);
        linuxClient.render();
    }
}