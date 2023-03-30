public class Program{

	public static void main(String arg[]){

		SmartPhone sp1 = new SmartPhone();
		sp1.setMarca("Apple");
		sp1.setModelo("iPhone 14");
		sp1.setVersao("Pro Max");

		Leitura l = new Leitura();

		SmartPhone sp2 = new SmartPhone(sp1);

		//sp1.setMarca(l.entDados("Marca: "));
		//sp1.setModelo(l.entDados("Modelo: "));
		//sp1.setVersao(l.entDados("Versao: "));

		sp2.setMarca(l.entDados("Marca: "));
		sp2.setModelo(l.entDados("Modelo: "));
		sp2.setVersao(l.entDados("Versao: "));

		//sp1.getSpec().setCapacidade(l.entDados("Capacidade: "));
		//sp1.getSpec().setCor(l.entDados("Cor: "));

		//sp1.getSpec().getSo().setSo(l.entDados("SO: "));
		//sp1.getSpec().getSo().setVersao(l.entDados("Versao "));

		System.out.println("SP 1:");
		System.out.println("Marca: "+sp1.getMarca());
		System.out.println("Modelo: "+sp1.getModelo());
		System.out.println("Versao: "+sp1.getVersao());

		System.out.println("SP 2:");
		System.out.println("Marca: "+sp2.getMarca());
		System.out.println("Modelo: "+sp2.getModelo());
		System.out.println("Versao: "+sp2.getVersao());


		//System.out.println("Capacidade: "+sp1.getSpec().getCapacidade());
		//System.out.println("Cor: "+sp1.getSpec().getCor());

		//System.out.println("Sistema Operacional: "+sp1.getSpec().getSo().getSo());
		//System.out.println("Versao: "+sp1.getSpec().getSo().getVersao());


	}

}