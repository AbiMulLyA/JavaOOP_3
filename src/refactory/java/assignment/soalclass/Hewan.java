package refactory.java.assignment.soalclass;

import java.util.List;

public class Hewan {
    public String nama, jenis;
    public int umur;
    public Hewan() {
        profilHewan();
    }
    public Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String profilHewan(){
        return "{" +
                "\"nama\": \"" + nama + '\"' +
                ",\"jenis\": \"" + jenis + '\"' +
                ",\"umur\": " + umur +
                '}';
    }
    public void statusHewan(List <Hewan> hewan){
        if(hewan != null){
            hewan.stream().map(s ->{
                String status = "";
                if(s.umur < 1) status = "Belum Siap Diternakan";
                else if(s.umur <= 4) status = "Siap Diternakan";
                else if(s.umur > 5) status = "Hewan Sudah Tua";
                return status;
            }).forEach(System.out::println);
        }
    }
}
