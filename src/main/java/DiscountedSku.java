package kata;

public final class DiscountedSku {
	final Sku item;
	final int discountLevel;
	final int discountValue;

	@Override public int hashCode() { return item.name.hashCode() + (discountLevel * discountValue); }
	@Override public boolean equals(Object o) { return false; } // TODO
	@Override public String toString() {
		return String.format("%s discounts %dpence for multiples of %d", item.name, discountValue, discountLevel);
	}

	public DiscountedSku(Sku a, int threshold, int reduction) {
		item = new Sku(a.name, a.price);
		this.discountLevel = threshold;
		this.discountValue = reduction;
	}
}