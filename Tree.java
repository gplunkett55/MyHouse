
/**
 * Draws a tree
 *
 * @author Gavin Plunkett
 * @version January 14, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square trunk1;
    private Square trunk2;
    private Triangle branches1;
    private Triangle branches2;
    private Triangle branches3;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        // initialise instance variables
        trunk1 = new Square();
        trunk2 = new Square();
        branches1 = new Triangle();
        branches2 = new Triangle();
        branches3 = new Triangle();
        
        //actually draw the house
        drawTree();
        
        
    }

    /**
     * Draws a tree
     */
    public void drawTree()
    {
        // trunk
        trunk1.makeVisible();
        trunk1.changeColor("black");
        trunk1.moveVertical(180);
        trunk1.moveHorizontal(180);
        
        trunk2.makeVisible();
        trunk2.changeColor("black");
        trunk2.moveVertical(160);
        trunk2.moveHorizontal(180);
        
        branches1.makeVisible();
        branches1.changeColor("green");
        branches1.changeSize(40, 90);
        branches1.moveVertical(160);
        branches1.moveHorizontal(205);
        
        branches2.makeVisible();
        branches2.changeColor("green");
        branches2.changeSize(40, 90);
        branches2.moveHorizontal(205);
        
       
        
        
    }
}
