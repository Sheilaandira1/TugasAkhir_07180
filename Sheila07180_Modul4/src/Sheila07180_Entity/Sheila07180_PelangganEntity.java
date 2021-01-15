package Sheila07180_Entity;

public class Sheila07180_PelangganEntity extends Sheila07180_ManusiaAbstractEntity{
    private String alamat,notelp;
    private int jumlahpes;
    
    public Sheila07180_PelangganEntity(String nama,String alamat,String notelp){
        super(nama);
        this.alamat=alamat;
        this.notelp=notelp;
        
    }

    public Sheila07180_PelangganEntity(int jumlahpes) {
        this.jumlahpes=jumlahpes;
    }
    
    public Sheila07180_PelangganEntity() {
    
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getNotelp (){
        return notelp;
    }
    
    public int getJumlahpes(){
        return jumlahpes;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public void setJumlahpes(int jumlahpes) {
        this.jumlahpes = jumlahpes;
    }
    
    
}