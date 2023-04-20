//Nome Allisson Akio Suzuki - RA: 2476495

public class TstVeic{

	private static Passeio p1 = new Passeio();
	private static Carga c1 = new Carga();

	private static Leitura l = new Leitura();

	public static void main (String arg[]){

		
		System.out.println("\nCARRO DE PASSEIO:");

		System.out.println("\nMOTOR:");
		p1.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Quantidade de Pistoes: ")));
		p1.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia: ")));
		
		p1.setPlaca(l.entDados("Placa: "));
		p1.setMarca(l.entDados("Marca: "));
		p1.setModelo(l.entDados("Modelo: "));
		p1.setCor(l.entDados("Cor: "));
		p1.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de Rodas: ")));
		p1.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima: ")));

		if(p1.getVelocMax() < 10 || p1.getVelocMax() > 250){
			System.out.println("\nA velocidade esta fora dos limites brasileiros");
			p1.setVelocMax(100);
		}

		p1.setQtdePassageiro(Integer.parseInt(l.entDados("Quantidade de passageiros: ")));
		p1.setDataCadastro(l.entDados("Data de Cadastro (dd/mm/aaaa): "));


		System.out.println("\nCARRO DE CARGA:");

		System.out.println("\nMOTOR:");
		c1.getMotor().setQtdPistoes(Integer.parseInt(l.entDados("Quantidade de Pistoes: ")));
		c1.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia: ")));

		c1.setPlaca(l.entDados("Placa: "));
		c1.setMarca(l.entDados("Marca: "));
		c1.setModelo(l.entDados("Modelo: "));
		c1.setCor(l.entDados("Cor: "));
		c1.setQtdRodas(Integer.parseInt(l.entDados("Quantidade de Rodas: ")));
		c1.setVelocMax(Integer.parseInt(l.entDados("Velocidade Maxima: ")));

		if(c1.getVelocMax() < 10 || c1.getVelocMax() > 250){
			System.out.println("\nA velocidade esta fora dos limites brasileiros");
			c1.setVelocMax(100);
		}
				
		c1.setTara(Integer.parseInt(l.entDados("Tara: ")));
		c1.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima: ")));
		c1.setDataCadastro(l.entDados("Data de Cadastro (dd/mm/aaaa): "));


		System.out.println("\n\nVEICULO DE PASSEIO:");

		System.out.println("Data de Cadastro: "+p1.getDataCadastro());
		System.out.println("Quantidade de Pistoes: "+p1.getMotor().getQtdPistoes());
		System.out.println("Potencia: "+p1.getMotor().getPotencia()+" HP");
		System.out.println("Placa: "+p1.getPlaca()); 
		System.out.println("Marca: "+p1.getMarca());
		System.out.println("Modelo: "+p1.getModelo());
		System.out.println("Cor: "+p1.getCor());
		System.out.println("Quantidade de Rodas: "+p1.getQtdRodas());
		System.out.println("Velocidade Maxima: "+p1.calcVel()+" m/h");
		System.out.println("Quantidade de passageiros: "+p1.getQtdePassageiro());
		System.out.println("Passeio: "+p1.calcular());


		System.out.println("\n\nVEICULO DE CARGA:");

		System.out.println("Data de Cadastro: "+c1.getDataCadastro());
		System.out.println("Quantidade de Pistoes: "+c1.getMotor().getQtdPistoes());
		System.out.println("Potencia: "+c1.getMotor().getPotencia()+" HP");
		System.out.println("Placa: "+c1.getPlaca()); 
		System.out.println("Marca: "+c1.getMarca());
		System.out.println("Modelo: "+c1.getModelo());
		System.out.println("Cor: "+c1.getCor());
		System.out.println("Quantidade de Rodas: "+c1.getQtdRodas());
		System.out.println("Velocidade Maxima: "+c1.calcVel()+" cm/h");
		System.out.println("Tara: "+c1.getTara());
		System.out.println("Carga Maxima: "+c1.getCargaMax());
		System.out.println("Carga: "+c1.calcular());

	}

} 