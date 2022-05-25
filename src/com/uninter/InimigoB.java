package com.uninter;

import java.util.Random;

public class InimigoB extends Computador {
	@Override
	public void jogar(Tabuleiro tabuleiro) {
		Random aleatorio = new Random(); // ele joga aleatoriamente enquanto ele conseguir ocupar um espaco
		while (super.jogar(tabuleiro, aleatorio.nextInt(4), aleatorio.nextInt(4)) == false) // se for falso continua
			;

	}

}
