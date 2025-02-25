// Add class comment and @tags
/** @author larissa
 *  @version 6/21/22
 **/ 

public class Cylinder extends CircularShapeWithHeight 
{
    /** This is cylinder constructor
     *  @param radius this is radius parameter
     *  @param height this is height parameter
    **/
    public Cylinder (double radius, double height){
        super(radius, height);
    }
    /** This is cylinder method **/
    public Cylinder(){
        super(0,0);
    }
    
    /** This is get volume method 
     *  @return height area this return height and area of cone
    **/
    @Override
    public double getVolume() {
        return getHeight() * getCrossSectionArea();
    }
    
    /** This is get surface area method  
     *  @return perimeter height area this return perimeter, height, and area of cone
    **/
    public double getSurfaceArea(){
        return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
    }
}
