package br.exercicios.ex01;

import java.util.Random;

public class TesteImpressao {

	public static void main(String[] args) {
		
		
		 ImpressaoArquivoOutput imprime = new ImpressaoArquivoOutput();
		 ImpressaoNaTela imprime2 = new ImpressaoNaTela();
		 
		   Random gerador = new Random(); 
	       int x = gerador.nextInt();
	        
	        switch (x%2){
	        case 0:
	        	imprime.escreve();
	            break;
	            
	        case 1:
	        	 imprime2.escreve();
	        	 
	        }
	       
	    }
	
		 
		 
		
		
		

	

}
