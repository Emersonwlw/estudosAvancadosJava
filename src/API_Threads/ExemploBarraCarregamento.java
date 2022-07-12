package API_Threads;

public class ExemploBarraCarregamento {
	
	public static void main(String[] args) {
		
		GeraradorPDF iniciarGerarPDF = new GeraradorPDF();
		BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);
		
		iniciarGerarPDF.start();
		iniciarBarraDeCarregamento.start();
			
		
	}
	
}


class GeraradorPDF extends Thread{

	public void run() {
		try {
			System.out.println("Iniciar geraçãode PDF");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("PDF gerado");
	}
}


class BarraDeCarregamento extends Thread{
	
	private Thread iniciarGeradorPDF;
	
	public BarraDeCarregamento(Thread iniciarGeradorPDF) {
		this.iniciarGeradorPDF = iniciarGeradorPDF;
		
	}
	
	public void run() {
		
			while(true) {
				try {
					Thread.sleep(500);
						if(!iniciarGeradorPDF.isAlive()) {
							break;
						}
						System.out.println("Loading...");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	
	}
	
}
