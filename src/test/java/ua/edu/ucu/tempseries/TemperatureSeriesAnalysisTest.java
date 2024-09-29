package ua.edu.ucu.tempseries;

import static org.junit.Assert.*;
import org.junit.Test;

import ua.edu.ucu.apps.tempseries.TempSummaryStatistics;
import ua.edu.ucu.apps.tempseries.TemperatureSeriesAnalysis;

public class TemperatureSeriesAnalysisTest {

    @Test
    public void test() {
        double[] temperatureSeries = {-1.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -1.0;

        double actualResult = seriesAnalysis.average();
        assertEquals(expResult, actualResult, 0.00001);
    }
    

   @Test
   public void testAverageWithOneElementArray() {
       // setup input data and expected result
       double[] temperatureSeries = {-1.0};
       TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
       double expResult = -1.0;

       // call tested method
       double actualResult = seriesAnalysis.average();

       // compare expected result with actual result
       assertEquals(expResult, actualResult, 0.00001);
   }

   @Test(expected = IllegalArgumentException.class)
   public void testAverageWithEmptyArray() {
       double[] temperatureSeries = {};
       TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);

       // expect exception here
       seriesAnalysis.average();
   }

   @Test
   public void testAverage() {
       double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
       TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
       double expResult = 1.0;

       double actualResult = seriesAnalysis.average();

       assertEquals(expResult, actualResult, 0.00001);
   }
   @Test
   public void testDeviation() {
    double[] temperatureSeries = {3.0, -5.0, 1.0, 5.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 6.0;

    double actualResult = seriesAnalysis.deviation();

    assertEquals(expResult, actualResult, 0.00001);
}
    @Test
    public void testDeviationWithOneNumber() {
    double[] temperatureSeries = {3.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 0.0;

    double actualResult = seriesAnalysis.deviation();

    assertEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testDeviationWithLongerInput() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 4.5;

    double actualResult = seriesAnalysis.deviation();

    assertEquals(expResult, actualResult, 0.00001);
    }

    @Test
    public void testMinimum() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.min();

    assertEquals(expResult, actualResult, 0.00001);

    }

    @Test
    public void testMinimumWithOneElement() {
    double[] temperatureSeries = {1.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.min();

    assertEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testMinimumWithEqualElements() {
    double[] temperatureSeries = {1.0,1.0,1.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.min();

    assertEquals(expResult, actualResult, 0.00001);

    }

    @Test
    public void testMaximum() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 10.0;

    double actualResult = seriesAnalysis.max();

    assertEquals(expResult, actualResult, 0.00001);

    }

    @Test
    public void testMaximumWithOneElement() {
    double[] temperatureSeries = {1.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.max();

    assertEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testMaximumWithEqualElements() {
    double[] temperatureSeries = {1.0,1.0,1.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.max();

    assertEquals(expResult, actualResult, 0.00001);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeviationWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
 
        // expect exception here
        seriesAnalysis.deviation();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMinimumWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
 
        // expect exception here
        seriesAnalysis.min();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaximumWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
 
        // expect exception here
        seriesAnalysis.max();
    }
    @Test(expected = IllegalArgumentException.class)
    public void testClosestToZeroWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
 
        // expect exception here
        seriesAnalysis.findTempClosestToZero();
    }
    @Test
    public void testClosestToZero() {
    double[] temperatureSeries = {1.0,-2.0,3.0,4.0,5.0,-6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.findTempClosestToZero();

    assertEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testClosestToZeroWithEqualABS() {
        double[] temperatureSeries = {-0.5,1.0,-1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double expResult = -0.5;
    
        double actualResult = seriesAnalysis.findTempClosestToZero();
    
        assertEquals(expResult, actualResult, 0.00001);
    
        }
    @Test(expected = IllegalArgumentException.class)
    public void testClosestToValueWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    
        // expect exception here
        seriesAnalysis.findTempClosestToValue(0.0);
    }
    @Test
    public void testClosestToValue() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 5.0;

    double actualResult = seriesAnalysis.findTempClosestToValue(4.8);

    assertEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testClosestToValueWithOneElement() {
    double[] temperatureSeries = {1.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double expResult = 1.0;

    double actualResult = seriesAnalysis.findTempClosestToValue(4.8);

    assertEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testLessThanaValue() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {1.0,2.0,3.0,4.0,5.0};

    double[] actualResult = seriesAnalysis.findTempsLessThen(6.0);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testLessThanaValueWithEmptyArray() {
    double[] temperatureSeries = {};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsLessThen(5.5);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testLessThanaValueWithNoLess() {
    double[] temperatureSeries = {5.0,6.0,9.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsLessThen(1.0);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }

    @Test
    public void testGreaterThanaValue() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {6.0,7.0,8.0,9.0,10.0};

    double[] actualResult = seriesAnalysis.findTempsGreaterThen(6.0);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testGreaterThanaValueWithEmptyArray() {
    double[] temperatureSeries = {};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsGreaterThen(5.5);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testGreaterThanaValueWithNoGreater() {
    double[] temperatureSeries = {5.0,6.0,9.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsGreaterThen(10.0);

    assertArrayEquals(expResult, actualResult, 0.00001);
    }
    @Test
    public void testTempsInRange() {
    double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {4.0,5.0,6.0};

    double[] actualResult = seriesAnalysis.findTempsInRange(4.0, 7.0);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testTempsInRangeWithEmptyArray() {
    double[] temperatureSeries = {};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsInRange(4.0, 7.0);

    assertArrayEquals(expResult, actualResult, 0.00001);

    }
    @Test
    public void testGreaterThanaValueWithNoRange() {
    double[] temperatureSeries = {5.0,6.0,9.0};
    TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
    double[] expResult = {};

    double[] actualResult = seriesAnalysis.findTempsInRange(10.0, 12.0);

    assertArrayEquals(expResult, actualResult, 0.00001);
    }
    public void testReset() {
        double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
    
        seriesAnalysis.reset();
    
        assertArrayEquals(expResult, seriesAnalysis.getSeries(), 0.00001);
    
        }
        @Test
        public void testSort() {
        double[] temperatureSeries = {1.0,3.0,2.0,9.0,7.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {1.0,2.0,3.0,7.0,9.0};
    
        double[] actualResult = seriesAnalysis.sortTemps();
    
        assertArrayEquals(expResult, actualResult, 0.00001);
        }
        @Test
        public void testSortWithEmptyArray() {
        double[] temperatureSeries = {};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {};
    
        double[] actualResult = seriesAnalysis.sortTemps();
    
        assertArrayEquals(expResult, actualResult, 0.00001);
        }
        @Test
        public void testSortWithSortedArray() {
        double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        double[] expResult = {1.0,2.0,3.0,4.0,5.0};
    
        double[] actualResult = seriesAnalysis.sortTemps();
    
        assertArrayEquals(expResult, actualResult, 0.00001);

        }
        @Test
        public void testStatistics() {
        double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0};
        TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
        TempSummaryStatistics stat = new TempSummaryStatistics();
        stat.setAvgTemp(seriesAnalysis.average()); 
        stat.setDevTemp(seriesAnalysis.deviation());
        stat.setMinTemp(seriesAnalysis.min());
        stat.setMaxTemp(seriesAnalysis.max());

        // double[] expResult = {1.0,2.0,3.0,4.0,5.0};
    
        // double[] actualResult = seriesAnalysis.sortTemps();
    
        assertEquals(seriesAnalysis.average(), stat.getAvgTemp(), 0.00001);
        assertEquals(seriesAnalysis.deviation(), stat.getDevTemp(), 0.00001);
        assertEquals(seriesAnalysis.min(), stat.getMinTemp(), 0.00001);
        assertEquals(seriesAnalysis.max(), stat.getMaxTemp(), 0.00001);
        
        }
        @Test
        public void testAddTemps() {
            double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
            TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
            double[] added = {11.0, 12.0};
            int expResult = 12;
        
            double actualResult = seriesAnalysis.addTemps(added);
        
            assertEquals(expResult, actualResult, 0.00001);
        }
        @Test
        public void testAddTempsEqualLength() {
            double[] temperatureSeries = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
            TemperatureSeriesAnalysis seriesAnalysis = new TemperatureSeriesAnalysis(temperatureSeries);
            double[] added = {11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0};
            int expResult = 20;
        
            double actualResult = seriesAnalysis.addTemps(added);
        
            assertEquals(expResult, actualResult, 0.00001);
        }





    

}
