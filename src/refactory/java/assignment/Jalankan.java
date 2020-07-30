package refactory.java.assignment;

import refactory.java.assignment.soalclass.Hewan;
import refactory.java.assignment.soalclass.Ikan;
import refactory.java.assignment.soalclass.Unggas;

import java.util.ArrayList;

public class Jalankan {

    public static void main(String[] args) {
        var data = new ArrayList<Hewan>();
        data.add(unggas());
        data.add(reptil());
        System.out.println("\nDATA MURAI\n");
        murai();
        System.out.println("\nDATA TENGGIRI\n");
        tenggiri();
    }

    private static Hewan unggas(){
        return new Hewan("merpati","vertebrata",1);
    }

    private static Hewan reptil(){
        Hewan hewan = new Hewan();
        hewan.setNama("buaya");
        hewan.setJenis("vertebrata");
        hewan.setUmur(2);
        return hewan;
    }

    private static Unggas murai(){
        Unggas unggas = new Unggas();
        unggas.nama = "Murai Batu";
        unggas.umur = 6;
        unggas.jenis = "vertebrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(unggas);

        System.out.println(unggas.profilHewan());
        System.out.print("Status Hewan : ");
        unggas.statusHewan(hewan);
        return unggas;
    }

    private static Ikan tenggiri(){
        Ikan ikan = new Ikan();
        ikan.nama = "Tengiri Laut";
        ikan.umur = 3;
        ikan.jenis = "Vertebrata";

        var hewan = new ArrayList<Hewan>();
        hewan.add(ikan);

        System.out.println(ikan.profilHewan());
        System.out.print("Status Hewan : ");
        ikan.statusHewan(hewan);
        System.out.println("Berat dengan kandungan air : " + ikan.hitungBerat(10));
        System.out.println("Berat tanpa kandungan air : " + ikan.hitungBerat(10,5));

        return ikan;
    }
}
