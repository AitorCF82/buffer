package buffer;

import java.util.LinkedList;
import java.util.Queue;

import org.accenture.buffer.BufferException;



public class Buffer {
	private Queue buffer;
	private int capacityOfBuffer;
	int numberOfPuts = 0;
	int numberOfGets = 0;

	/**
	 * Constructor
	 * 
	 * @param bufferSize
	 */
	public Buffer(int bsize) {
		capacityOfBuffer = bsize;
		buffer = new LinkedList();
	}

	public void put(Object element) {
		if (buffer.size() == capacityOfBuffer)
			System.exit(-1);
		;

		System.out.println("Element inserted");

		buffer.add(element);
		numberOfPuts++;
	}

	public Object get() throws Exception {
		if (buffer.isEmpty())
			throw new BufferException();

		Object value = buffer.remove();
		System.out.println("Element extracted");

		numberOfGets++;
		return value;
	}

	public int getNumberOfElements() {
		return buffer.size();
	}

	public int getNumberOfHoles() {
		return capacityOfBuffer - buffer.size();
	}

	public int getCapacity() {
		return capacityOfBuffer;
	}

	public double GetNumberOfOperations() {
		return numberOfPuts + numberOfGets;
	}
}