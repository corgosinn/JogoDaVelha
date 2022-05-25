package com.uninter;

public class InimigoA extends Computador {

	@Override
	public void jogar(Tabuleiro tabuleiro) {
		// ele joga na ordem certinha
		for (int l = 1; l < 4; l++) { //
			for (int c = 1; c < 4; c++) {
				if (super.jogar(tabuleiro, l, c) == true) { // se conseguiu jogar ele retorna
					return;
				}
			}
		}
	}

}
