package chapter7;

import chapter6.SutdaCard;

class SutdaDeck1 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck1() {
		for (int i = 0; i < CARD_NUM; i++) {
			int num = (int) (i + 2) / 2;
			boolean isKwang = ((i + 2) % 2 == 0) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for (int n = 0; n < CARD_NUM; n++) {
			int i = (int) (Math.random() * cards.length);
			int j = (int) (Math.random() * cards.length);

			SutdaCard temp = cards[i];
			cards[i] = cards[j];
			cards[j] = temp;
		}
	}

	SutdaCard pick(int index) {
		if (index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}

	SutdaCard pick() {
		int index = (int) (Math.random() * cards.length);
		return cards[index];
	}
}

class SutdaCard1 {
	int num;
	boolean isKwang;

	SutdaCard1() {
		this(1, true);
	}

	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_2 {
	public static void main(String args[]) {
		SutdaDeck1 deck = new SutdaDeck1();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}