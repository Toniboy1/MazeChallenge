package sprites;

public class CornerBottomLeft implements Sprite{
    public String[] getEmptyTile(){
        return new String[]{
            "█ █",
            "█  ",
            "███",
        };
    }
}
