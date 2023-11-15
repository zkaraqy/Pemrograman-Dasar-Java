package percabangan;

public class PernyataanIfElseIf {

    public static void main(String args[]) {
        double skorUjian = -40;
        String nilai;
        if (skorUjian >= 90 && skorUjian <= 100) {
            nilai = "A";
            System.out.println("Nilai = " + nilai);
        } else if (skorUjian >= 80 && skorUjian < 90) {
            nilai = "B";
            System.out.println("Nilai = " + nilai);
        } else if (skorUjian >= 70 && skorUjian < 80) {
            nilai = "C";
            System.out.println("Nilai = " + nilai);
        } else if (skorUjian >= 0 && skorUjian < 70) {
            nilai = "D";
            System.out.println("Nilai = " + nilai);
        } else {
            nilai = "Invalid";
            System.out.println(nilai);
        }

        
    }
}
