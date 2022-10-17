package sprites;

public class CornerBottomRight implements Sprite{
    // static public String[] drawing = {
    //     "███",
    //     "  █",
    //     "█ █",
    // };
    public String[] getEmptyTile(){
        return new String[]{
            "█ █",
            "  █",
            "███",
        };
    }
}
