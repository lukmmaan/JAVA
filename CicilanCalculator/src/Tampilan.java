package CicilanCalculator.src;

import java.text.NumberFormat;

public class Tampilan {
	static final int BULAN_DALAM_TAHUN = 12;
	static final int PERCENT = 100;
	public static void hitungSisaBayaranPerbulan(int hargaAwal, int durasiCicilan, double bunga, double bayaranPerBulan){
	    System.out.println("======== SISA PEMBAYARAN SETIAP BULAN ========");
	    double sisaBayaran = hargaAwal+ (hargaAwal * (bunga/PERCENT));
	    for (int i = 0; i < durasiCicilan*BULAN_DALAM_TAHUN; i++) {
	        sisaBayaran -= bayaranPerBulan;
	        System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
	
	    }
	}
	public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga){
	    return (hargaAwal+ (hargaAwal * (bunga/PERCENT)))/(durasiCicilan*BULAN_DALAM_TAHUN);
	}
	public static void tampilanBayaranPerBulan(double bayaranPerBulan) {
	    System.out.println("======== PEMBAYARAN SETIAP BULAN ========");
	    System.out.println(NumberFormat.getCurrencyInstance().format(bayaranPerBulan));
	}
    
}