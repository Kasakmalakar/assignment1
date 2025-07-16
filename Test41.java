//41. I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.

public class Test41 {
    public static void main(String args[]) {
        int height=50, diameter=30;
        int radius=diameter/2;
        double volume;
        volume=3.14*radius*radius*height;
        System.out.println("volume of cylinder is: "+volume);

        
    }
}
