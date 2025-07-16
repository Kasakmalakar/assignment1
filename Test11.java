 class Test11 {
    public static void main(String[] args) {
        int base,height;
        base = 8;
        height=5;
        int area=320;
        double x;
        x=Math.sqrt((area*2)/(base*height));
        double newbase,newheight;
        newbase=base*x;
        newheight=height*x;
        System.out.println("base is: "+newbase);
        System.out.println("height is: "+newheight);


    }
    
}
