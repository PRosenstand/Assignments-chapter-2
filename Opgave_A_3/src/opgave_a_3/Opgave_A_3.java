package opgave_a_3;
public class Opgave_A_3 {
    public static void main(String[] args) {
        double man = 21.5;
        double tir = 23.7;
        double ons = 19.6;
        double tor = 22.5;
        double fre = 25.3;
        double lør = 21.7;
        double søn = 18.9;
        
        System.out.println("Forskellen mellem Mandags og Tirsdags temperatur var: " + (tir-man));
        System.out.println("Forskellen mellem Tirsdags og Onsdags temperatur var: " + (ons-tir));
        System.out.println("Forskellen mellem Onsdags og Torsdags temperatur var: " + (tor-ons));
        System.out.println("Forskellen mellem Torsdags og Fredags temperatur var: " + (fre-tor));
        System.out.println("Forskellen mellem Fredags og Lørdags temperatur var: " + (lør-fre));
        System.out.println("Forskellen mellem Lørdags og Søndags temperatur var: " + (søn-lør));
    }
    
}
