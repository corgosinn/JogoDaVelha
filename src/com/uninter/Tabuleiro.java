package com.uninter;

public class Tabuleiro {

	public void visualizar() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 1) { // se a matriz for 1 printa o X do jogador
					System.out.print("X ");
				} else if (matriz[i][j] == -1) {
					System.out.print("O "); // se for 0 é o bot
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}

	}

	public int matriz[][] = new int[3][3];

	public int situacao() { // aqui ele verifica todas as formas de ganhar o jogo
		boolean WINNER01 = true, WINNER02 = true, WINNER03 = true, WINNER04 = true, EMPATE = true;

		for (int x = 0; x < 3; x++) {
			WINNER01 = true;
			WINNER02 = true;
			for (int y = 0; y < 3; y++) {
				if (y != 0) {
					if (x == y) {
						if (this.matriz[x][y] != this.matriz[x - 1][y - 1] || this.matriz[x][y] == 0) {
							WINNER03 = false; // se cancelou a diagonal
						}
					}
					if (this.matriz[x][y] != this.matriz[x][y - 1] || this.matriz[x][y] == 0) {
						WINNER01 = false; // se cancelar a linha
					}
					if (this.matriz[y][x] != this.matriz[y - 1][x] || this.matriz[y][x] == 0) {
						WINNER02 = false; // se nao ganhou pela coluna 
					}
				}
			}
			if (WINNER01 == true || WINNER02 == true) { // se algum tiver true, alguem ganhou
				return 1;
			}
		}
		for (int x = 0, y = 2; x < 3; x++, y--) { // aqui ele olha a diagonal secundaria
			if (x != 0) {
				if (this.matriz[x][y] != this.matriz[x - 1][y + 1] || this.matriz[x][y] == 0) {
					WINNER04 = false;
				}
			}
		}
		for (int x = 0; x < 3; x++) { // aqui olha se deu empate
			for (int y = 0; y < 3; y++) {
				if (this.matriz[x][y] == 0) {
					EMPATE = false;
				}
			}

		}

		if (WINNER03 == true || WINNER04 == true) { // se tiver true, alguem ganhou
			return 1;
		}
		if (EMPATE == true) {
			return -1; // se deu empate retorna -1
		}
		return 0;
	}

}
