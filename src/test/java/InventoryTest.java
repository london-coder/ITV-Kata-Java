package kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class InventoryTest {
	Inventory inv = new Inventory();

	@Test
	public void inventorySize() {
		assertEquals(4, inv.inventory.size());
	}
	@Test
	public void skuEntryA() {
		assertTrue(inv.inventory.containsKey("A"));
	}
	@Test
	public void skuEntryB() {
		assertTrue(inv.inventory.containsKey("B"));
	}

}