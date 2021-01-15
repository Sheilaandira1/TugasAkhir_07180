package Sheila07180_Controller;

import Sheila07180_Entity.Sheila07180_PelangganEntity;
import javax.swing.table.DefaultTableModel;

public class Sheila07180_PelangganController {

    public Sheila07180_PelangganController() {
    }
    
    public Sheila07180_PelangganEntity getData(int index) {
        return Sheila07180_AllObjectModel.pelangganModel.getPelangganEntityArrayList(index);
    }
   public void insert(String nama,String alamat,String notelp) {
        Sheila07180_PelangganEntity pelanggan = new Sheila07180_PelangganEntity();
        pelanggan.setNama(nama);
        pelanggan.setAlamat(alamat);
        pelanggan.setNotelp(notelp);
        Sheila07180_AllObjectModel.pelangganModel.insertPelanggan(pelanggan);
    }
   public void delete(int index){
       Sheila07180_AllObjectModel.pelangganModel.delete(index);
   }
   
    public void insert2(int jumlahpes){
        Sheila07180_AllObjectModel.pelangganModel.insertPelanggan(new Sheila07180_PelangganEntity(jumlahpes));
    }
   
}
