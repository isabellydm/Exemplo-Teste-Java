import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
     int A;
     int B;
     int X;
     
     Scanner s = new Scanner(System.in);
     
    
     A = s.nextInt();
     B = s.nextInt();
     X = A + B;
     System.out.println("X = " + X);
     
    }
 
}
