//Add class comment and @tags
/** @author larissa
 *  @version 6/21/22
 **/ 
public abstract class CircularShapeWithHeight implements Shape3D
{
    private double radius;
    private double height;

    /** This is circular shape with heihht constructor
     *  @param radius this is parameter radius
     *  @param height this is parameter height
    **/
    public CircularShapeWithHeight(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /** This is get diameter method 
     *  @return diameter this return diameter of circle
    **/
    public double getDiameter(){
        return 2 * this.radius;
    }
    
    /** This is get radius method 
     *  @return radius this return radius of circle
    **/
    public double getRadius(){
        return this.radius;
    }
    
    /** This is get height method 
     *  @return height this return height of cone
    **/
    public double getHeight(){
        return this.height;
    }
    
    /** This is set radius method 
     *  @param radius this is parameter radius
    **/
    public void setRadius (double radius){
        this.radius = radius;
    }
    
    /** This is set height method 
     *  @param height this is parameter height
    **/
    public void setHeight (double height){
        this.height = height;
    }

    /** This is get area method 
     *  @return area this return area of circle
    **/
    public double getCrossSectionArea(){
        return Math.PI * getRadius() * getRadius();
    }
    
    /** This is get perimeter method 
     *  @return perimeter this return perimeter of circle
    **/
    public double getCrossSectionPerimeter(){
        return 2 * Math.PI * getRadius();
    }
}
