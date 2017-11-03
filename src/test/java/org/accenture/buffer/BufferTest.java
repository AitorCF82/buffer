package org.accenture.buffer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import buffer.Buffer;

public class BufferTest {

	private Buffer buffer;
	private final int MAX_ELEM = 10;

	@Before
	public void init() {
		buffer = new Buffer(MAX_ELEM);
	}

	@Test
	public void getNumberOfHoles_Give_Difference_Between_Capacity_And_Elements() {

		long result = buffer.getNumberOfHoles();
		long expectedValue = buffer.getCapacity() - buffer.getNumberOfElements();

		assertEquals(expectedValue, result);
	}

	@Test(expected = BufferException.class)
	public void should_get_Give_And_Exception_When_Buffer_Is_Empty() {

		Object element = null;

		while (buffer.getNumberOfElements() < buffer.getCapacity()) {
			buffer.put(element);
		}

		buffer.put(element);

	}

}
