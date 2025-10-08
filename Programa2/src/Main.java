import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // En el int x creamos un numero al azar que se guarda en la variable x.
    int x = (int)(Math.random() * 10 + 1);

    int y = 0;

    // El bucle se repite hasta que el valor que usuario que introduzca el usuario sea igual a el valor x.
        // Cada print indica si el valor introducido por el usuario es >, <, = al numero al azar.
    while (y != x) {
        y = s.nextInt();
        if (y == x)
            System.out.println("El valor que has introducido es igual al numero al azar");
        else if (y > x)
            System.out.println("El valor que has introducido es mayor al numero al azar");
        else
            System.out.println("El valor que has introducido es menor al numero al azar");
    }
}}