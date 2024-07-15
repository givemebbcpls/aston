package homeworks.lesson4;

public class ArrayList<E extends Comparable<E>> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public ArrayList(ArrayList<E> list) {
        elements = new Object[list.size()];
        size = 0;
        addAll(list);
    }

    public void add(E e) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = e;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elements.length) {
            resize();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public void addAll(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    public int size() {
        return size;
    }

    public void bubbleSort() {
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                E element1 = (E) elements[j];
                E element2 = (E) elements[j + 1];
                if (element1.compareTo(element2) > 0) {
                    elements[j] = element2;
                    elements[j + 1] = element1;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private void resize() {
        int newSize = elements.length * 2;
        Object[] newElements = new Object[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}
