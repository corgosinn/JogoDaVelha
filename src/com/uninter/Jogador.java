package com.uninter;

import java.util.Scanner;

public class Jogador {

	public void jogar(Tabuleiro tabuleiro, Scanner input) { 
		int x = 0; // linha da matriz
		int y = 0; // coluna da matriz
		while (x < 1 || x > 3 || y < 1 || y > 3) { 
			System.out.println("DIGITE A LINHA (1,2,3):  ");
			x = input.nextInt();  // pega a linha

			System.out.println("DIGITE A COLUNA (1,2,3):  ");
			y = input.nextInt(); // pega a coluna
			if ((x >= 1 && x <= 3 && y >= 1 && y <= 3)) { 
				//se a posicao tiver vazia ele joga				
				if (tabuleiro.matriz[x - 1][y - 1] == 0) {  
					tabuleiro.matriz[x - 1][y - 1] = 1; 
					//se tiver ocupada ele da erro
				} else {
					System.out.println("JA JOGARAM NESTA POSIÇÃO");
					x = y = 0;  // a repeticao continua
				}
			} else {
				System.out.println("DIGITE 1, 2 OU 3"); // pede pra o usuario o digito certo
			}
		}

	}

}
