/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan49.biaya.emas.kawin;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Biaya Emas Kawin
 */

public class IF0110118016Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
        
        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));
    }
    
}
