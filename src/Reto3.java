public class Reto3 {
    public static void main(String[]args) {

        String[][] num = {{"_","_","_","_","_","_"},{"|"," "," "," "," ","|"},{"|","_","_","_","_","|"},{"|","(",")","%","c","|"},{"|","7", "8", "9","/","|"}, {"|","6","5","4","x","|"}, {"|","1", "2", "3","-","|"},{"|","0",",","=","+","|"},{"|","_","_","_","_","|"}};
        



        for(int i=0; i < num.length; i++){

            for(int j=0; j < num[i].length; j++){


                System.out.print(num[i][j] + " ");
                
            }


            System.out.println();
        }
        
    }
}
