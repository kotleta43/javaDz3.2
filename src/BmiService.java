public class BmiService {
    public int calculate(int bmiIndex) {
        double heightInMeters = 1.87;
        double weightInKilograms = 103.00;
        int result = (int) (weightInKilograms / (heightInMeters * heightInMeters));
        return result;
    }
}
