
public class latihan01 {

    public static void main(String args[]) {
        String nama, NIM, status;
        int nilai_MTK, nilai_IPA, nilai_Bahasa, nilai_Total;
        double nilai_rata_rata;

        nama = "Muhammad Azka Raki";
        NIM = "2311016110005";
        nilai_MTK = 55;
        nilai_IPA = 66;
        nilai_Bahasa = 77;
        nilai_Total = nilai_MTK + nilai_IPA + nilai_Bahasa;
        nilai_rata_rata = (nilai_MTK + nilai_IPA + nilai_Bahasa) / 3;

        status = "Tidak Lulus";
        if (nilai_rata_rata >= 60) {
            status = "Lulus";
        }

        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("");
        System.out.println("Nilai:");
        System.out.println("----------------");
        System.out.println("Matematika : " + nilai_MTK);
        System.out.println("IPA        : " + nilai_IPA);
        System.out.println("Bahasa     : " + nilai_Bahasa);
        System.out.println("----------------");

//        nilai_rata_rata = 30;
        System.out.println("Nilai Total: " + nilai_rata_rata + " (nilai rata-rata)");
        System.out.println("Status     : " + status);
//        if (nilai_rata_rata >= 60) {
//            System.out.println("Status     : Lulus");
//        }
//        if (nilai_rata_rata < 60) {
//            System.out.println("Status     : Tidak Lulus");
//        }

    }
}
