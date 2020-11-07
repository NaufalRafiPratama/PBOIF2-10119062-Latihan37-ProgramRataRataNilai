/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan37.programrataratanilai;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Program : program ini berisi program untuk menampilkan
 * program rata-rata nilai
 */
public class PBOIF210119062Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RataRataNilaiMahasiswa nilaiMhs = new RataRataNilaiMahasiswa();
        double ratarata = nilaiMhs.hitungRataRata();
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+ratarata);
        System.out.println("Developed by : Naufal Rafi Pratama");
    }
    
}
