public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("Sayi\tKaresi\tKupü");
        for (int i = 1; i <= 10; i++) {
            int karesi = i * i;
            int kupu = i * i * i;
            System.out.println(i + "\t" + karesi + "\t" + kupu);
        }
    }
}
