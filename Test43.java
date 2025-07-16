//43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm

public class Test43 {
    public static void main(String args[]) {
        int height=4, slantheight=5;
        double radius;
        radius=Math.sqrt((slantheight*slantheight) - (height*height));
        double basearea;
        basearea= 3.14*radius*radius;
        double cost= 10* basearea;
        System.out.println("cost of polishing the base cone is: "+cost);

        
    }
}
