public class Test24 {
    public static void main(String[] args) {
        int blength=25,bbreadth=10;
        float bthick=7.5f;
        int wlength=20,wheight=2;
        float wthick=0.75f;
        float bvolume= blength*bbreadth*bthick;
        float wvolume= wlength*100*wheight*100*wthick*100;// to convert it cm
        float nofbrick=wvolume/bvolume;
        System.out.println(" number of bricks required: "+nofbrick);
        float cost=900*nofbrick/1000;
        System.out.println("cost will be: "+cost);

    }
}
