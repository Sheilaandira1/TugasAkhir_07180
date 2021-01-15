package Sheila07180_Entity;

public abstract class Sheila07180_ManusiaAbstractEntity {
    protected String nama;
    
    public Sheila07180_ManusiaAbstractEntity(String nama){
        this.nama=nama;
    }
    
    public Sheila07180_ManusiaAbstractEntity(){
    }
    public abstract String getNama();
    
    public void setNama(String nama){
        this.nama=nama;
    }

}