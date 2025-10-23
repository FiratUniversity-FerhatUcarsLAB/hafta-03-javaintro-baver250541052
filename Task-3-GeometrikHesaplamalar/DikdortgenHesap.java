public class DikdortgenHesap {
    public static void main(String[] args) {
        double uzunluk = 7.9;
        double genislik = 4.5;

        // Alan Hesapla
        double alan = uzunluk * genislik;

        // Cevre Hesapla
        double cevre = 2 * (uzunluk + genislik);

        // Sonuclari Yazdir
        System.out.printf("Dikdortgenin Alani: " + "%.4f\n", alan);
        System.out.println("Dikdortgenin Cevresi: " + cevre);
    }
}
