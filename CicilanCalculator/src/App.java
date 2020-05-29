package CicilanCalculator.src;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // harga awal = p
        // durasi cicilan = d
        // bunga = b
        // bayaran per bulan = M
        // M = [P + (P * b% /100)] / D * 12
        int hargaAwal;
        int durasiCicilan;
        double bunga;
        
        hargaAwal = (int) Console.readInputNumber("Harga Awal: ");
        durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ");
        bunga = (int) Console.readInputNumber("Bunga: ");

        Cicilan cicil = new Cicilan(hargaAwal, durasiCicilan, bunga);

        double bayaranPerBulan = Tampilan.hitungBayaranPerBulan(cicil.getHargaAwal(),cicil.getDurasiCicilan(), cicil.getBunga());
        Tampilan.tampilanBayaranPerBulan(bayaranPerBulan);
        Tampilan.hitungSisaBayaranPerbulan(cicil.getHargaAwal(), cicil.getDurasiCicilan(),cicil.getBunga(), bayaranPerBulan);
    }

}
