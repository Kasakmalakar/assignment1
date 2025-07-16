//45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .

public class Test45 {
    public static void main(String args[]) {
        int a1=-21,a2=-18,n=28,d;
        d=a2-a1;
        int sum28;
        sum28=(n/2)*((2*a1)+((n-1)*d));
        System.out.println("the sum of 28 terms of an Arithmetic Progression is: "+sum28);
        
    }
    
}
