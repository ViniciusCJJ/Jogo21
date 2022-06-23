package jogo;
import java.io.BufferedReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
	int i=0;
	BufferedReader leitor = new BufferedReader(new java.io.InputStreamReader(System.in));
		do{
		
			System.out.println("");
		    System.out.println("O que voc� deseja fazer?");
		    System.out.println("0 - Sair do jogo");
		    System.out.println("1 - Jogar");
		    String opcao = leitor.readLine().trim();
		    switch (opcao) {
		    case "0": {
		    	System.out.println("\nSaindo do jogo, at� a pr�xima!");
		    	i+=1;
	    		break;
	    	}
			
		    
		    case "1": {
		    System.out.println("Insira seu nome:");
		    String nome = leitor.readLine().trim();
		    Cartas jogador=new Cartas(nome);
		    Cartas maquina=new Cartas("M�quina");

			    jogador.EmbaralharJ();
			    maquina.Embaralharm();
			
			    System.out.println("Jogador:"+jogador.getNome());
			    System.out.println("Cartas atuais: ");
			    System.out.println("Primeira carta: ");
			    jogador.PegarcartaJ();
			    System.out.println("Segunda carta: ");
			    jogador.PegarcartaJ2();
			    jogador.ContarPontosJ();
			    System.out.println();
			    System.out.println("M�quina ");
			    System.out.println("Primeira carta: ");
			    maquina.PegarcartaM();
			    maquina.ContarPontosM();
			    	System.out.println("");
			    	System.out.println("O que voc� deseja fazer?");
			    	System.out.println("0 - Parar");
				    System.out.println("1 - Pegar mais uma carta");
				    String op = leitor.readLine().trim();
				    switch (op) {
				    case "0": {
				    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
				    	jogador.ContarPontosJ();
				    	System.out.println("Pontos totais da M�quina: ");
				    	maquina.ContarPontosM();
				    	if(maquina.compararPontos()!=true) {
				    		maquina.decidirVitoria();
				    		break;
				    	}else
				    	System.out.println("M�quina ");
					    System.out.println("Segunda carta: ");
					    maquina.PegarcartaM2();
					    if(maquina.compararPontos()!=true) {
				    		maquina.decidirVitoria();
				    		break;
				    	}else 
				    	System.out.println("M�quina ");
			    		System.out.println("Terceira carta: ");
			    		maquina.PegarcartaM3();
			    		if(maquina.compararPontos()!=true) {
			    			maquina.decidirVitoria();
			    			break;
				    	}else
				    	System.out.println("M�quina ");
			    		System.out.println("Quarta carta: ");
			    		maquina.PegarcartaM4();
			    		if(maquina.compararPontos()!=true) {
			    			maquina.decidirVitoria();
			    			break;
			    		}else
			    		System.out.println("M�quina ");
			    		System.out.println("Quinta carta: ");
			    		maquina.PegarcartaM5();
			    		if(maquina.compararPontos()!=true) {
			    			maquina.decidirVitoria();
			    			break;
			    		}else
			    			maquina.decidirVitoria();
			    		break;
			    	}
				    case "1": {
				    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
				    	jogador.ContarPontosJ();
				    	System.out.println("Pontos totais da M�quina: ");
				    	maquina.ContarPontosM();
				    	System.out.println("Jogador ");
			    		System.out.println("Terceira carta: ");
					    jogador.PegarcartaJ3();
					    jogador.ContarPontosJ();
					    if(maquina.verificarEstouro() !=false) {
					    	maquina.decidirVitoria();
					    	break;
					    }
				    }
				    }if(maquina.getV()==true)break;
					    System.out.println("");
				    	System.out.println("O que voc� deseja fazer?");
				    	System.out.println("0 - Parar");
					    System.out.println("1 - Pegar mais uma carta");
					    String op2 = leitor.readLine().trim();
					    switch (op2) {
					    case "0": {
					    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
					    	jogador.ContarPontosJ();
					    	System.out.println("Pontos totais da M�quina: ");
					    	maquina.ContarPontosM();
					    	if(maquina.compararPontos()!=true) {
					    		maquina.decidirVitoria();
					    		break;
					    	}else
					    	System.out.println("M�quina ");
						    System.out.println("Segunda carta: ");
						    maquina.PegarcartaM2();
						    if(maquina.compararPontos()!=true) {
					    		maquina.decidirVitoria();
					    		break;
					    	}else 
					    	System.out.println("M�quina ");
				    		System.out.println("Terceira carta: ");
				    		maquina.PegarcartaM3();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
					    	}else
					    	System.out.println("M�quina ");
				    		System.out.println("Quarta carta: ");
				    		maquina.PegarcartaM4();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
				    		}else
				    		System.out.println("M�quina ");
				    		System.out.println("Quinta carta: ");
				    		maquina.PegarcartaM5();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
				    		}else
				    			maquina.decidirVitoria();
				    		break;
				    }
					    case "1": {
					    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
					    	jogador.ContarPontosJ();
					    	System.out.println("Pontos totais da M�quina: ");
					    	maquina.ContarPontosM();
					    	System.out.println("Jogador ");
				    		System.out.println("Quarta carta: ");
						    jogador.PegarcartaJ4();
						    jogador.ContarPontosJ();
						    if(maquina.verificarEstouro() !=false) {
						    	maquina.decidirVitoria();
						    	break;
						    }
						    break;
				  }//
		        }if(maquina.getV()==true)break;
					    System.out.println("");
				    	System.out.println("O que voc� deseja fazer?");
				    	System.out.println("0 - Parar");
					    System.out.println("1 - Pegar mais uma carta");
					    String op3 = leitor.readLine().trim();
					    switch (op3) {
					    case "0": {
					    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
					    	jogador.ContarPontosJ();
					    	System.out.println("Pontos totais da M�quina: ");
					    	maquina.ContarPontosM();
					    	if(maquina.compararPontos()!=true) {
					    		maquina.decidirVitoria();
					    		break;
					    	}else
					    	System.out.println("M�quina ");
						    System.out.println("Segunda carta: ");
						    maquina.PegarcartaM2();
						    if(maquina.compararPontos()!=true) {
					    		maquina.decidirVitoria();
					    		break;
					    	}else 
					    	System.out.println("M�quina ");
				    		System.out.println("Terceira carta: ");
				    		maquina.PegarcartaM3();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
					    	}else
					    	System.out.println("M�quina ");
				    		System.out.println("Quarta carta: ");
				    		maquina.PegarcartaM4();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
				    		}else
				    		System.out.println("M�quina ");
				    		System.out.println("Quinta carta: ");
				    		maquina.PegarcartaM5();
				    		if(maquina.compararPontos()!=true) {
				    			maquina.decidirVitoria();
				    			break;
				    		}else
				    			maquina.decidirVitoria();
				    		break;
					    }
						    case "1": {
						    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
						    	jogador.ContarPontosJ();
						    	System.out.println("Pontos totais da M�quina: ");
						    	maquina.ContarPontosM();
						    	System.out.println("Jogador ");
					    		System.out.println("Quinta carta: ");
							    jogador.PegarcartaJ5();
						    	System.out.println("Pontos totais do jogador: "+jogador.getNome());
						    	jogador.ContarPontosJ();
						    	System.out.println("Pontos totais da M�quina: ");
						    	maquina.ContarPontosM();
						    	if(maquina.compararPontos()!=true) {
						    		maquina.decidirVitoria();
						    		break;
						    	}else
						    	System.out.println("M�quina ");
							    System.out.println("Segunda carta: ");
							    maquina.PegarcartaM2();
							    if(maquina.compararPontos()!=true) {
						    		maquina.decidirVitoria();
						    		break;
						    	}else 
						    	System.out.println("M�quina ");
					    		System.out.println("Terceira carta: ");
					    		maquina.PegarcartaM3();
					    		if(maquina.compararPontos()!=true) {
					    			maquina.decidirVitoria();
					    			break;
						    	}else
						    	System.out.println("M�quina ");
					    		System.out.println("Quarta carta: ");
					    		maquina.PegarcartaM4();
					    		if(maquina.compararPontos()!=true) {
					    			maquina.decidirVitoria();
					    			break;
					    		}else
					    		System.out.println("M�quina ");
					    		System.out.println("Quinta carta: ");
					    		maquina.PegarcartaM5();
					    		if(maquina.compararPontos()!=true) {
					    			maquina.decidirVitoria();
					    			break;
					    		}else
					    			maquina.decidirVitoria();
					    		break;
					    }
		      }if(maquina.getV()==true)break;
		    }
		  }		  
	}while(i==0);
	}	
}