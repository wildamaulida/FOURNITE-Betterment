package bettermentfix;

public class Tracking3 {
    private static  double pengeluaran = 93000000;
    private static  double pemasukan = 28500000;
    private double nominal;
    private String tanggal;

    public Tracking3(double nominal, String tanggal) {
        this.nominal = nominal;
        this.tanggal = tanggal;
    }
    public Tracking3(double pengeluaran, double pemasukan) {
        Tracking3.pengeluaran = pengeluaran;
        Tracking3.pemasukan = pemasukan;
    }
    
    public double getNominal() {
        return nominal;
    }
    public void setNominal(double nominal) {
        this.nominal = nominal;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public static double getPengeluaran() {
        return pengeluaran;
    }
    public static void setPengeluaran(double pengeluaran) {
        Tracking3.pengeluaran = pengeluaran;
    }
    public static double getPemasukan() {
        return pemasukan;
    }
    public static void setPemasukan(double pemasukan) {
        Tracking3.pemasukan = pemasukan;
    }
}
