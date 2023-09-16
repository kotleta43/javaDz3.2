public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmiIndex = 0;
        int bmi = service.calculate(bmiIndex);
        System.out.println(bmi);
    }
}