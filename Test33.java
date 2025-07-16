//33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.

public class Test33 {
    public static void main(String args[]) {
        int glength=30,gbreadth=20;
        int garea, pw1=3,pw2=4;
        garea=glength*gbreadth;
        int areapw1, areapw2;
        areapw1=pw1*glength;
        areapw2=pw2*gbreadth;
        int overlape=pw1*pw2;
        int patharea=areapw1+areapw2-overlape;
        int garden=garea-patharea;
        System.out.println("area of  usable garden: "+garden+" cms");



        
    }
}
