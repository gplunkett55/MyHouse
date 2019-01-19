
/**
 * Write a description of class MyHouse here.
 * Creates an Image of a house
 * @author Gavin Plunkett
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    private Square building;
    private Triangle roof;
    private Square door1;
    private Square door2;
    private Circle window;
    private Circle doorHandle;
    private Circle eyeball;
    private Square grass;
    private Square sky;
    private PineTree pineTree1;
    private PineTree pineTree2;
    private PineTree pineTree3;
    
    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        building = new Square();
        roof = new Triangle();
        door1 = new Square();
        door2 = new Square();
        window = new Circle();
        doorHandle = new Circle();
        eyeball = new Circle();
        grass = new Square();
        sky = new Square();
        // Actually draw the house
        drawHouse();
        
        // Create the pine tree
        pineTree1 = new PineTree(300,400);
        pineTree2 = new PineTree(400,400);
        pineTree3 = new PineTree(155,400);
    }

    /**
     * Draws the House
     */
    public void drawHouse()
    {
        // arrange each object
        //Set up the building (Ctrl + Space)
        //Make the grass
        grass.makeVisible();
        grass.changeColor("green");
        grass.changeSize(600);
        grass.moveVertical(-50);
        grass.moveHorizontal(-60);
        
        //Make the sky
        sky.makeVisible();
        sky.changeColor("blue");
        sky.changeSize(600);
        sky.moveVertical(-200);
        sky.moveHorizontal(-60);
        
        //set up the building
        building.makeVisible();
        building.changeSize(150);
        building.moveVertical(300);
        building.changeColor("red");
        
        //Set up the roof
        roof.makeVisible();
        roof.changeSize(100, 300);
        roof.moveHorizontal(85);
        roof.moveVertical(240);
        roof.changeColor("black");
        
        //Set up the lower half of the door
        door1.makeVisible();
        door1.changeColor("black");
        door1.changeSize(30);
        door1.moveVertical(420);
        door1.moveHorizontal(60);
        
        //Set up the top half of the door
        door2.makeVisible();
        door2.changeColor("black");
        door2.moveVertical(400);
        door2.moveHorizontal(60);
        
        //Make a window
        window.makeVisible();
        window.moveHorizontal(95);
        window.moveVertical(300);
        window.changeSize(40);
        
        //Make a door handle
        doorHandle.makeVisible();
        doorHandle.changeColor("yellow");
        doorHandle.changeSize(5);
        doorHandle.moveHorizontal(100);
        doorHandle.moveVertical(410);
        
        //make eyeball
        eyeball.makeVisible();
        eyeball.changeSize(10);
        eyeball.changeColor("black");
        eyeball.moveVertical(310);
        eyeball.moveHorizontal(120);
       
        
    }
}
