package bettermentfix;

public class Tracking1 {
    private static double pengeluaran = 40500000;
    private static double pemasukan = 55500000;
    private double nominal;
    private String tanggal;

    
    
    public Tracking1(double nominal, String tanggal) {
        this.nominal = nominal;
        this.tanggal = tanggal;
    }
    public Tracking1(double pengeluaran, double pemasukan) {
        Tracking1.pengeluaran = pengeluaran;
        Tracking1.pemasukan = pemasukan;
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
        Tracking1.pengeluaran = pengeluaran;
    }
    public static double getPemasukan() {
        return pemasukan;
    }
    public static void setPemasukan(double pemasukan) {
        Tracking1.pemasukan = pemasukan;
    }

    
    
}
