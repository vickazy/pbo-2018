package percobaan3;

public class Biodata 
{
    String nim, nama, jurusan, gender, alamat;
    boolean baca, makan, tidur;
    
    public Biodata(String nim, String nama, String jurusan, String gender, boolean baca, boolean makan, boolean tidur, String alamat) 
    {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.gender = gender;
        this.baca = baca;
        this.makan = makan;
        this.tidur = tidur;
        this.alamat = alamat;
    }
    
    public Biodata()
    {
        
    }
    
    @Override
    public String toString() {
        String genderData, Hobi = null;

        if (gender == null) {
            genderData = "-";
        } else {
            genderData = gender;
        }

        if (baca == true || makan == true || tidur == true) {
            if (baca == true) {
                Hobi = "Membaca";
            } else if (makan == true) {
                Hobi = "Makan";
            } else if (tidur == true) {
                Hobi = "Tidur";
            }

            if (baca == true && makan == true && tidur == true) {
                Hobi = "Membaca\n\t    " + "Makan\n\t    " + "Tidur";
            } else if (baca == true && makan == true) {
                Hobi = "Membaca\n\t    " + "Makan";
            } else if (makan == true && tidur == true) {
                Hobi = "Makan\n\t    " + "Tidur";
            } else if (baca == true && tidur == true) {
                Hobi = "Membaca\n\t    " + "Tidur";
            }
        } else {
            Hobi = "-";
        }

        String info = "NIM \t= " + nim + "\n"
                + "Nama \t= " + nama + "\n"
                + "Jurusan \t= " + jurusan + "\n"
                + "Gender \t= " + genderData + "\n"
                + "Hobi \t= " + Hobi + "\n"
                + "Alamat \t= " + alamat + "\n";
        return info;
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }
    
    
}
