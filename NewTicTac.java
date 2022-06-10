import java.util.Scanner;

/**
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-08
*/

class TicTacToe{

      public static String display(String[][] b) {
            String r = "";
            r += "    0   1   2 \n";
            for (int i = 0; i < b.length; i++) {
                  r += i + "|"; //numeraçãoi lateral mais primeira barra da linha
                  for (int j = 0; j < b[i].length; j++) {
                        r += b[i][j]; //imprime o valor de cada coluna na linha
                  }
                  r += "|\n"; //ultima barra da linha + nova linha
            }
            return r;
      }

      public static void main(String args[]){

            Scanner sc;

            System.out.printf("    0   1   2 \n");
            System.out.printf("0     |   |   \n");
            System.out.printf("   ---|---|---\n");
            System.out.printf("1     |   |   \n");
            System.out.printf("   ---|---|---\n");
            System.out.printf("2     |   |   \n");

      }
}
