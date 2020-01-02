public class Minesweeper {
    //In the popular Minesweeper game you have a board with some mines and those cells that
    // don't contain a mine have a number in it that indicates the total number of mines in the
    // neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.
    int[][] minesweeper(boolean[][] matrix) {

        int[][] mine = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){

                for (int x = Math.max(0, i-1); x <= Math.min(i+1, matrix.length-1); x++){
                    for (int y = Math.max(0, j-1); y <= Math.min(j+1, matrix[0].length-1); y++) {

                        if (matrix[x][y] && (i!=x || j!=y))
                            mine[i][j]++;
                    }
                }
            }
        }
        return mine;
    }
}
