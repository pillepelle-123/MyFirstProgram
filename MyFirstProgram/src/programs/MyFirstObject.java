package programs;

public class MyFirstObject {
	private String color = "non-colored";
	
	/**
	 * Objekt erstellen mit Farbe = non-colored
	 */
	public MyFirstObject () {
	}
	
	/**
	 * Objekt erstellen mit definierter Farbe (color)
	 */
	public MyFirstObject(String color) {
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
