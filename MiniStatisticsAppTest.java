import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniStatisticsAppTest {

@Test 

public void standardDeviationTesting(){
int [] numbers = {2,5,7,8,9,10};

Variance  standardDeviation = new Variance();

double expected = 7.0;
double  actual = standardDeviation.average(numbers);

assertEquals(expected,actual);


}

    
}
