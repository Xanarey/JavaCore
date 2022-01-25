package ChapsStart;

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public final void add(String element) {
        if(size == capacity)
            grow();
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        elements = Arrays.copyOf(elements, capacity);
    }

}
