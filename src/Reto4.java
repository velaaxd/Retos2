import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        int [][] n = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        String[][] x = new String[4][4];
        String[][] o = new String[4][4];
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < o.length; j++) {

                
                System.out.print("Ingrese su producto [" + i + "][" + j + "]: ");
                x[i][j] = Leer.nextLine();
                System.out.println("Ingrese valor del producto ["+i+"]["+j+"]");
                o[i][j] = Leer.nextLine();
                
                
            }
        }

        

        
        
        System.out.println("su catalogo es : ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < o.length; j++) {

                

                

                
                System.out.print(n[i][j]  +"  "+x[i][j] + " con un precio de : ");
                

                System.out.print(" "+ o[i][j] + "  ");

            }
            System.out.println();
        }
        
        Leer.close();
    }


    
}
