package refactory.java.assignment.soalclass;

public class Ikan extends Hewan{
    public Ikan(){
        super("Lele", "Vertebrata", 1);
    }
    public int hitungBerat(int bobot){
        int count = 0;
        count  = umur * bobot ;
        return count;
    }
    public int hitungBerat(int bobot, int kandunganAir){
        int count = 0;
        count  = hitungBerat(bobot) - kandunganAir ;
        return count;
    }
}
