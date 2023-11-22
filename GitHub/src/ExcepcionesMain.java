import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa tu edad");

        Ficha a = new Ficha();

        try {
            // Aquí ingresas tu edad
            a.edad = s.nextInt();
            s.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Haz introducido un dígito que no es un número entero");
            System.out.println("Intente de nuevo por favor ");
            System.exit(0);
        }

        try {
            // Aquí ingresas tu nombre
            System.out.println("Ingresa tu Nombre");
            a.nombre = s.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Ha introducido un valor no válido");
            System.out.println("Intente de nuevo por favor ");
            System.exit(0);
        }

        try {
            // Aquí ingresas tu matricula
            System.out.println("Ingresa tu matricula");
            a.matricula = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ha ingresado un valor no válido. Debe ingresar un número entero");
            System.out.println("Intente de nuevo por favor ");
            System.exit(0);
        } finally {
            System.out.println("Tu edad es: " + a.edad);
            System.out.println("Tu nombre es: " + a.nombre);
            System.out.println("Tu matricula: " + a.matricula);
        }
    }
}