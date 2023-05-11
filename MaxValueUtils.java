package com.intexsoft;

import java.util.List;

public class MaxValueUtils {

	public int getMaxValue(List<Integer> inputValues) {
		int max = inputValues.isEmpty() ? 0 : inputValues.get(0);

		for (Integer currentValue : inputValues) {
			if (currentValue > max) {
				max = currentValue;
			}
		}

		return max;
	}


	public int getSecondMaxValue(List<Integer> inputValues) {
		if (inputValues.isEmpty() || inputValues.size() < 2) {
			return 0;
		}
		int max;
		int secondMax;
		if (inputValues.get(0) > inputValues.get(1)) {
			max = inputValues.get(0);
			secondMax = inputValues.get(1);
		} else {
			max = inputValues.get(1);
			secondMax = inputValues.get(0);
		}

		for (int i = 2; i < inputValues.size(); i++) {
			int currentValue = inputValues.get(i);
			if (currentValue > max) {
				secondMax = max;
				max = currentValue;
			} else if (currentValue > secondMax) {
				secondMax = currentValue;
			}
		}

		return secondMax;
	}

}
