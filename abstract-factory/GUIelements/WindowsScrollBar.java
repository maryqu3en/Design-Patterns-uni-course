// Similarly, define ScrollBar and Menu for Windows, Mac, and Linux
public class WindowsScrollBar implements ScrollBar {
    @Override
    public void scroll() {
        System.out.println("Scrolling with a Windows scroll bar.");
    }
}