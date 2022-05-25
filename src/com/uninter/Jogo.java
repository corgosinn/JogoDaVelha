package com.uninter;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Computador botInimigo;
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador playerHumano = new Jogador();
		Scanner input = new Scanner(System.in);
		System.out.println("JOGO DA VELHA");
		System.out.println("Escolha qual bot: 1 - 2 - 3 :");
		int opcao = input.nextInt();
		
		if (opcao == 1) { // OS TRES DIFERENTES JEITOS DO BOT
			botInimigo = new InimigoA();
		} else if (opcao == 2) {
			botInimigo = new InimigoB();
		} else {
			botInimigo = new InimigoC();
		}
		// VE QUAL A RODADA
		int rodada = 1;
		tabuleiro.visualizar();
		while (tabuleiro.situacao() == 0) {

			if (rodada == 1) { //rodada do jogador 1
				playerHumano.jogar(tabuleiro, input); 
				rodada = 2; // muda  a rodada
			} else if (rodada == 2) { // rodada do bot inimigo
				botInimigo.jogar(tabuleiro);
				rodada = 1; // muda pro jogador
			}

			tabuleiro.visualizar(); // printa a matriz

		} // OLHA QUEM GANHOU
		if (tabuleiro.situacao() == 1) { // alguem ganhou
			if (rodada == 2) { // se tiver na rodada do bot, o ultimo a jogar foi o player
				System.out.println("\n\nVOCÊ GANHOU!!!!\n");
				tabuleiro.visualizar();
			} else {
				System.out.println("\n\nO BOT TE VENCEU!\n");
				tabuleiro.visualizar();
			}
		} else { // aqui deu -1, empate
			System.out.println("DEU VELHA! TENTE NOVAMENTE");
			tabuleiro.visualizar();
		}

		input.close();

	}

}
