public class ChessKnight {
    //Given a position of a knight on the standard chessboard,
    // find the number of different moves the knight can perform.
    //The knight can move to a square that is two squares horizontally
    // and one square vertically, or two squares vertically and one square
    // horizontally away from it. The complete move therefore looks like the letter L.
    // Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
    int chessKnight(String cell) {

        int let = cell.charAt(0)-'a';
        int num = cell.charAt(1)-'0'-1;
        int move = 0;

        for(int i = -2; i <= 2; i++){
            for(int j = -2; j <= 2; j++){
                if(Math.abs(i*j) == 2){
                    if((let+i)>=0 && (let+i)<=7 &&
                            (num+j)>=0 && (num+j)<=7)
                        move++;
                }
            }
        }
        return move;
    }

}
