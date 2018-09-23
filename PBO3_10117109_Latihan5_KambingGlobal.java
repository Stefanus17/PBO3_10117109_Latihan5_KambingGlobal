/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan5_kambingglobal;

/**
 *
 * @author 
 * NAMA  : Stefanus Saputra
 * KELAS : IF 3
 * NIM   : 10117109
 */
public class PBO3_10117109_Latihan5_KambingGlobal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // menampilkan jumlah kambing yang ada saat program pertama 
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
