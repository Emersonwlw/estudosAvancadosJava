package estudo;

public class recursividade {
	public static void main(String[] args) {
		System.out.println(fatorial(10));
	}
	
	public static int fatorial(int value) {
		if(value == 1) {
			return value;
		}else {
			return value * fatorial((value-1));
		}
	}
	
}

