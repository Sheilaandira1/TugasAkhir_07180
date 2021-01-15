package Sheila07180_Model;

import Sheila07180_Entity.Sheila07180_AdminEntity;
import Sheila07180_Entity.Sheila07180_PelangganEntity;
import Sheila07180_Entity.Sheila07180_MenuMakananEntity;
import java.util.ArrayList;

public class Sheila07180_MenuMakananModel {
    private ArrayList <Sheila07180_MenuMakananEntity> menumakananEntityArrayList; 
    
    public Sheila07180_MenuMakananModel(){
        menumakananEntityArrayList = new ArrayList<Sheila07180_MenuMakananEntity>();
    }
    public void insertMenumakanan(Sheila07180_MenuMakananEntity menu){
        menumakananEntityArrayList.add(menu);
    }  
    public Sheila07180_MenuMakananEntity getMenuMakananEntityArrayList(int index){
        return menumakananEntityArrayList.get(index);
    }
    public void delete(int index){
        menumakananEntityArrayList.remove(index);
    }

}
