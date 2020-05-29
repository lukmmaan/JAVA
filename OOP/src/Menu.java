package OOP.src;

public class Menu {

	public static void tambahBuah() {
	    while (true) {
	        // System.out.println("Input Nama Buah");
	        // String inputNama = scanner.next();
	        String inputNama = Console.readInput("Input Nama Buah: ");
	        int inputHarga = (int) Console.readInputNumber("Input Harga Buah: ");
	        int inputStock = (int) Console.readInputNumber("Input Stok Buah: ");
	
	        Buah buah = new Buah(inputNama, inputHarga, inputStock);
	
	        App.listBuah.add(buah);
	
	        System.out.print("Repeate Y/N: ");
	        String option = App.scanner.next();
	        if (option.equalsIgnoreCase("N")) {
	            // System.out.print("N masuk");
	            break;
	        }
	    }
	}

	public static void tampilListBuah() {
	            
	    System.out.println("======== LIST BUAH ========");
	    for (int i = 0; i < App.listBuah.size(); i++) {
	        System.out.println((i+1)+". "+  App.listBuah.get(i).getNama() + " || " + App.listBuah.get(i).getHarga() + " || " + App.listBuah.get(i).getStock() + " pcs");            
	    }
	
	}

}