// Concrete Factory: Linux Factory
public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new LinuxScrollBar();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}