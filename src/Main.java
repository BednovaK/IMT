public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double imt = service.calculate(50.3, 1.63);
        System.out.println("Ваш ИМТ");
        System.out.println(imt);
    }
}

