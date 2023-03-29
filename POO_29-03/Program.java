public class Program{

	public static void main(String arg[]){

		SmartPhone sp1 = new SmartPhone();

		Leitura l = new Leitura();

		sp1.setMarca(l.entDados("Marca: "));
		sp1.setModelo(l.entDados("Modelo: "));
		sp1.setVersao(l.entDados("Versao: "));

		sp1.getSpec().setCapacidade(l.entDados("Capacidade: "));
		sp1.getSpec().setCor(l.entDados("Cor: "));

		sp1.getSpec().getSo().setSo(l.entDados("SO: "));
		sp1.getSpec().getSo().setVersao(l.entDados("Versao "));

		System.out.println();
		System.out.println("Marca: "+sp1.getMarca());
		System.out.println("Modelo: "+sp1.getModelo());
		System.out.println("Versao: "+sp1.getVersao());

		System.out.println("Capacidade: "+sp1.getSpec().getCapacidade());
		System.out.println("Cor: "+sp1.getSpec().getCor());

		System.out.println("Sistema Operacional: "+sp1.getSpec().getSo().getSo());
		System.out.println("Versao: "+sp1.getSpec().getSo().getVersao());


	}

}