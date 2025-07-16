//39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.

public class Test39 {
    public static void main(String args[]) {
        int diameter=12,height=9;
        int radius=diameter/2;
        double sarea;
        sarea= 2*3.14*radius*(radius+height);
        System.out.println("surface area is: "+sarea);
        
    }
    
}
