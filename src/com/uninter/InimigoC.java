package com.uninter;

public class InimigoC extends Computador {
	
	public void jogar(Tabuleiro tab) { 
		for(int l = 3;l > 0;l --) {  // ele vai do final para o inciio
			for(int c = 3; c > 0; c--) { 
				if(super.jogar(tab, l, c) == true) {  // se conseguir ele retorna
					return;
				}
			}
		}
	}
	

}
