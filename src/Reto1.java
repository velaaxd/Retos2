import java.util.Scanner;

    public class Reto1 {
        public static void main(String[] args) {
            Scanner Leer = new Scanner(System.in);

            //se declaran variables

        String palabra;
        String palabraa="";

        System.out.println("Ingrese una palabra:");
        palabra = Leer.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--) {

            palabraa += palabra.charAt(i);
        }
        //si la palabra es igual a palabraa se imprime
        if (palabra.equals(palabraa)) {
            System.out.println("La palabra se lee igual al derecho y al reves es un palindromo.");
            //sino
        } else {
            System.out.println("La palabra no es palindromo.");
        }
        Leer.close();
    }
}