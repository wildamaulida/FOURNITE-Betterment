package bettermentfix;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVReader {

    ArrayList<Pengguna> pengguna = new ArrayList<>();
    ArrayList<Proposal> proposal = new ArrayList<>();
    ArrayList<Tracking1> tracking = new ArrayList<>();
    ArrayList<Tracking2> tracking22 = new ArrayList<>();
    ArrayList<Tracking3> tracking4 = new ArrayList<>();

    public static void main(String[] args) {
        
    }
    public void readBukuCSVData(){
        String csvFile = "src/main/java/bettermentfix/Register.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] register = line.split(cvsSplitBy);
                Pengguna pengguna2 = new Pengguna(register[0], register[1], register[2], register[3]);
                pengguna.add(pengguna2);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Pengguna> getBukuCSVData(){
        readBukuCSVData();
        return pengguna;
    }
    public void addPenggunaToCSV(Pengguna penggunaBaru) {
        String csvFile = "src/main/java/bettermentfix/Register.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(penggunaBaru.getNamaLengkap() + "," +
                           penggunaBaru.getEmail() + "," +
                           penggunaBaru.getNoTelepon() + "," +
                           penggunaBaru.getKataSandi());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readBukuCSVData2(){
        String csvFile = "src/main/java/bettermentfix/RegisterCompany.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] register = line.split(cvsSplitBy);
                Pengguna pengguna2 = new Pengguna(register[0], register[1], register[2], register[3]);
                pengguna.add(pengguna2);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Pengguna> getBukuCSVData2(){
        readBukuCSVData2();
        return pengguna;
    }
    public void addPenggunaToCSV2(Pengguna penggunaBaru) {
        String csvFile = "src/main/java/bettermentfix/RegisterCompany.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(penggunaBaru.getNamaLengkap() + "," +
                           penggunaBaru.getEmail() + "," +
                           penggunaBaru.getNoTelepon() + "," +
                           penggunaBaru.getKataSandi());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writePenggunaListToCSV(List<Pengguna> penggunaList) {
        String csvFile = "src/main/java/bettermentfix/Register.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile))) {
            writer.println("Nama Lengkap,Email,No Telepon,Kata Sandi");
            for (Pengguna pengguna : penggunaList) {
                writer.println(pengguna.getNamaLengkap() + "," +
                               pengguna.getEmail() + "," +
                               pengguna.getNoTelepon() + "," +
                               pengguna.getKataSandi());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readProposalCSVData(){
        String csvFile = "src/main/java/bettermentfix/Proposal.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] proposal3 = line.split(cvsSplitBy);
                Proposal proposal2 = new Proposal(proposal3[0], proposal3[1], proposal3[2], proposal3[3]);
                proposal.add(proposal2);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Proposal> getProposalCSVData(){
        readProposalCSVData();
        return proposal;
    }
    public void addProposalToCSV(Proposal proposalBaru) {
        String csvFile = "src/main/java/bettermentfix/Proposal.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(proposalBaru.getNamaPerusahaan() + "," +
                           proposalBaru.getNamaBisnis() + "," +
                           proposalBaru.getDeskripsi() + "," +
                           proposalBaru.getDana());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addTransactionToCSV(double pengeluaran, double pemasukan) {
        String csvFile = "src/main/java/bettermentfix/Tracking1.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(pengeluaran + "," + pemasukan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readTransactionCSVData() {
        tracking.clear();
        String csvFile = "src/main/java/bettermentfix/Tracking1.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] trackingData = line.split(cvsSplitBy);
                double pengeluaran = Double.parseDouble(trackingData[0].trim());
                double pemasukan = Double.parseDouble(trackingData[1].trim());
                Tracking1 trackingObj = new Tracking1(pengeluaran, pemasukan);
                tracking.add(trackingObj);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public List<Tracking1> getTrackingData() {
        readTransactionCSVData();
        return tracking;
    }
    public void addTransactionToCSV2(double pengeluaran, double pemasukan) {
        String csvFile = "src/main/java/bettermentfix/Tracking2.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(pengeluaran + "," + pemasukan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readTransactionCSVData2() {
        tracking.clear();
        String csvFile = "src/main/java/bettermentfix/Tracking2.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            Tracking2 initialData = new Tracking2(Tracking2.getPengeluaran(), Tracking2.getPemasukan());
            tracking22.add(initialData);
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] trackingData = line.split(cvsSplitBy);
                double pengeluaran = Double.parseDouble(trackingData[0].trim());
                double pemasukan = Double.parseDouble(trackingData[1].trim());
                Tracking2 trackingObj = new Tracking2(pengeluaran, pemasukan);
                tracking22.add(trackingObj);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
    public List<Tracking2> getTrackingData2() {
        readTransactionCSVData2();
        return tracking22;
    }
    public void addTransactionToCSV3(double pengeluaran, double pemasukan) {
        String csvFile = "src/main/java/bettermentfix/Tracking3.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(pengeluaran + "," + pemasukan);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readTransactionCSVData3() {
        String csvFile = "src/main/java/bettermentfix/Tracking3.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            Tracking3 initialData = new Tracking3(Tracking3.getPengeluaran(), Tracking3.getPemasukan());
            tracking4.add(initialData);
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] trackingData = line.split(cvsSplitBy);
                double pengeluaran = Double.parseDouble(trackingData[0].trim());
                double pemasukan = Double.parseDouble(trackingData[1].trim());
                Tracking3 trackingObj = new Tracking3(pengeluaran, pemasukan);
                tracking4.add(trackingObj);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public List<Tracking3> getTrackingData3() {
        readTransactionCSVData3();
        return tracking4;
    }
    public void addInvestasiToCSV1(String tanggal, double nominalInvestasi) {
        String csvFile = "src/main/java/bettermentfix/Investasi1.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(tanggal + "," + nominalInvestasi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Tracking1> readInvestasiCSV1() {
        List<Tracking1> trackingList = new ArrayList<>();
        String csvFile = "src/main/java/bettermentfix/Investasi1.csv";
        String line = "";
        String cvsSplitBy = ",";
    
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip header if exists
            while ((line = br.readLine()) != null) {
                String[] trackingData = line.split(cvsSplitBy);
                String tanggal = trackingData[0].trim();
                double nominalInvestasi = Double.parseDouble(trackingData[1].trim());
                Tracking1 trackingObj = new Tracking1(nominalInvestasi, tanggal);
                trackingList.add(trackingObj);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    
        return trackingList;
    }
    public void addInvestasiToCSV2(String tanggal, double nominalInvestasi) {
        String csvFile = "src/main/java/bettermentfix/Investasi2.csv";
        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
            writer.println(tanggal + "," + nominalInvestasi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Tracking2> readInvestasiCSV2() {
        List<Tracking2> trackingList2 = new ArrayList<>();
        String csvFile = "src/main/java/bettermentfix/Investasi2.csv";
        String line = "";
        String cvsSplitBy = ",";
    
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine(); // Skip header if exists
            while ((line = br.readLine()) != null) {
                String[] trackingData = line.split(cvsSplitBy);
                String tanggal = trackingData[0].trim();
                double nominalInvestasi = Double.parseDouble(trackingData[1].trim());
                Tracking2 trackingObj = new Tracking2(nominalInvestasi, tanggal);
                trackingList2.add(trackingObj);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    
        return trackingList2;
    }

public void addInvestasiToCSV3(String tanggal, double nominalInvestasi) {
    String csvFile = "src/main/java/bettermentfix/Investasi3.csv";
    try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile, true))) {
        writer.println(tanggal + "," + nominalInvestasi);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public List<Tracking3> readInvestasiCSV3() {
    List<Tracking3> trackingList3 = new ArrayList<>();
    String csvFile = "src/main/java/bettermentfix/Investasi3.csv";
    String line = "";
    String cvsSplitBy = ",";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        br.readLine(); // Skip header if exists
        while ((line = br.readLine()) != null) {
            String[] trackingData = line.split(cvsSplitBy);
            String tanggal = trackingData[0].trim();
            double nominalInvestasi = Double.parseDouble(trackingData[1].trim());
            Tracking3 trackingObj = new Tracking3(nominalInvestasi, tanggal);
            trackingList3.add(trackingObj);
        }
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
    }

    return trackingList3;
}
    public boolean updatePassword(String email, String newPassword) {
        String csvFile = "src/main/java/bettermentfix/register.csv";
        boolean emailFound = false;
        ArrayList<Pengguna> updatedPengguna = new ArrayList<>();

        readBukuCSVData();

        for (Pengguna p : pengguna) {
            if (p.getEmail().equals(email)) {
                p.setKataSandi(newPassword);
                emailFound = true;
            }
            updatedPengguna.add(p);
        }

        if (emailFound) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile))) {
                writer.println("Nama Lengkap,Email,No Telepon,Kata Sandi"); // Header CSV
                for (Pengguna p : updatedPengguna) {
                    writer.println(p.getNamaLengkap() + "," +
                                   p.getEmail() + "," +
                                   p.getNoTelepon() + "," +
                                   p.getKataSandi());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return emailFound;
    }
    public boolean updateUserData(String currentEmail, String newName, String newEmail, String newPhone, String newPassword) {
        String csvFile = "src/main/java/bettermentfix/Register.csv";
        boolean emailFound = false;
        ArrayList<Pengguna> updatedPengguna = new ArrayList<>();

        readBukuCSVData();
    
        for (Pengguna p : pengguna) {
            if (p.getEmail().equals(currentEmail)) {
                p.setNamaLengkap(newName);
                p.setEmail(newEmail);
                p.setNoTelepon(newPhone);
                p.setKataSandi(newPassword);
                emailFound = true;
            }
            updatedPengguna.add(p);
        }

        if (emailFound) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile))) {
                writer.println("Nama Lengkap,Email,No Telepon,Kata Sandi"); // Header CSV
                for (Pengguna p : updatedPengguna) {
                    writer.println(p.getNamaLengkap() + "," +
                                   p.getEmail() + "," +
                                   p.getNoTelepon() + "," +
                                   p.getKataSandi());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        return emailFound;
    }
    public boolean updatePasswordCompany(String email, String newPassword) {
        String csvFile = "src/main/java/bettermentfix/registerCompany.csv";
        boolean emailFound = false;
        ArrayList<Pengguna> updatedPengguna = new ArrayList<>();

        readBukuCSVData2();

        for (Pengguna p : pengguna) {
            if (p.getEmail().equals(email)) {
                p.setKataSandi(newPassword);
                emailFound = true;
            }
            updatedPengguna.add(p);
        }

        if (emailFound) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(csvFile))) {
                writer.println("Nama Lengkap,Email,No Telepon,Kata Sandi"); // Header CSV
                for (Pengguna p : updatedPengguna) {
                    writer.println(p.getNamaLengkap() + "," +
                                   p.getEmail() + "," +
                                   p.getNoTelepon() + "," +
                                   p.getKataSandi());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return emailFound;
    }
    public List<Pengguna> readCSV(String filePath) {
        List<Pengguna> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                Pengguna user = new Pengguna(columns[0], columns[1], columns[2], columns[3]);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}


