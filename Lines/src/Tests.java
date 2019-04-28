
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void Test1 () {
        List<Slope> slopes = new ArrayList<>();
        Slope slope1 = new Slope (1.0, 2.0, 3.0, 4.0); // (1 , 3) ~ (2 , 4)
        Slope slope2 = new Slope (2.0, 3.0, 4.0, 5.0); // (2 , 4) ~ (3 , 5)
        Prediction prediction = new Prediction(slope1);
        prediction.addSlope(slope2);
        assert(prediction.averageSlope(1) == 3);
    }
}
