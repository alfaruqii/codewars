// Description:

// If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!

// Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:

// [[0, 0, 1],
//  [0, 1, 2],
//  [2, 1, 0]]

// We want our function to return:

//     -1 if the board is not yet finished AND no one has won yet (there are empty spots),
//     1 if "X" won,
//     2 if "O" won,
//     0 if it's a cat's game (i.e. a draw).

// You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.


public class Solution {

    public static int isSolved(int[][] board) {
        // your code here
      boolean diagonalLeft = (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0 && board[1][1] != 0 && board[2][2] != 0);
      boolean diagonalRight = (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0 && board[1][1] != 0 && board[2][0] != 0);
      boolean firstRow = (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][1] == board[0][2] && board[0][2] != 0 && board[0][1] != 0 && board[0][0] != 0);
      boolean secRow = (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][1] == board[1][2] && board[1][0] != 0 && board[1][1] != 0 && board[1][2] != 0);
      boolean thirdRow = (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][1] == board[2][2] && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0);
      boolean firstColumn = (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[1][0] == board[2][0] && board[0][0] != 0 && board[1][0] != 0 && board[2][0] != 0);
      boolean secColumn = (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[1][1] == board[2][1] && board[0][1] != 0 && board[1][1] != 0 && board[2][1] != 0);
      boolean thirdColumn = (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[1][2] == board[2][2] && board[0][2] != 0 && board[1][2] != 0 && board[2][2] != 0);
      if(diagonalLeft)
        return board[0][0];
      if(diagonalRight)
        return board[0][2];
      if(firstRow)
        return board[0][0];
      if(secRow)
        return board[1][0];
      if(thirdRow)
        return board[2][0];
      if(firstColumn)
        return board[0][0];
      if(secColumn)
        return board[0][1];
      if(thirdColumn)
        return board[0][2];
      if(!diagonalRight && !diagonalLeft && !firstRow && !secRow && !thirdRow && !firstColumn && !secColumn && !thirdColumn){
        for(int i=0;i<board.length;i++){
          for(int item : board[i]){
            if(item == 0){
              System.out.println("masuk");
              return -1;
            }
          }
        }
      }
      return 0;
    }

}
