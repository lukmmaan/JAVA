package OOP.src;

public class Buah {
    private String nama;
    private int harga;
    private int stock;

    public static int countBuah;
    public Buah(String nama, int harga, int stock) {
        setNama(nama);
        setHarga(harga);
        setStock(stock);
        countBuah++;
    }

    private void setNama(String nama) {
        if (nama.length() == 0) {
            throw new IllegalArgumentException("Name Cannot be empty");
        }
        this.nama = nama;
    }

    public String getNama() {

        return nama;
    }

    private void setHarga(int harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Price Cannot be below 0");
        }
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    private void setStock(int stock) {
        if (stock <= 0) {
            throw new IllegalArgumentException("Stock Cannot be below 0");
        }
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}