package atividade7exercicio2;

import java.util.Scanner;
import java.util.Stack;

public class atividade7ex2 {
	
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        Stack <String> acervo = new Stack<>();
	        boolean pilha = true;
	        int num  =0;
	        while (pilha) {
	            System.out.println(        "(1) Adicionar Livro\r\n"
	            		+ "	                    (2) Listar todos os livros\r\n"
	            		+ "	                    (3) Remover livro \r\n"
	            		+ "	                    (0) Sair");
	            
	            System.out.println("Digite uma opção:");
	            int Input = ler.nextInt();
	            switch (Input) {
	            
	            case 1:
	                    System.out.println("Digite o nome do livro:");
	                    String livro = ler.next();
	                    ler.nextLine();
	                    String livros = ler.nextLine();
	                    acervo.push(livro);
	                    System.out.println("Livro adicionado");
	                    break;
	            case 2:
	                    System.out.println("Lista de livos:");	                    
	                    
	                    if (acervo.isEmpty()) {

	                        System.out.println();
	                    } else {
	                        for (String nome : acervo ) {
	                            System.out.println(nome);
	                        }
	                        pilha = false;
	                        break;
	                    }
	                    break;
	            case 3:
	                    
	                    if (acervo.isEmpty()){
	                        System.out.println();
	                        break;
	                    }else {
	                        acervo.pop();
	                        for (String nome : acervo) {
	                            System.out.println(nome);
	                        }
	                        System.out.println("Livro removido");
	                        pilha = false;
	                        break;
	                    }
	                    
	            case 0:
					System.out.println("Fim");
					acervo.clear();
					break;
				default:
					System.out.println("Erro");
				}

			}
	        while( num != 0);


		ler.close();
	                
	                    
	            }
	        
	    

}

