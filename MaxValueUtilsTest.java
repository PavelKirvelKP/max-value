package com.intexsoft;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaxValueUtilsTest {
	private static final MaxValueUtils maxValueUtils = new MaxValueUtils();

	private final List<Integer> INPUT_VALUES = List.of(-4, 3, 1, 4, 5, 7 , 0);
	private final List<Integer> MAX_ELEMENT_LAST_POSITION = List.of(10, -5, -4, 3, 11);
	private final List<Integer> NEGATIVE_VALUES_LIST = List.of(-1, -3, -4, -6, -2, -3);
	private final List<Integer> EMPTY_INPUT_VALUES = List.of();
	private final List<Integer> WRONG_SIZE_INPUT_VALUES = List.of(1);

	@Test
	@DisplayName("should return correct max value")
	public void getMaxTest() {
		assertEquals(7, maxValueUtils.getMaxValue(INPUT_VALUES));
	}

	@Test
	@DisplayName("should return 0 for empty list")
	public void getMaxTestEmptyList() {
		assertEquals(0, maxValueUtils.getMaxValue(EMPTY_INPUT_VALUES));
	}

	@Test
	@DisplayName("should return correct max element for last position")
	public void getMaxTestLastPosition() {
		assertEquals(11, maxValueUtils.getMaxValue(MAX_ELEMENT_LAST_POSITION));
	}

	@Test
	@DisplayName("should return correct max element for negative values list")
	public void getMaxTestNegativeValues() {
		assertEquals(-1, maxValueUtils.getMaxValue(NEGATIVE_VALUES_LIST));
	}

	@Test
	@DisplayName("should return correct second max element")
	public void getSecondMaxTest() {
		assertEquals(5, maxValueUtils.getSecondMaxValue(INPUT_VALUES));
	}

	@Test
	@DisplayName("should return 0 for empty list")
	public void getSecondMaxTestEmptyList() {
		assertEquals(0, maxValueUtils.getSecondMaxValue(EMPTY_INPUT_VALUES));
	}

	@Test
	@DisplayName("should return 0 for wrong list size")
	public void getSecondMaxTestWrongListSize() {
		assertEquals(0, maxValueUtils.getSecondMaxValue(WRONG_SIZE_INPUT_VALUES));
	}

	@Test
	@DisplayName("should return correct second max element for negative values list")
	public void getSecondMaxTestNegativeValues() {
		assertEquals(-2, maxValueUtils.getSecondMaxValue(NEGATIVE_VALUES_LIST));
	}

}
