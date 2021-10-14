package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player owner;
	private int price = 0;

	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return owner;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public boolean isAvailable() {
		return available;
	}

	public abstract void playAction();

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public String toString() {
		return name;
	}
}
