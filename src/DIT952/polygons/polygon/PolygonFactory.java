package DIT952.polygons.polygon;

/**
 * Created by asam82 on 2016-02-17.
 */
public class PolygonFactory {
    public static Polygon createTriangle(int x, int y){
        return new Triangle(x,y);
    }
    public static Rectangle createRectangle(int x, int y){
        return new Rectangle(x,y);
    }
    public static Square createSquare(int x, int y){
        return new Square(x,y);
    }
}
