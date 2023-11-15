package method;

public class Kubus {

    public static void main(String args[]) {
        double s = 4;
//        double volume = hitungVolume(3);
        double luasAlas = hitungLuasAlas(s);
//        System.out.println(volume);
        System.out.println("Luas Alas sisi " + s + " adalah " + luasAlas);
//        System.out.println(hitungVolume(3));
    }

    public static double hitungVolume(double sisi) {
        double hasil = sisi * sisi * sisi;
        return hasil;
//        return sisi * sisi * sisi;
    }
    
    public static double hitungLuasAlas(double sisi) {
        double hasil = sisi * sisi;
        return hasil;
    }
}
