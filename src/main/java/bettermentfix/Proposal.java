package bettermentfix;

public class Proposal {
    String namaPerusahaan;
    String namaBisnis;
    String deskripsi;
    String dana;
    String file;

    public Proposal(String namaPerusahaan, String namaBisnis, String deskripsi, String dana) {
        this.namaPerusahaan = namaPerusahaan;
        this.namaBisnis = namaBisnis;
        this.deskripsi = deskripsi;
        this.dana = dana;
    }
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    public String getNamaBisnis() {
        return namaBisnis;
    }
    public void setNamaBisnis(String namaBisnis) {
        this.namaBisnis = namaBisnis;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public String getDana() {
        return dana;
    }
    public void setDana(String dana) {
        this.dana = dana;
    }
    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }
}
