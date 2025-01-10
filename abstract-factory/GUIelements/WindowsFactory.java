// Concrete Factory: Windows Factory
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
