package Sheila07180_Model;

import Sheila07180_Entity.Sheila07180_AdminEntity;
import java.util.ArrayList;

    public class Sheila07180_AdminModel {
        private ArrayList<Sheila07180_AdminEntity> adminEntityArrayList; 
        
        public Sheila07180_AdminModel(){
            adminEntityArrayList = new ArrayList<Sheila07180_AdminEntity>();
        }
        
        public void insertAdmin(Sheila07180_AdminEntity admin){
            adminEntityArrayList.add(admin);
        }     
        public int cekdata(String nama, String password){
        int loop = 0;
        while(!adminEntityArrayList.get(loop).getNama().equals(nama)&&
                !adminEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
        }
        
        public Sheila07180_AdminEntity getAdminEntityArrayList(int index){
            return adminEntityArrayList.get(index);
        }
        
        public ArrayList <Sheila07180_AdminEntity> alldata(){
        return adminEntityArrayList;
        }

}