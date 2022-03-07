public class drivermahasiswa {
    
    public static void main(String[] args) {

        prodi pro1 = new prodi("","");
        pro1.setKode("SE");
        pro1.setNama("Rekayasa Perangkat Lunak");

        prodi pro2 = new prodi("","");
        pro2.setKode("IT");
        pro2.setNama("Teknologi Informasi");


        mahasiswa mahasiswa1 = new mahasiswa ("","");
        mahasiswa1.setNama("eren yeager");
        mahasiswa1.setnim("1302191234");
        mahasiswa1.setProdi(pro1);
        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());
        System.out.println(mahasiswa1.getProdi());
        System.out.println(mahasiswa1.getAngkatan());

        mahasiswa mahasiswa2 = new mahasiswa("","");
        mahasiswa2.setNama("armin arlert");
        mahasiswa2.setnim("1303205555");
        mahasiswa2.setProdi(pro2);
        System.out.println(mahasiswa2.getNama());
        System.out.println(mahasiswa2.getNim());
        System.out.println(mahasiswa2.getProdi());
        System.out.println(mahasiswa2.getAngkatan());

        mahasiswa mahasiswa3 = new mahasiswa("","");
        mahasiswa3.setNama("mikasa ankerman");
        mahasiswa3.setnim("1302990001");
        mahasiswa3.setProdi(pro1);
        System.out.println(mahasiswa3.getNama());
        System.out.println(mahasiswa3.getNim());
        System.out.println(mahasiswa3.getProdi());
        System.out.println(mahasiswa3.getAngkatan());



       

        

        
    }
    
}
