package ua.edu.ucu.apps.tempseries;

import lombok.Getter;
// import lombok.Setter;

import java.util.Arrays;
import java.util.InputMismatchException;

@Getter
// @Setter
public class TemperatureSeriesAnalysis {
    private double[] series;

    public double[] getSeries() {
        return Arrays.copyOf(this.series, this.series.length);
    }

    public TemperatureSeriesAnalysis() {
        this.series = new double[0];
    }

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.series = Arrays.copyOf(temperatureSeries, temperatureSeries.length);
    }
    // public double[] getSeries() {
    // return this.series;
    // }

    public double average() {
        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double c = 0;
        for (int i = 0; i < this.series.length; i++) {
            c = c + this.series[i];
        }
        return c / this.series.length;
    }

    public double deviation() {
        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double dev = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (Math.abs(this.series[i] - this.average()) > dev) {
                dev = Math.abs(this.series[i] - this.average());

            }
        }

        return dev;
    }

    public double min() {
        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double m = Double.MAX_VALUE;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] < m)
                m = this.series[i];

        }
        return m;
    }

    public double max() {
        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double m = Double.MIN_VALUE;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] > m)
                m = this.series[i];

        }
        return m;
    }

    public double findTempClosestToZero() {
        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double abs = Double.MAX_VALUE;
        for (int i = 0; i < this.series.length; i++) {
            if (Math.abs(this.series[i]) < abs) {
                abs = this.series[i];
            }
            if (Math.abs(this.series[i]) == abs) {
                if (this.series[i] == Math.abs(this.series[i])) {
                    abs = this.series[i];
                }
            }
        }

        return abs;
    }

    public double findTempClosestToValue(double tempValue) {

        if (this.series.length == 0) {
            throw new IllegalArgumentException("exception");
        }
        double abs = Double.MAX_VALUE;
        for (int i = 0; i < this.series.length; i++) {
            if (Math.abs(this.series[i] - tempValue) < Math.abs(abs - tempValue)) {
                abs = this.series[i];
            }
            if (Math.abs(this.series[i] - tempValue) == Math.abs(abs - tempValue)) {
                if (this.series[i] - tempValue == Math.abs(this.series[i] - tempValue)) {
                    abs = this.series[i];
                }
            }
        }
        return abs;
    }

    public double[] findTempsLessThen(double tempValue) {
        int c = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] < tempValue) {
                c = c + 1;
            }
        }
        double[] arr = new double[c];
        int cd = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] < tempValue) {
                arr[cd] = this.series[i];
                cd = cd + 1;
            }
        }

        return arr;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        int c = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] >= tempValue) {
                c = c + 1;
            }
        }
        double[] arr = new double[c];
        int c1 = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] >= tempValue) {
                arr[c1] = this.series[i];
                c1 = c1 + 1;
            }
        }

        return arr;
    }

    public double[] findTempsInRange(double lowerBound, double upperBound) {
        int c = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] >= lowerBound && this.series[i] < upperBound) {
                c = c + 1;
            }
        }
        double[] arr = new double[c];
        int c1 = 0;
        for (int i = 0; i < this.series.length; i++) {
            if (this.series[i] >= lowerBound && this.series[i] < upperBound) {
                arr[c1] = this.series[i];
                c1 = c1 + 1;
            }
        }

        return arr;
    }

    public void reset() {
        this.series = new double[0];

    }

    public double[] sortTemps() {
        double[] arr = Arrays.copyOf(this.series, this.series.length);
        Arrays.sort(arr);
        return arr;
    }

    public TempSummaryStatistics summaryStatistics() {
        TempSummaryStatistics a = new TempSummaryStatistics();
        a.setAvgTemp(this.average());
        a.setDevTemp(this.deviation());
        a.setMaxTemp(this.max());
        a.setMinTemp(this.min());

        return a;
    }

    public int addTemps(double... temps) {
        int min = -273;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] <= min) {
                throw new InputMismatchException();
            }
        }
        int j = this.series.length;
        this.series = Arrays.copyOf(this.series, 2 * this.series.length);
        for (double i : temps) {
            this.series[j] = i;
            j = j + 1;

        }

        return j;
    }
}
