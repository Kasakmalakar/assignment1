public class Test23 {
    public static void main(String args[]) {
        int side=3;
        int length=15,breadth=9,height=12;
        int cubev,cartonv;
        cubev=side*side*side;
        cartonv=length*breadth*height;
        int nobox;
        nobox=cartonv/cubev;
        System.out.println("number of boxes are: "+nobox);}

    
}
