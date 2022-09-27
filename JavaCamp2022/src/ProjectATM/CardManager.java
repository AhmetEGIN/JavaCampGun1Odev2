package ProjectATM;

import java.util.ArrayList;

public class CardManager {
	ArrayList<Card> cards;

	public CardManager() {
		cards = new ArrayList<Card>();
		Card card1 = new VisaCard();
		card1.setUserName("AhmetEGIN");
		card1.setPassword("123456");
		card1.setBalance(5000);

		cards.add(card1);

	}

	public void Add(Card card) {
		if (IsPasswordValid(card)) {
			cards.add(card);
		} else {
			System.out.println("Hata");
		}
	}

	public void UpdateForWithdrawal(Card card, int amount) {
		card.setBalance(card.getBalance() - amount);
	}
	public void UpdateForDeposit(Card card, int amount) {
		card.setBalance(card.getBalance() + amount);
	}

	public Card GetCard(String userName, String password) {
		for (Card _card : cards) {
			// iki ifadenin referans�n� kar��la�t�r�ken == kullan�l�r
			// iki ifadenin de�erini yani i�eri�ini .equals(value) ile kar��la�t�rabiliriz
			if (_card.getUserName().equals(userName) && _card.getPassword().equals(password)) {
				return _card;
			}
		}
		return null;
	}

	private boolean IsPasswordValid(Card card) {
		if (card.getPassword().length() < 5) {
			System.out.println("�ifre uzunlu�u 5 basamaktan fazla olmal�d�r");
			return false;
		} else {
			return true;
		}
	}

}
