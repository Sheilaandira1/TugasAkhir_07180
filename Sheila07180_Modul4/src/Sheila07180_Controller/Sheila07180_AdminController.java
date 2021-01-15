package Sheila07180_Controller;

import Sheila07180_Entity.Sheila07180_AdminEntity;
import javax.swing.table.DefaultTableModel;

public class Sheila07180_AdminController {
    private int indexlogin=0;
    public Sheila07180_AdminController(){ 
    }
    
  public int cekdataAkun(String nama, String password) {
        int cekdata = Sheila07180_AllObjectModel.adminModel.cekdata(nama, password);
        return cekdata;
    }
    public void login(String nama,String password){
        indexlogin = Sheila07180_AllObjectModel.adminModel.cekdata(nama, password);
    }
    
   public Sheila07180_AdminEntity getData(int index) {
        return Sheila07180_AllObjectModel.adminModel.getAdminEntityArrayList(index);
    }
   public void insert(String nama,String password) {
        Sheila07180_AdminEntity admin = new Sheila07180_AdminEntity();
        admin.setNama(nama);
        admin.setPassword(password);
        Sheila07180_AllObjectModel.adminModel.insertAdmin(admin);
    }
      
}

