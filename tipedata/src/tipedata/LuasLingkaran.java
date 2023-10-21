package tipedata;

public class LuasLingkaran {

    public static void main(String args[]) {
        final double PI = 3.141592;
        double r = 11.78,
                luasLingkaran = PI * r * r;
        System.out.println("Luas lingaran = PI x r x r");
        System.out.println("(bilangan pecahan) Luas lingaran = " + PI + " x " + r + " x " + r + " = " + luasLingkaran);
        System.out.println("(bilangan bulat) Luas lingaran = " + PI + " x " + r + " x " + r + " = " + (int) luasLingkaran);
        System.out.println("(pembulatan) Luas lingaran = " + PI + " x " + r + " x " + r + " = " + Math.round(luasLingkaran));
        
        
    }
}
