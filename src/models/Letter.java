package models;

public class Letter {

	private String letter;
	private int use;
	
	public Letter(String letter, int use) {
		this.letter = letter;
		this.use = use;
	}

	public Letter(String letter) {
		this.letter = letter;
	}

	public int getUse() {
		return use;
	}

	public void setUse(int use) {
		this.use = use;
	}

	public String getLetter() {
		return letter;
	}
	
}
