package kata;

import java.util.Map;
import java.util.HashMap;

public final class Inventory {
	Map<String, Integer> inventory = new HashMap() {{
		put("A", 50);
		put("B", 30);
		put("C", 20);
		put("D", 15);
	}};
}