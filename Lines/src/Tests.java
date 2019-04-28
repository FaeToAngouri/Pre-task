
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void Test1 () {
        Point point1 = new Point(1, 2);
        Point point2 = new Point (2, 4);
        Point point3 = new Point (3, 5);
        Point point4 = new Point (4, 4);
        Point point5 = new Point (5, 5);

        List<Point> points = new ArrayList<>();

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);

        Prediction prediction = new Prediction(points);

        assert(prediction.linearRegressionPrediction(0) == 2.2);
    }
}
