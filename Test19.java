public class Test19 {
    public static void main(String[] args) {
        int side=7;
        int length=7,breadth=4,height=8;
        int areacube,areacuboid;
        areacube=side*side*side;
        areacuboid=length*breadth*height;
        int difference;
        difference=areacube-areacuboid;
        System.out.println("area of cube is more by "+difference);

    }
}
