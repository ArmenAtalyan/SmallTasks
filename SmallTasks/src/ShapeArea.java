public class ShapeArea {
    //Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
    int shapeArea(int n) {

        int area = 1;

        while(n > 1){
            area += (n - 1) * 4;
            n--;
        }
        return area;
    }
}
