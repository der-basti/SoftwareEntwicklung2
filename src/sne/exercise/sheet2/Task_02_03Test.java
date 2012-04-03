package sne.exercise.sheet2;

import org.junit.Assert;
import org.junit.Test;

public class Task_02_03Test {

	@Test
	public void testDayDifference() {
		
		Date date1 = new Date(1,1,2011);
		Date date2 = new Date(12,31,2011);
		
		Date date3 = new Date(1,1,2012);
		Date date4 = new Date(12,31,2012);
		
		Assert.assertEquals(364, date1.getDayDifference(date2));
		Assert.assertEquals(365, date3.getDayDifference(date4));
		
		Assert.assertEquals(365, date1.getDayDifference2(date1, date2));
		Assert.assertEquals(366, date3.getDayDifference2(date3, date4));
	}
}
