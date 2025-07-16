//38. The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
public class Test38 {
    public static void main(String args[]) 
    {
        int cvolume=1287,radius=10;
        double height, surfacearea;
        height=cvolume/(Math.PI*radius*radius);
        System.out.println("height of cylinder is: "+height);
        surfacearea=2*Math.PI*radius*(radius+height);
        System.out.println("surface area is: "+surfacearea);
    }
    
}
