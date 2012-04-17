package sne.exercise.sheet5;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

	@Test
	public void testProducts() {

		Product p1 = new Product("SC120-C", "BALLANTINES", 8.0, 2);
		Assert.assertEquals(
				"SC120-C \"BALLANTINES\" cost:8.0€ retail price:15€ storage time:2 months",
				p1.toString());

		Product p2 = new Product("SC123-F", "DUFFY MALT Whisky", 10.0, 6);
		Assert.assertEquals(
				"SC123-F \"DUFFY MALT Whisky\" cost:10.0€ retail price:19€ storage time:6 months",
				p2.toString());

		Product p3 = new Product("SC347-A", "GLEN MORANGIE MALT Whisky", 55.0,
				15);
		Assert.assertEquals(
				"SC347-A \"GLEN MORANGIE MALT Whisky\" cost:55.0€ retail price:104€ storage time:15 months",
				p3.toString());
	}
}
