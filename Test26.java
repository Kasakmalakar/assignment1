public class Test26 {
    public static void main(String[] args) {
        int plenght=120;
        float pbreath=2.4f;
        int blenght=24,bbreadth=15;
        float parea=plenght*100*pbreath*100;//convert it into cm 
        float barea;
        barea=blenght*bbreadth;
        float nofbrick;
        nofbrick=parea/barea;
        System.out.println("number of bricks are: "+nofbrick);
        

        
    }
}
