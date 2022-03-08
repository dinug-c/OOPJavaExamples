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

        Hewan kucing = new Hewan(2);
        kucing.makan();
        kucing.jalan();
        kucing.lari();
        System.out.println("Umurnya adalah " + kucing.getUmur());
        
        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    
        KelasA kelasA = new KelasA();
        System.out.println(kelasA.functionB());
        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
