
package Sheila07180_Entity;

public class Sheila07180_AdminEntity extends Sheila07180_ManusiaAbstractEntity {
    String password;
    public Sheila07180_AdminEntity(String nama,String password) {
        super (nama);
        this.password=password;
    }

    public Sheila07180_AdminEntity() {
    }
    
    @Override
    public String getNama(){
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}