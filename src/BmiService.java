public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        int result = (int) (weightInKilograms / (heightInMeters * heightInMeters));
        return result;
    }
}
