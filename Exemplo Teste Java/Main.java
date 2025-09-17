import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
     int A;
     int B;
     int X;
     
     Scanner s = new Scanner(System.in);
     
     System.out.println("Informe dois números inteiros: ");
     System.out.println("1° número: ");
     A = s.nextInt();
     System.out.println("2° número: ");
     B = s.nextInt();
     X = A + B;
     System.out.println("X = " + X);
     
    }
 
}