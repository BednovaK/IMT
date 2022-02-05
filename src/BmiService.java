public class BmiService {
    public double calculate(double weightKg, double heightMetr) {
        double imt = weightKg / (heightMetr * heightMetr);
        return imt;
    }
}
