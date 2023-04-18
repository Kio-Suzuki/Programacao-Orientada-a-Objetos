package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc;
		
		do {
			System.out.println();
			System.out.println("1) INTEGER");
			System.out.println("2) BOOLEAN");
			System.out.println("3) CHARACTER");
			System.out.println("4) DOUBLE");
			System.out.println("5) BYTE");
			System.out.println("6) SHORT");
			System.out.println("7) FLOAT");
			System.out.println("8) LONG");
			System.out.println("0) SAIR");
			System.out.println();
			System.out.print("ESCOLHA UMA OPCAO: ");
			opc = sc.nextInt();
			
			switch(opc) {
			
			case 1:
				System.out.print("Digite um numero: ");
				Integer y = sc.nextInt();
				comparaInt(y);
				break;
				
			case 2:
				ObjBoolToPrim();
				break;
				
			case 3:
				Character c = ' ';
				System.out.print("Genero (M/F): ");
				c = sc.next().charAt(0);
				upperCase(c);
				break;
				
			case 4:
				Double d1;
				Double d2 = (double) 0.85;
				System.out.print("Valor do item 1: ");
				d1 = sc.nextDouble();
				d1 = (Double)(d1*d2);
				arredondaValor(d1);
				
				break;
				
			case 5:
				hexToDec();
				break;
				
			case 6:
				short a = 10;
				short d = 0;
				demonstracaoConversao(a, d);
				break;
				
			case 7:
				Float n = (float) 2.44444;
				float_String(n);
				break;
				
			case 8:
				LongToBin();
				break;
				
			case 0:
				System.out.println("Fim!");
				break;
				
			default:
				System.out.println("Opcao invalida");
				break;
			}
			
		}while(opc != 0);
	
		
		sc.close();
	}
	
	
	// I) Classe Integer: método compareTo;
	// II) Compara 2 Integer retorna 0 caso sejam iguais, valor menor que 0 caso o argumento seja maior e maior que 0 caso o argumento seja menor;
	// III) https://www.tutorialspoint.com/java/lang/java_lang_integer.htm
	
	public static void comparaInt(Integer y){ 
		Integer x = Integer.valueOf(100);
		if(x.compareTo(y) == 0) {
			System.out.println("O numero que voce digitou e igual ao numero misterioso");
		}else if(x.compareTo(y) < 0) {
			System.out.println("O numero que voce digitou e maior que o numero misterioso");
		}else {
			System.out.println("O numero que voce digitou e menor que o numero misterioso");
		}
	}

	// I) Classe Boolean: método valueOf() booleanValue();
	// II) Passa o valor de um Objeto do tipo Boolean para o tipo primitivo boolean;
	// III) https://www.tutorialspoint.com/java/lang/java_lang_boolean.htm 
	
	public static void ObjBoolToPrim(){ 
		Boolean bool1;
		bool1 = Boolean.valueOf(true);
		boolean bool2;
		bool2 = bool1.booleanValue();
		System.out.println("boolean primitivo = "+bool2);
	}

	// I) Classe Character: método toUpperCase();
	// II) Transforma uma letra minúscula em maiúscula, no exemplo é pedido para o usuário digitar M ou F para identificaçao do gênero, porem ele também aceita na essas letras na forma minúscula, alterando posteriormente na hora da apresentação dos dados;
	// III) https://www.tutorialspoint.com/java/lang/java_lang_character.htm
	
	public static void upperCase(Character c){ 
		System.out.println("Genero: "+Character.toUpperCase(c));
	}
	
	// I) Classe Double: intValue();
	// II) Retorna o valor do tipo Double como int;
	// III) https://www.tutorialspoint.com/java/lang/java_lang_double.htm#
		
	public static void arredondaValor(Double d1){ 
		System.out.println("Total arredondado com 15% de desconto: R$ "+d1.intValue());
		
	}
	
	// I) Classe Byte: decode();
	// II) Esse método recebe um string em hexadecimal e apresenta o resultado em decimal
	// III) https://www.tutorialspoint.com/java/lang/java_lang_byte.htm
			
	public static void hexToDec(){ 
		Byte b1 = Byte.decode("0x7F");
		System.out.println("0x7F em decimal e = "+b1);
	}
	
	// I) Classe Short: valueOf() e shortValue();
	// II) Demonstração do Autoboxing (conversão de tipo primitivo em objeto) e Unboxing (conversão de objeto em tipo primitivo)
	// III) https://www.tutorialspoint.com/java/lang/java_lang_short.htm
			
	public static void demonstracaoConversao(short a, short d){ 
		Short b = Short.valueOf(a);
		System.out.println("Exemplo de Autoboxing: "+b);
		d = b.shortValue();
		System.out.println("Exemplo de Unboxing: "+d);
	}
	
	// I) Classe Float: toString();
	// II) Converte Float para String
	// III) https://www.tutorialspoint.com/java/lang/java_lang_float.htm
				
	public static void float_String(Float n){ 
		System.out.println("Valor de n = "+Float.toString(n));	
	}
	
	// I) Classe Long: toBinaryString();
	// II) Retorna o valor do Long em binário
	// III) v
					
	public static void LongToBin(){ 
		Long num = (long) 4280;
		System.out.println(num+" em binario e = "+Long.toBinaryString(num));	
	}
	
}