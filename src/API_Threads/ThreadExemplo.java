package API_Threads;

public class ThreadExemplo {
	
	public static void main(String[] args) {
		
		//exemplo de thread assincrona 
		Thread thread =new Thread(new BarraDeCarregamento2());
		Thread  thread2 = new Thread(new BarraDeCarregamento3());

		
		thread.start();
		thread2.start();
		
		System.out.println("Nome da thread : "+ thread.getName());
		System.out.println("Nome da thread : "+ thread2.getName());
		
		
	}

}

class GerarPDF implements Runnable{

	public void run() {
		System.out.println("Gerar PDF");
	}
}


class BarraDeCarregamento11 implements Runnable{
	
	public void run() {System.out.println("Loading...");}
}


class BarraDeCarregamento2 implements Runnable{
	
	public void run() {
		
		try {
			Thread.sleep(3000);
			System.out.println("rodei BarraDeCarregamento2: ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class BarraDeCarregamento3  implements Runnable{
	
	public void run() {
		
		
		try {
			Thread.sleep(1000);
			System.out.println("rodei BarraDeCarregamento3: ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}




