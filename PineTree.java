
/**
 * Creates an instance of a Tree.
 * 
 * @author Gavin Plunkett
 * @version January 15, 2019
 */
public class PineTree
{
    // instance variables - replace the example below with your own
    private Square trunk1;
    private Square trunk2;
    private Triangle branches1;
    private Triangle branches2;
    private Triangle branches3;;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public PineTree(int x, int y)
    {
        // initialise instance variables
        trunk1 = new Square();
        trunk2 = new Square();
        branches1 = new Triangle();
        branches2 = new Triangle();
        branches3 = new Triangle();
        
        // actually draw the tree
        drawPineTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawPineTree(int x, int y)
    {
        // put your code here
         // trunk
        trunk1.makeVisible();
        trunk1.changeColor("black");
        //180
        trunk1.moveVertical(y);
        //200
        trunk1.moveHorizontal(x);
       
        trunk2.makeVisible();
        trunk2.changeColor("black");
        trunk2.moveVertical(y-20);
        trunk2.moveHorizontal(x);
        
        branches1.makeVisible();
        branches1.changeColor("green");
        branches1.changeSize(40, 90);
        branches1.moveVertical(y-20);
        branches1.moveHorizontal(x+25);
        
        branches2.makeVisible();
        branches2.changeColor("green");
        branches2.changeSize(40, 90);
        branches2.moveHorizontal(x+25);
        branches2.moveVertical(y-40);
        
        branches3.makeVisible();
        branches3.changeColor("green");
        branches3.changeSize(40, 90);
        branches3.moveHorizontal(x+25);
        branches3.moveVertical(y-60);
    
        // translate the tree to the specified location
        
        
    }
    
}