package kata;

public final class Sku {
	final String name;
	final int price;

	@Override public int hashCode() { return name.hashCode() + price; }
	@Override public boolean equals(Object o) { return false; } // TODO
	@Override public String toString() {
		return String.format("%s costs %dpence", name, price);
	}

	public Sku(String n, int p) {
		this.name = n;
		this.price = p;
	}
}
