import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = 50; // dinero total de tu cuenta
        int h = 0;  // Cuenta ajena 1
        int a = 0;  // Cuenta ajena 2
        int b = 0;  // Cuenta ajena 3
        int c = 0;  // Cuenta ajena 4
        boolean x = true;
        while (x) {
            System.out.println("Presione 1,2,3 depende de la cantidad de dinero que desea ingresar en las cuentas.");
            System.out.println("Presione 4 para saber el dinero de cada cuenta.");
            System.out.println("Presione 5 si desea salir de la operacion.");

            int n = s.nextInt();
            if (n == 1) {
                if (g > 10) {
                    g = g - 10;
                    h = h + 5;
                    a = a + 5;
                } else {
                    System.out.println("Te quedan 40 euros en tu cuenta ");
                }
            } else if (n == 2) {
                if (g > 7) {
                    g = g - 7;
                    h = h + 3;
                    b = b + 4;
                } else {
                    System.out.println("Te quedan 30 euros en tu cuenta");
                }
            } else if (n == 3) {
                if (g > 20) {
                    g = g - 20;
                    h = h + 10;
                    c = c + 10;
                } else {
                    System.out.println("Te quedan 20 euros en tu cuenta");
                }
            } else if (n == 4) {
                System.out.println(g);
                System.out.println(h);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (n == 5) {
                x = false;
            }
            if (g < 0) {
                System.out.println("end");
                x = false;
            }
        }
    }
}
