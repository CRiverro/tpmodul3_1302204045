public class prodi {
    String kode;
    String nama;

   prodi (String kode, String nama)
   {
       this.kode =kode;
       this.nama =nama;
   }

   void setKode(String kode)
   {
       if (kode != null && kode.length() == 2){
           this.kode = kode;
       }
   }
   void setNama(String nama)
    {
        this.nama = nama;
    }
    String getKode()
    {
        return this.kode;
    }
    String getNama()
    {
        return this.nama;
    }


    
}
