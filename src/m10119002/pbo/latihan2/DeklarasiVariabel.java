/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan2;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : PBO1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program untuk pendeklarasian
 * dan pengaksesan variabel
 * 
 */
public class DeklarasiVariabel {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel niali = " + nilaiInt);
        System.out.println("Isi varaibel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
}
