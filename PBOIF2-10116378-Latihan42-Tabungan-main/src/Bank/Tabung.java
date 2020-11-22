/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Program penarikan uang
 */

import java.util.Scanner;
public class Tabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inst. object
        Scanner scan = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        // var
        int kredit;
        
        System.out.print("===Program Penarikan Uang====\n");
        System.out.printf("Masukkan Saldo Awal : "); tabungan.Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.ambilUang(kredit));
        
    }
    
}
