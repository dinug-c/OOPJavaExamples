public class Main {
    public static void main(String[] args) {
        Animals Elang = new Animals("Elang");
        Animals Kucing = new Animals("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
