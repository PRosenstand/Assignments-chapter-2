package opgave_a_2;
public class Opgave_A_2 {
    public static void main(String[] args) {
        double pi = 3.141592;
        for (int i=3; i<=7; i=i+4){
            System.out.println("Perimeter of a circle with radius " + i + " is " + (2*pi*i));
        }
    }
    
}
