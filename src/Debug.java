public class Debug {
    static boolean enabled = false;
    private static final String GREEN_COLOR = "\033[0;32m";
    private static final String RESET = "\033[0m";
    static void print(String string){
        if(enabled)
        System.out.println(GREEN_COLOR + string +RESET);
    }
    public static void print(int i) {
        if(enabled)
        System.out.println(GREEN_COLOR + i +RESET);
    }
}
