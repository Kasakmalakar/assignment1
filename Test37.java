//37. The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
public class Test37 {
    public static void main(String args[]) {
        int sarea=149, height=6;// surface= lateral surface area
        double radius;
        radius=sarea/(2*Math.PI*height);
        double diameter;
        diameter=2*radius;
        System.out.println(" diameter is: "+diameter);
        
        
        
    }
    
}
