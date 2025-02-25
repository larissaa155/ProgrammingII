//Add class comment and @tags
/** @author larissa
 *  @version 6/21/22
 **/ 
public class CircularCone extends CircularShapeWithHeight 
{
    /** This is circular cone constructor
     *  @param radius this is radius parameter
     *  @param height this is height parameter
    **/
    public CircularCone (double radius, double height){
        super(radius,height);
    }
    
    /** This is circular cone method **/
    public CircularCone(){
        super(0 ,0);
    }
    
    /** This is get volume method 
     *  @return height area this return height and area of cone
    **/
    @Override
    public double getVolume() {
        return (1 * getHeight() * getCrossSectionArea())/3;
    }
    
    /** This is get surface area method  
     *  @return radius height this return radius and height of cone
    **/
    @Override
    public double getSurfaceArea() {
        return Math.PI * getRadius() * Math.sqrt((getRadius() * getRadius())+ (getHeight() * getHeight()));
    }
}
