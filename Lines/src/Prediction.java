import java.util.ArrayList;
import java.util.List;

public class Prediction {
    private List<Point> points;

    public Prediction(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    private static double averageX(List<Point> points) {
        double sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += points.get(i).getX();
        }
        return sum / points.size();
    }

    private static double averageY(List<Point> points) {
        double sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += points.get(i).getY();
        }
        return sum / points.size();
    }

    public double linearRegressionPrediction(double x) {

        double xAvg = averageX(points);
        double yAvg = averageY(points);

        double sumDifferences = 0;
        double sumSquares = 0;

        for (Point point : points) {
            sumDifferences += (point.getY() - yAvg) * (point.getX() - xAvg);
            sumSquares += ((point.getX() - xAvg) * (point.getX() - xAvg));
        }

        double slope = sumDifferences / sumSquares;
        double intercept = yAvg - slope * xAvg;

        System.out.println("Your equation is; \n" + "y = " + slope + "x + " + intercept);

        return slope * x + intercept;
    }

}
