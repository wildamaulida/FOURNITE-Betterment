package bettermentfix;

public class Pengguna {
    String namaLengkap;
    String email;
    String noTelepon;
    String kataSandi;

    

    public Pengguna(String namaLengkap, String email, String noTelepon, String kataSandi) {
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.noTelepon = noTelepon;
        this.kataSandi = kataSandi;
    }
    public String getNamaLengkap() {
        return namaLengkap;
    }
    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNoTelepon() {
        return noTelepon;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public String getKataSandi() {
        return kataSandi;
    }
    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    
}
