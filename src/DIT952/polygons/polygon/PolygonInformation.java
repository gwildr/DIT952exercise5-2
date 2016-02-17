package DIT952.polygons.polygon;
import java.awt.*;
/**
 * Created by asam82 on 2016-02-17.
 */
public class PolygonInformation {
    public static Point getPolygonCenter(Polygon p){
        return new Point(p.getCenterPoint());
    }
}
