package com.uninter;

public class Computador {

	public void jogar(Tabuleiro tabuleiro) {

	}

	public boolean jogar(Tabuleiro tabuleiro, int x, int y) {
		if ((x >= 1 && x <= 3 && y >= 1 && y <= 3)) {  
			if (tabuleiro.matriz[x - 1][y - 1] == 0) { // se a posicao nao tiver ocupada
				tabuleiro.matriz[x - 1][y - 1] = -1; // ele coloca o numero do bot
				return true;
			}
		}
		return false; // se retornar falso ja foi ocupado
	}

}
