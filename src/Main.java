public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // Создаём объект сервиса
        double weight = 98; // Вес в килограммах
        double height = 1.87; // Рост в метрах
        int bmi = service.calculate(weight, height); // Вызываем метод для расчёта BMI
        System.out.println(bmi); // Выводим результат в консоль
    }
}