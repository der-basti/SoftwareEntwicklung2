package sne.exercise.sheet12;

import java.math.BigDecimal;
import java.util.Comparator;

class NumberComparator implements Comparator<Number> {

	@Override
	public int compare(Number a, Number b) {
		return new BigDecimal(a.toString()).compareTo(new BigDecimal(b
				.toString()));
	}

}
