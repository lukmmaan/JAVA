package CicilanCalculator.src;

public class Cicilan {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setBunga(bunga);
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
    }

    public void setHargaAwal(int hargaAwal) {
        if (hargaAwal >= 1_000_000 && hargaAwal<=100_000_000) {
            this.hargaAwal = hargaAwal;
        }
        else{
            throw new IllegalArgumentException("Error Harga Awal");
        }
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setDurasiCicilan(int durasiCicilan) {
        if (durasiCicilan >= 1) {
            this.durasiCicilan = durasiCicilan;
        }
        else{
            throw new IllegalArgumentException("Error Durasi Cicilan");
        }
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    public void setBunga(double bunga) {
        if (bunga>=0) {
            this.bunga = bunga;
        }
        else{
            throw new IllegalArgumentException("Error Bunga");
        }
    }

    public double getBunga() {
        return bunga;
    }

}