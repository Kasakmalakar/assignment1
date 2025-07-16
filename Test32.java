//32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.

public class Test32 {
    public static void main(String args[]) {
        int gside=150;
        int sside=25;
        int garea,sarea;
        garea=gside*gside;
        sarea=sside*sside;
        int garden;
        garden=garea-sarea;
        System.out.println("area of garden is: "+garden);

        
    }
}
