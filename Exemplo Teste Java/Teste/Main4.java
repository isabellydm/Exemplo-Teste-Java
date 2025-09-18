import java.util.Scanner;

class Main4 {

    public static void main (String[] args) {

        double a;
        double b;
        double c;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe a nota de cada aluno: ");
        System.out.println("Nota A: ");
        a = s.nextDouble();
        System.out.println("Nota B: ");
        b = s.nextDouble();
        System.out.println("Nota C: ");
        c = s.nextDouble();
        double media = (a * 2 + b * 3 + c * 5) / 10;
        System.out.println("MEDIA = " + media);
    }
}