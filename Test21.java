public class Test21 {
    public static void main(String[] args) {
        int blength=15,bbreadth=8,bheight=5;
        int wlength=15,wbreadth=10,wheight=8;
        long bvolume,wvolume;
        bvolume=blength*bbreadth*bheight;
        wvolume=wlength*wbreadth*wheight*1000000;// to convert it into cm
        long nofbrick;
        nofbrick=wvolume/bvolume;
        System.out.println("number of bricks is :"+nofbrick);
    }
}
