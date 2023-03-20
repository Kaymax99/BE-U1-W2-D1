package esercizio3;

public class BancaException extends Exception {
	static String message;
	public BancaException(String msg) {
		super(msg);
		message = msg;
	}
	
	public String toString() {
		return message;
	}
}
