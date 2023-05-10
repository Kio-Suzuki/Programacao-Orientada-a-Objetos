package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Filme;
import entities.Serie;

import entities.ConteudoStreaming;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		List<ConteudoStreaming> list = new ArrayList<>();
		
		System.out.println("FILME");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Genero: ");
		String genero = sc.nextLine();
		System.out.print("Stream: ");
		String stream = sc.nextLine();
		System.out.print("Estudio: ");
		String estudio = sc.nextLine();
		System.out.print("Duracao(min): ");
		int duracao = sc.nextInt();
		list.add(new Filme(nome, genero, stream, estudio, duracao));
		
		sc.nextLine();
		
		System.out.println("FILME");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Genero: ");
		genero = sc.nextLine();
		System.out.print("Stream: ");
		stream = sc.nextLine();
		System.out.print("Estudio: ");
		estudio = sc.nextLine();
		System.out.print("Duracao(min): ");
		duracao = sc.nextInt();
		list.add(new Filme(nome, genero, stream, estudio, duracao));
		
		for(ConteudoStreaming conteudoStreaming : list) {
			System.out.println(conteudoStreaming.getNome());
		}
		
		sc.close();
	}

}
