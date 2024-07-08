package bettermentfix;

public class InvestasiMode {
    Double nominal;
    String tanggal;
    public InvestasiMode(Double nominal, String tanggal) {
        this.nominal = nominal;
        this.tanggal = tanggal;
    }
    public Double getNominal() {
        return nominal;
    }
    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    
}
