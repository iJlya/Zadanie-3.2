public class BmiService {

    public int calculate(int weightInKg, double growthInMeters) {
        double bmi = weightInKg / growthInMeters / growthInMeters;
        return (int) bmi;
    }
}
