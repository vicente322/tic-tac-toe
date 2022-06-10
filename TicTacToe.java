import java.util.Scanner;

/**TicTacToe
*
*A game of TicTacToe
*
*@author v.hofmeister@edu.pucrs.break;
*@version 2022-06-06
*/

class TicTacToe {

      public static String[][] init() {
            String[][] b = new String[3][3];
            for (int i = 0; i < b.length; i++) {
                  for (int j = 0; j < b[i].length; j++) {
                        b[i][j] = " ";
                  }
            }
            return b;
      }

      public static String display(String[][] b) {
            assert b != null;
            String r = "";
            r += "    0   1   2 \n";
            for (int i = 0; i < b.length; i++) {
                  r += i + "   "; //numeraçãoi lateral mais primeiros espaços
                  for (int j = 0; j < b[i].length; j++) {
                        r += b[i][j]; //imprime o valor de cada coluna na linha

                        if(j < 2){
                              r += " | ";
                        }
                  }
                  r += " \n";; //nova linha
                  if (i < 2){
                        r += "   ---|---|---\n";
                  }
            }
            return r;
      }

      public static void set(String[][] b, int i, int j, String p) {
            if (b[i][j].equals(" ")) {
                  b[i][j] = p;
            }
      }

        public static void main(String[] args) {
          Scanner sc;
          String[][] board;
          String player = "x";
          int i, j;

          System.out.println("Jogo da Velha!");
          board = init();
          sc = new Scanner(System.in);
          while (true) {
            System.out.println(display(board));
            i = sc.nextInt();
            if (i < 0)
              break;
            j = sc.nextInt();

            set(board, i, j, player); //Escolhe e muda valor da posição
            if (player.equals("x")) {
              player = "o";
            } else {
              player = "x";
            }

          }
          sc.close();

        }
}
