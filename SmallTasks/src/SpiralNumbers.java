public class SpiralNumbers {
    //Construct a square matrix with a size N × N containing
    // integers from 1 to N * N in a spiral order, starting from top-left and in clockwise direction.
    int[][] spiralNumbers(int n) {

        int[][] spiral = new int[n][n];
        int dig = 1;
        int startX = 0, endX = n-1;
        int startY = 0, endY = n-1;

        while(dig <= n*n){
            for(int i = startX; i <= endX; i++){
                spiral[startY][i] = dig++;
            }
            for(int i = startY+1; i <= endY; i++){
                spiral[i][endX] = dig++;
            }
            for(int i = endX-1; i >= startX; i--){
                spiral[endY][i] = dig++;
            }
            for(int i = endY-1; i >= startY+1; i--){
                spiral[i][startX] = dig++;
            }
            startY++;
            startX++;
            endY--;
            endX--;
        }
        return spiral;
    }

}
