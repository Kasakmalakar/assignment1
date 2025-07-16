//30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
public class Test30 {
    public static void main(String args[]) {
        int tlength=5,tbreadth=8;
        int flength=200,fwide=400;
        int tarea=tlength*tbreadth;
        int farea=flength*fwide;
        int noftiles=farea/tarea;
        System.out.println("number of tiles is: "+noftiles);

        
    }
}
