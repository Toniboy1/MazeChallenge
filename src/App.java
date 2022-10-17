public class App {
    public static void main(String[] args) throws Exception {
        Debug.enabled = false;
        UserSettings userSettings = new UserSettings();
        userSettings.prompt();
        Maze maze = new Maze(userSettings.columnAmount, userSettings.rowAmount);
        maze.build();
    }
}
