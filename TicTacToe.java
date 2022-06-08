
/**TicTacToe
*
*A game of TicTacToe
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-06
*/

public class TicTacToe{

      public static String Display(String[][] b){
            String r = "";
            for (int i = 0; i < b.length; i++){
                  for (int j = 0; j < b[i].length; j++){
                        r += b[i][i];
                  }

                  r += "\n";
            }

            return r;
      }

      public static void main(String args[]){
            String[][] board;

            System.out.println("Jogo da Velha!");

            board = new String [3][3];

            String r = Display(board);

            System.out.println(r);
      }
}
