public class mahasiswa {

    String nama;
    String nim;
    prodi prodi;

    mahasiswa(String nama, String nim)
    {
        this.nama =nama;
        this.nim = nim;

    }

    void setNama(String nama)
    {
        this.nama = nama ;
    }

    void setnim(String nim)
    {
        this.nim = nim;
    }

    void setProdi(prodi prodi)
    {
        this.prodi =prodi;
    }

    String getNama()
    {
        return this.nama;
    }

    String getNim()
    {
        return this.nim;
    }

    String getProdi()
    {
        return this.prodi.getNama() + this.prodi.getKode();
    }
    int getAngkatan()
    {
        String Angkatan = this.nim.substring(4,6);
        if(Integer.parseInt(Angkatan) <= 20){
            return Integer.parseInt("20" + Angkatan);
        }else if
     
  
          (Integer.parseInt(Angkatan) >= 90
          && Integer.parseInt(Angkatan)<=99) {
              return Integer.parseInt("19" + Angkatan);
          }
          else {
              return 0;
          }
  
    }
  

    
}
