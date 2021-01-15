package sheila07180_modul4;

import Sheila07180_Entity.*;
import Sheila07180_Controller.*;
import java.util.Scanner;

public class Sheila07180_Modul4 {       
    private static Sheila07180_AdminController admin = new Sheila07180_AdminController();
    private static Sheila07180_PelangganController pelanggan = new Sheila07180_PelangganController();
    private static Sheila07180_MenuMakananController menumakanan = new Sheila07180_MenuMakananController();
    static Scanner input = new Scanner(System.in);
    private static int cekdata,loop =0;
    
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Catering Sarah");
        int pil;
        do{
            System.out.println("1. Login Admin");
            System.out.println("2. Exit");
            System.out.print("Pilih Menu : ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    if(pil == 1){
                        dataAdmin();
                        LoginAdmin();
                    }
            }
        }while(pil!=2);
    }
    
    static void dataAdmin(){
        String nama[] = {"sheila"};
        String password[] = {"1"};
        for(int i=0;i<nama.length;i++){
            admin.insert(nama[i],password[i]);
        }
    }
    
    static void LoginAdmin(){
        int pilih;
        try{
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("Masukkan password admin : ");
        String password = input.next();
        cekdata = admin.cekdataAkun(nama, password);
        do{
            System.out.println("1. Input Data  ");
            System.out.println("2. Cek Data    ");
            System.out.println("3. Update Data ");
            System.out.println("4. Hapus Data  ");
            System.out.println("5. EXIT");
            System.out.print("Pilih : ");
                pilih = input.nextInt();
            switch(pilih){
                case 1 : Input();
                    break;
                case 2 : Cekdata();
                    break;
                case 3 : 
                    System.out.print("Masukkan Nama Customer yang ingin di update = ");
                    String namacus= input.next(); 
                    for(int i=0;i<loop;i++)
                    {
                        if(namacus.equals(pelanggan.getData(i).getNama()))
                        {

                            System.out.print("Input Alamat Baru : ");
                            String newalamat = input.next();
                            System.out.print("Input No Telp Baru : ");
                            String newnotelp = input.next();
                            System.out.print("Input Jumlah Pesanan : ");
                            int newjumlahpes = input.nextInt(); 
                            System.out.print("Input Isi1 Pesanan : ");
                            String newisi1 = input.next();
                            System.out.print("Input Isi2 Pesanan : ");
                            String newisi2 = input.next();
                            System.out.print("Input Isi3 Pesanan : ");
                            String newisi3 = input.next();
                            System.out.print("Input Harga Pesanan : ");
                            int newharga = input.nextInt();
                            update(namacus,newalamat,newnotelp,newjumlahpes,newisi1,newisi2,newisi3,newharga);
                        }
                    }
                    break;
                    
                case 4 :
                    cetak();
                    System.out.println("Hapus index ke : ");
                    int index = input.nextInt();
                    pelanggan.delete(index);
                    loop--;
                break;
            }
        }
        while(pilih!=5);
        }catch(Exception e){
         
        }
    }
    
    static void cetak(){
        for(int i=0;i<loop;i++){
            System.out.println(i+"Nama : "+pelanggan.getData(i).getNama());
        }
        
    }
    
    static void Input(){
        try{
        System.out.print("Nama Customer : ");
        String namacustomer = input.next();
        System.out.print("Alamat : ");
        String notelp = input.next();
        System.out.print("No Telpon : ");
        String alamat = input.next();
        System.out.print("Input Jumlah Pesanan : ");
        int jumlahpes = input.nextInt(); 
        System.out.print("Input Isi1 Pesanan : ");
        String isi1 = input.next();
        System.out.print("Input Isi2 Pesanan : ");
        String isi2 = input.next();
        System.out.print("Input Isi3 Pesanan : ");
        String isi3 = input.next();
        System.out.print("Input Harga Pesanan : ");
        int harga = input.nextInt();   
        
        pelanggan.insert(namacustomer,alamat,notelp);
        pelanggan.insert2(jumlahpes);
        menumakanan.insert(isi1,isi2,isi3,harga);
        loop++;
        }catch(Exception e){
            System.out.println("FORMAT SALAH");
        }
    }
    
    static void Cekdata(){
        for(int i=0;i<loop;i++){
            System.out.println("Nama : "+pelanggan.getData(i).getNama());
            System.out.println("Alamat : "+pelanggan.getData(i).getAlamat());
            System.out.println("No Telpon : "+pelanggan.getData(i).getNotelp());
            System.out.println("Jumlah Pesanan : "+pelanggan.getData(i).getJumlahpes());
            System.out.println("Menu Isian 1 : "+menumakanan.getData(i).getIsi1());
            System.out.println("Menu Isian 2 : "+menumakanan.getData(i).getIsi2());
            System.out.println("Menu Isian 3 : "+menumakanan.getData(i).getIsi3());
            int totalharga= menumakanan.getData(i).getHarga()*pelanggan.getData(i).getJumlahpes();
            System.out.println("Total Harga : "+totalharga);
            System.out.println();
        }
    }
    
    static void update(String nama, String newalamat, String newnotelp ,int newjumlahpes, String newisi1, String newisi2, String newisi3, int newharga){
        for(int i=0;i<loop;i++){
            if(nama.equals(pelanggan.getData(i).getNama())){
                pelanggan.getData(i).setAlamat(newalamat);
                pelanggan.getData(i).setNotelp(newnotelp); 
                pelanggan.getData(i).setJumlahpes(newjumlahpes);
                menumakanan.getData(i).setIsi1(newisi1);
                menumakanan.getData(i).setIsi2(newisi2);
                menumakanan.getData(i).setIsi3(newisi3);
                menumakanan.getData(i).setHarga(newharga);
            }
        }
    }
      
}
