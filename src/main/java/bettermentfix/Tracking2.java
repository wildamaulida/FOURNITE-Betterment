package bettermentfix;

public class Tracking2 {
    private static  double pengeluaran = 75000000;
    private static  double pemasukan = 47500000;
    private double nominal;
    private String tanggal;

    public Tracking2(double nominal, String tanggal) {
        this.nominal = nominal;
        this.tanggal = tanggal;
    }
    public Tracking2(double pengeluaran, double pemasukan) {
        Tracking2.pengeluaran = pengeluaran;
        Tracking2.pemasukan = pemasukan;
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
        Tracking2.pengeluaran = pengeluaran;
    }
    public static double getPemasukan() {
        return pemasukan;
    }

    public static void setPemasukan(double pemasukan) {
        Tracking2.pemasukan = pemasukan;
    }
}
