// Concrete Factory: Mac Factory
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacScrollBar();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
