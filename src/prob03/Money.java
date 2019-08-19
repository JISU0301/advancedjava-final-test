package prob03;

public class Money {
	
	public Money(int i) {
		this.amount = i;
	}

	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Object add(Money three) {
		Money add = new Money(this.amount + three.getAmount());
		return add;
	}

	public Object minus(Money two) {
		Money min = new Money(this.amount - two.getAmount());
		return min;
	}

	public Object multiply(Money two) {
		Money multiply = new Money(this.amount * two.getAmount());
		return multiply;
	}

	public Object devide(Money five) {
		Money devide = new Money(this.amount / five.getAmount());
		return devide;
	}
    
    
}
