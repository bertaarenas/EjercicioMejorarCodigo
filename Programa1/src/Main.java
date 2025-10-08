import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dejamos la variable int num3 para +, -, * ya que siempre daran números enteros.
        int num3;

        // Dejamos lavariable double num4 para / ya que nos puede dar un resultado de valor decimal.
        double num4;

        // Para las variables num1, num2 y operacion hay un print para pedir al usuario un valor o una operacion y un scanner para leer los valores del usuario.
        System.out.println("Pon un número entero");
        int num1 = scanner.nextInt();

        System.out.println("Pon un número entero");
        int num2 = scanner.nextInt();

        System.out.println("Indica la operación que desea");
        String operacion = scanner.next();

        // Aqui solamente añadimos en el print "El resultado de la operacion es:" para dar más claridad.

        if (operacion.equals("+")) {
            num3 = num1 + num2;
            System.out.println("El resultado de la operacion es:"+ num3);
        } else if (operacion.equals("-")) {
            num3 = num1 - num2;
            System.out.println("El resultado de la operacion es:"+ num3);
        } else if (operacion.equals("*")) {
            num3 = num1 * num2;
            System.out.println("El resultado de la operacion es:"+ num3);
        } else if (operacion.equals("/")) {
            num4 = (double)num1 / num2;
            System.out.println("El resultado de la operacion es:"+ num4);
        } else {
            System.out.println();
        }
    }
}