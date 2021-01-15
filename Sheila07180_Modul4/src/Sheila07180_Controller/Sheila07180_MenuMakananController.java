package Sheila07180_Controller;

import Sheila07180_Entity.Sheila07180_MenuMakananEntity;


public class Sheila07180_MenuMakananController {

    public Sheila07180_MenuMakananController() {
    }
    
     public Sheila07180_MenuMakananEntity getData(int index) {
        return Sheila07180_AllObjectModel.menumakananModel.getMenuMakananEntityArrayList(index);
    }     
    
   public void insert(String isi1,String isi2,String isi3,int harga) {
        Sheila07180_MenuMakananEntity menumakanan= new Sheila07180_MenuMakananEntity();
        menumakanan.setIsi1(isi1);
        menumakanan.setIsi2(isi2);
        menumakanan.setIsi3(isi3);
        menumakanan.setHarga(harga);
        Sheila07180_AllObjectModel.menumakananModel.insertMenumakanan(menumakanan);
    }
   public void delete(int index){
       Sheila07180_AllObjectModel.menumakananModel.delete(index);
   }
   
}

