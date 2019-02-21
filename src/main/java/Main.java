public class Main {
    private static Main ourInstance = new Main();

    public static Main getInstance() {
        return ourInstance;
    }

    private Main() {
    }
}
