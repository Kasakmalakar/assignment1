//34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
public class Test34 {
    public static void main(String args[]) {
        int base1=128,base2=92,height=40;
        int areat=(base1+base2)*height/2;
        int wwide=4;
        int areaw= wwide*height;
        int totalarea;
        totalarea=areat+areaw;
        System.out.println("total area is: "+totalarea);

        
    }
}
