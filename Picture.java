/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square boxOutline;
    private Square boxInline;
    private Triangle triOutline;
    private Triangle triInline;
    private Circle circleOutline;
    private Circle circleInline;
    private Person guy;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        circleOutline = new Circle(108,7);
        circleOutline.changeColor("blue");
        circleOutline.changeSize(283);
        circleOutline.makeVisible();
        
        circleInline = new Circle(108,7);
        circleInline.changeColor("white");
        circleInline.changeSize(263);
        circleInline.moveHorizontal(10);
        circleInline.moveVertical(10);
        circleInline.makeVisible();
        
        boxOutline = new Square(150,50);
        boxOutline.changeColor("blue");
        boxOutline.changeSize(200);
        boxOutline.makeVisible();
        
        boxInline = new Square(150,50);
        boxInline.changeColor("white");
        boxInline.moveHorizontal(10);
        boxInline.moveVertical(10);
        boxInline.changeSize(180);
        boxInline.makeVisible();

        triOutline = new Triangle(250,60);
        triOutline.changeColor("blue");
        triOutline.changeSize(180, 180);
        triOutline.makeVisible();
        
        triInline = new Triangle(250,60);
        triInline.changeColor("white");
        triInline.changeSize(160, 160);
        triInline.moveVertical(15);
        triInline.makeVisible();
        
        guy = new Person(250, 150);
        guy.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (boxOutline != null)   // only if it's painted already...
        {
            boxOutline.changeColor("black");
            boxInline.changeColor("white");
            triOutline.changeColor("black");
            triInline.changeColor("white");
            circleOutline.changeColor("black");
            circleInline.changeColor("white");
            guy.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (boxOutline != null)   // only if it's painted already...
        {
            boxOutline.changeColor("blue");
            boxInline.changeColor("blue");
            triOutline.changeColor("blue");
            triInline.changeColor("white");
            circleOutline.changeColor("blue");
            circleInline.changeColor("white");
            guy.changeColor("black");
        }
    }
}
