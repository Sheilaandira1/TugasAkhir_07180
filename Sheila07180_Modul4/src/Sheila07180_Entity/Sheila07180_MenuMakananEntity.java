package Sheila07180_Entity;

public class Sheila07180_MenuMakananEntity{
    private String isi1,isi2,isi3;
    private int harga;

    
    public Sheila07180_MenuMakananEntity(String isi1,String isi2,String isi3,int harga){
        this.isi1=isi1;
        this.isi2=isi2;
        this.isi3=isi3;
        this.harga=harga;
    }

    public Sheila07180_MenuMakananEntity() {
    }
       
    public String getIsi1(){
        return isi1;
    }
    
    public String getIsi2 (){
        return isi2;
    }
    
     public String getIsi3 (){
        return isi2;
    }
    
    public int getHarga(){
        return harga;
    }


    public void setIsi1(String isi1) {
        this.isi1 = isi1;
    }

    public void setIsi2(String isi2) {
        this.isi2 = isi2;
    }
     public void setIsi3(String isi3) {
        this.isi3 = isi3;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}