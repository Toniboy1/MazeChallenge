
import sprites.CornerBottomRight;
import sprites.Sprite;

public class Maze {
    int column;
    int row;
    Sprite[][] grid;

    public Maze(int columnAmount, int rowAmount) {
        column = columnAmount * Sprite.height;
        row = rowAmount ;
        grid = new Sprite[column][row];
        Debug.print("Grid created for " + (column * row) + " positions");
    }

    private void generate() {
        for (int curRow = 0; curRow < grid.length; curRow++) {
            for (int curCol = 0; curCol < grid[curRow].length; curCol++) {
                grid[curRow][curCol] = new CornerBottomRight();
            }
        }
        Debug.print("Grid generated");
    }

    public void build() {
        generate();
        Debug.print("Building... spite row number is " + Sprite.height);
        for (int curRow = 0; curRow < grid.length; curRow++) {
            Debug.print("NR: ");
            for (int curCol = 0; curCol < grid[curRow].length; curCol++) {
                Debug.print("NC: ");
                Debug.print(curRow % Sprite.height);
                System.out.print(grid[curRow][curCol].getEmptyTile()[curRow % Sprite.height]);
                Debug.print("Sprite row: "+curRow % 3 + "  curRow: "+ curRow + " curCol: " + curCol+ " tileString: " +grid[curRow][curCol].getEmptyTile()[curRow % 3]);
                // for (int curCharRow = 0; curCharRow < grid[curRow][curCol].drawing.length; curCharRow++) {
                    
                // }
            }
            System.out.println();
        } 
    }
}
