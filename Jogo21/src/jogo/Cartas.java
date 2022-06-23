package jogo;
import java.util.ArrayList;
import java.util.Collections;

//Esse c�digo ficou simplesmente HORR�VEL.
public class Cartas{
private static int jpontos=0;
private int jcarta=0;
private int jcarta2=0;
private int jcarta3=0;
private int jcarta4=0;
private int jcarta5=0;

private static int mpontos=0;
private int mcarta=0;
private int mcarta2=0;
private int mcarta3=0;
private int mcarta4=0;
private int mcarta5=0;

private boolean v=false;
private String nome;
private String nomeSeg;
private ArrayList<Integer> jcartas = new ArrayList<Integer>();
private ArrayList<Integer> mcartas = new ArrayList<Integer>();

public Cartas(String nome) {
this.nome=nome;
jpontos=0;
mpontos=0;
}

//Embaralha as cartas do jogador e coloca elas num arraylist
public void EmbaralharJ() {
	for(int i=1;i<14;++i) { 
		jcartas.add(i);
		Collections.shuffle(jcartas);
	}
}


public String getNome() {
	nomeSeg=nome;
	return nomeSeg;
}

//Embaralha as cartas da maquina e coloca elas num arraylist
public void Embaralharm() {
		for(int i=1;i<14;i++) { 
			mcartas.add(i);
			Collections.shuffle(mcartas);
	}
	
}
public void PegarcartaJ() {
	jcarta=jcartas.get(0);
	
	switch(jcarta) {
	case 1: System.out.println("Carta retirada: �s/1");
			jpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			jpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			jpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			jpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+jcarta);
			jpontos +=jcarta;
	
	}
}

public void PegarcartaJ2() {
	jcarta2=jcartas.get(1);
	
	switch(jcarta2) {
	case 1: System.out.println("Carta retirada: �s/1");
			jpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			jpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			jpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			jpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+jcarta2);
			jpontos +=jcarta2;
	}
}


public void PegarcartaJ3() {
	jcarta3=jcartas.get(2);
	
	switch(jcarta3) {
	case 1: System.out.println("Carta retirada: �s/1");
			jpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			jpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			jpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			jpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+jcarta3);
			jpontos +=jcarta3;
	}
}
public void PegarcartaJ4() {
	jcarta4=jcartas.get(3);
	
	switch(jcarta4) {
	case 1: System.out.println("Carta retirada: �s/1");
			jpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			jpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			jpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			jpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+jcarta4);
			jpontos +=jcarta4;
	}
}

public void PegarcartaJ5() {
	jcarta5=jcartas.get(4);
	
	switch(jcarta5) {
	case 1: System.out.println("Carta retirada: �s/1");
			jpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			jpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			jpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			jpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+jcarta5);
			jpontos +=jcarta5;
	}
}



public void PegarcartaM() {
	mcarta=mcartas.get(0);

	switch(mcarta) {
	case 1: System.out.println("Carta retirada: �s/1");
			mpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			mpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			mpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			mpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+mcarta);
			mpontos += mcarta;
	}
}


public void PegarcartaM2() {
	mcarta2=mcartas.get(1);

	switch(mcarta2) {
	case 1: System.out.println("Carta retirada: �s/1");
			mpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			mpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			mpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			mpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+mcarta2);
			mpontos += mcarta2;
	}
}

public void PegarcartaM3() {
	mcarta3=mcartas.get(2);

	switch(mcarta3) {
	case 1: System.out.println("Carta retirada: �s/1");
			mpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			mpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			mpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			mpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+mcarta3);
			mpontos += mcarta3;
	}
}

public void PegarcartaM4() {
	mcarta4=mcartas.get(3);
	
	switch(mcarta4) {
	case 1: System.out.println("Carta retirada: �s/1");
			mpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			mpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			mpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			mpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+mcarta4);
			mpontos += mcarta4;
	}
}

public void PegarcartaM5() {
	mcarta5=mcartas.get(4);

	switch(mcarta5) {
	case 1: System.out.println("Carta retirada: �s/1");
			mpontos +=1;
			break;
	case 11: System.out.println("Carta retirada: J/10");
			mpontos +=10;
			break;
	case 12: System.out.println("Carta retirada: K/10");
			mpontos +=10;
			break;
	case 13:System.out.println("Carta retirada: Q/10");
			mpontos +=10;
			break;
	default: System.out.println("Carta retirada: "+mcarta5);
			mpontos += mcarta5;
	}
}

public void ContarPontosJ() {
	System.out.println("Pontos Jogador:"+jpontos);
}

public void ContarPontosM() {
	System.out.println("Pontos M�quina:"+mpontos);
}

public void decidirVitoria() {
	
	if(jpontos>mpontos&&jpontos<=21) {
		System.out.println("\n Jogador ganhou!!!");
	}
	if(mpontos>jpontos&&mpontos<=21) {
		System.out.println("\n M�quina ganhou!!!");
	}
	if(jpontos>21) {
		System.out.println("\n Jogador Estourou!!!");
		System.out.println("\n M�quina ganhou!!!");
	}
	if(mpontos>21) {
		System.out.println("\n M�quina Estourou!!!");
		System.out.println("\n Jogador ganhou!!!");
	}
	if (mpontos==jpontos) {
		System.out.println("\nM�quina  ganhou!!!");
	}
		 System.out.println();
		 ContarPontosM();
		 ContarPontosJ();
		 v=true;
}
public boolean compararPontos() {
	if(mpontos<jpontos) {
		return true;
	}
	return false;
}

public boolean verificarEstouro() {
	if(mpontos>21) {
	return true;
	}
	if(jpontos>21) {
	return true;
	}
	return false;
}

public boolean getV() {
	return v;
}
}
