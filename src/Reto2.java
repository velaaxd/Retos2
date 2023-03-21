import java.util.*;

public class Reto2 {

    

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        

        String[] palabras = {"agua", "fuego", "huevo", "leche", "olla", "estufa"};

        String palabra = palabras[(int)(Math.random() * palabras.length)]; 

        char[] l = new char[palabra.length()]; 
        
        for (int i = 0; i < l.length; i++) {

            l[i] = '_'; 

        }
        
        int intentos = 10;

        
        
        while (intentos > 0) {

            System.out.print("Palabra: ");

            for (int i = 0; i < l.length; i++) {

                System.out.print(l[i] + " ");

            }
            System.out.println("\nIntentos restantes: " + intentos);
            System.out.print("Ingrese una letra: ");
            char letra = Leer.next().charAt(0);
            boolean acierto = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    l[i] = letra; 
                    acierto = true;
                }
            }
            if (!acierto) {
                intentos--;
            }
            boolean palabraCompleta = true;
            for (int i = 0; i < l.length; i++) {
                if (l[i] == '_') {
                    palabraCompleta = false; 
                }
            }
            if (palabraCompleta) {
                System.out.println("adivinaste la palabra!!!!");
                System.out.println( palabra);
                return; 
            }
        }
        System.out.println("has perdido :( La palabra era: " + palabra);
    }
}