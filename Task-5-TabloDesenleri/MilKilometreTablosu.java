public class MilKilometreTablosu {
    public static void main(String[] args) {
        System.out.println("Mil\tKilometre");
        for (int mil = 1; mil <= 10; mil++) {
            double kilometre = mil * 1.60934;
            System.out.printf("%d\t%.5f\n", mil, kilometre);
        }
    }
}
