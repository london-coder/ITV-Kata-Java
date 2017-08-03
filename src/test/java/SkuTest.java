package kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class SkuTest {
	@Test
	public void alphaTest() {
		Sku alpha = new Sku("A", 50);
		assertEquals(50, alpha.price );
	}
	@Test
	public void betaTest() {
		Sku beta = new Sku("B", 30);
		assertTrue(30 == beta.price);
	} 
	@Test
	public void gammaTest() {
		Sku gamma = new Sku("C", 20);
		assertEquals(20, gamma.price);
	}
	@Test
	public void deltaTest() {
		Sku delta = new Sku("D", 15);
		assertTrue(15 == delta.price);
	}

	// test discount Sku
	@Test
	public void alphaDiscount() {
		DiscountedSku alpha = new DiscountedSku(new Sku("A", 50), 3, 20);
		assertEquals(20, alpha.discountValue);
	}
	@Test
	public void alphaThreshold() {
		DiscountedSku alpha = new DiscountedSku(new Sku("A", 50), 3, 20);
		assertEquals(3, alpha.discountLevel);
	}
}