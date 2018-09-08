package opgave_a_1;
public class Opgave_A_1 {
    public static void main(String[] args) {
        double pi = 3.141592;
        for (int i=1; i<=5; i++){
         System.out.println("Area of a circle with radius " + i + " is " + (pi*(Math.pow(i, 2))));
        }
    }
    
}
