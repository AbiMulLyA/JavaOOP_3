package refactory.java.assignment.soalclass;

import java.util.List;

public class Unggas extends Hewan{
    @Override
    public void statusHewan(List<Hewan> hewan) {
        super.statusHewan(hewan);
//        if(hewan != null){
//            hewan.stream().map(s ->{
//                String status = "";
//                if(s.umur < 1) status = "Belum Siap Diternakan";
//                else status = "Siap Diternakan";
//                return status;
//            }).forEach(System.out::println);
//        }
    }
}
