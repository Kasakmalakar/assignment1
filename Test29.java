public class Test29 {
    public static void main(String args[]) {
        int side=10;
        int length=800, breadth=900;
        int tarea,farea;
        tarea= side*side;
        farea=length*breadth;
        int noftiles=farea/tarea;
        System.out.println("number of tiles: "+noftiles);
    }
}
