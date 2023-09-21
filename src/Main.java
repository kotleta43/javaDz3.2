public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(1.87, 111);
        System.out.println(bmi);
    }
}