package Wrappers;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		int opc = sc.nextInt();
		
		switch(opc) {
		
		case 1:
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
			
		case 5:
			break;
			
		case 6:
			break;
			
		case 7:
			break;
			
		case 8:
			break;
			
		case 0:
			System.out.println("Fim!");
			
		default:
			System.out.println("Opcao invalida");
			break;
		}
		
		sc.close();
		
	}
	
	public void converteStr_Int(String str){ 
		int x = Integer.parseInt(str);
	}

	public void converteStr_Bool(String str){ 
		boolean x = Boolean.parseBoolean(str);
	}

	public void converteStr_Char(String str){ 
		//char x = Character.parseCharacter(str);
	}

	public void converteStr_Double(String str){ 
		double x = Double.parseDouble(str);
	}

	public void converteStr_Byte(String str){ 
		byte x = Byte.parseByte(str);
	}

	public void converteStr_Short(String str){ 
		short x = Short.parseShort(str);
	}

	public void converteStr_Float(String str){ 
		float x = Float.parseFloat(str);
	}

	public void converteStr_Long(String str){ 
		int x = Integer.parseInt(str);
	}
	

}
