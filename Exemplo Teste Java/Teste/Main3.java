import java.io.IOException;
import java.util.Scanner;

public class Main3 {
 
    public static void main(String[] args) throws IOException {
 
        int a;
        int b;

        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe dois valores inteiros: ");
        a = s.nextInt();
        b = s.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        
    }
 
}