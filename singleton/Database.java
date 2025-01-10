public class Database {
    private static Database instance;

    private Database() {
        // Initialization code
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        // Query execution code
    }
}