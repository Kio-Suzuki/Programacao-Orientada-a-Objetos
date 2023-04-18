public class Program{
		
	public static void main(String arg[]){

		Hardware hw1 = new Hardware();
		hw1.setCategoria("GPU");
		hw1.setMarca("MSI");

		Leitura l = new Leitura();

		Hardware hw2 = new Hardware(hw1);

		hw1.setCategoria(l.entDados("Categoria: "));
		hw1.setMarca(l.entDados("Marca: "));

		hw1.getSpec().setModelo(l.entDados("Modelo: "));
		hw1.getSpec().setClock(l.entDados("Clock: "));
		hw1.getSpec().setMemoria(l.entDados("Memoria: "));

		hw2.setCategoria(l.entDados("Categoria: "));
		hw2.setMarca(l.entDados("Marca: "));

		hw2.getSpec().setModelo(l.entDados("Modelo: "));
		hw2.getSpec().setClock(l.entDados("Clock: "));
		hw2.getSpec().setMemoria(l.entDados("Memoria: "));

		System.out.println("HARDWARE 1:");
		System.out.println("Categoria: "+hw1.getCategoria());
		System.out.println("Marca: "+hw1.getMarca());
		System.out.println("Modelo: "+hw1.getSpec().getModelo());
		System.out.println("Clock: "+hw1.getSpec().getClock());
		System.out.println("Memoria: "+hw1.getSpec().getMemoria());

		System.out.println("HARDWARE 2:");
		System.out.println("Categoria: "+hw2.getCategoria());
		System.out.println("Marca: "+hw2.getMarca());
		System.out.println("Modelo: "+hw2.getSpec().getModelo());
		System.out.println("Clock: "+hw2.getSpec().getClock());
		System.out.println("Memoria: "+hw2.getSpec().getMemoria());
		
	}

}





		