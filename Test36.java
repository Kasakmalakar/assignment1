//36. What is the surface area of a cylinder if the diameter is 15m height is 7m?
public class Test36 {
    public static void main(String args[]) {
        int diameter=15,height=7;
        float radius=diameter/2;
        double surfacearea;
        surfacearea=2*3.14*radius*(radius+height);
        System.out.println("surface area is: "+surfacearea);

        
    }
    
}
