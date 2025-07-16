// 35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
public class Test35 {
    public static void main(String args[]) {
        int height=12;
        float radius=7.7f;
        double surfacearea;
        surfacearea=2*3.14*radius*(radius+height);
        System.out.println("surface area is: "+surfacearea);
        
    }
}
