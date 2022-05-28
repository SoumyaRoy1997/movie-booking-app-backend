package com.mindtree.movieBookingApp.entity;



public class payment {
	
	private String type;
	private String card;
	private String upi;
	private String bank;
	private String upiMerchant;
	private String cardType;
	private String pin;
	
	public payment(String type, String card, String upi, String bank, String upiMerchant, String cardType, String pin) {
		super();
		this.type = type;
		this.card = card;
		this.upi = upi;
		this.bank = bank;
		this.upiMerchant = upiMerchant;
		this.cardType = cardType;
		this.pin = pin;
	}
	public payment() {
		super();
	}
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getUpi() {
		return upi;
	}
	public void setUpi(String upi) {
		this.upi = upi;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getUpiMerchant() {
		return upiMerchant;
	}
	public void setUpiMerchant(String upiMerchant) {
		this.upiMerchant = upiMerchant;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
		result = prime * result + ((pin == null) ? 0 : pin.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((upi == null) ? 0 : upi.hashCode());
		result = prime * result + ((upiMerchant == null) ? 0 : upiMerchant.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		payment other = (payment) obj;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		if (pin == null) {
			if (other.pin != null)
				return false;
		} else if (!pin.equals(other.pin))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (upi == null) {
			if (other.upi != null)
				return false;
		} else if (!upi.equals(other.upi))
			return false;
		if (upiMerchant == null) {
			if (other.upiMerchant != null)
				return false;
		} else if (!upiMerchant.equals(other.upiMerchant))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "payment [type=" + type + ", card=" + card + ", upi=" + upi + ", bank=" + bank + ", upiMerchant="
				+ upiMerchant + ", cardType=" + cardType + ", pin=" + pin + "]";
	}
	
	
}
