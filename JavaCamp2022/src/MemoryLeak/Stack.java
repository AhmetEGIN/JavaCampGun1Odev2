package MemoryLeak;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
	private Object[] elements;
    private int size = 0;
    private final int DEFAULT_INITIAL_CAPACITY = 16;
 
    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
 
    public void push(Object e) {
        ensureCapacity();
        System.out.println(size);
        elements[size++] = e;
    }
 
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        System.out.println(size);
        System.out.println(elements[size]);
        return elements[--size];
    }
    public Object zero() {
    	return elements[0];
    }
 
    /**
    * Dizide bo�luk kalmam��sa, bir sonraki eleman�n eklenebilmesini
    * sa�lamak i�in diziyi geni�letiyoruz
    */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
