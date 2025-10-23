public class HesapOzeti {

    public static void main(String[] args) {
        // Hesap bilgileri
        String musteriAdi = "Ahmet Yılmaz";
        String hesapNumarasi = "TR123456789012345678901234";
        double bakiye = 1500.75;
        String sonIslemTarihi = "2023-10-26";
        String sonIslemAciklamasi = "Online Alışveriş";
        double sonIslemTutari = -250.00;

        // Hesap özetini yazdırma
        System.out.println("****************************************");
        System.out.println("          HESAP ÖZETİ");
        System.out.println("****************************************");
        System.out.println("Müşteri Adı: " + musteriAdi);
        System.out.println("Hesap Numarası: " + hesapNumarasi);
        System.out.printf("Güncel Bakiye: %.2f TL\n", bakiye);
        System.out.println("Son İşlem Tarihi: " + sonIslemTarihi);
        System.out.println("Son İşlem Açıklaması: " + sonIslemAciklamasi);
        System.out.printf("Son İşlem Tutarı: %.2f TL\n", sonIslemTutari);
        System.out.println("****************************************");
    }

}
