public class BmiService {
    // Метод для расчёта BMI
    public int calculate(double weightKg, double heightM) {
        double bmi = weightKg / (heightM * heightM); // Формула расчёта BMI
        return (int) bmi; // Приведение к целому числу
    }
}