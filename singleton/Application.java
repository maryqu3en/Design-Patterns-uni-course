public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT ...");
        Database bar = Database.getInstance();
        bar.query("SELECT ...");
        // The variable `bar` will contain the same object as
        // the variable `foo`.
    }
}