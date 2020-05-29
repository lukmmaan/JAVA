package OOP.src;

public class Console {

	public static String readInput(String Message) {
	    System.out.print(Message);
	    return App.scanner.next();
	}

	public static double readInputNumber(String Message) {
	    System.out.print(Message);
	    return App.scanner.nextDouble();
	}
    
}