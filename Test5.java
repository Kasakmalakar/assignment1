 class Test5 {
    public static void main(String[] args) {
        int cost=1600, rate=25,length=20;
        int perimeter,breadth,area;
        perimeter=cost/rate;
        System.out.println("perimeter is: "+perimeter);
        breadth=perimeter/2-length;
        System.out.println("breadth is: "+breadth);
        area= length*breadth;
        System.out.println("area is: "+area);
    }
    
}
