import java.util.Scanner;
public class potencia {
    public static void main(String[] args) {
        // Inicio de variables
        Scanner scanner = new Scanner(System.in);
        int numero;
        int exponente;
        int resultado;

        // Ingreso de variables con 
        System.out.println("Ingrese la base y el exponente de la potencia");
        numero = scanner.nextInt();
        System.out.print("^");
        exponente = scanner.nextInt();

        for (int i = 0; i < exponente; i++) {
            resultado =+ numero*numero;
        }
        System.out.println(resultado);
        
        scanner.close();
    }
}
