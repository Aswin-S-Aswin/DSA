public class DynamicArray1 {

    int size = 0;
    int capacity = 10;
    Object[] array;

    public DynamicArray1() {
        array = new Object[capacity];
    }

    // ADD
    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size++] = data;
    }

    // INSERT
    public void insert(int index, Object data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size >= capacity) {
            grow();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        size++;
    }

    // DELETE
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;

                if (size <= capacity / 3) {
                    shrink();
                }
                return;
            }
        }
    }

    // SEARCH
    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // GROW
    private void grow() {
        capacity *= 2;
        Object[] newArray = new Object[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // SHRINK
    private void shrink() {
        capacity /= 2;
        Object[] newArray = new Object[capacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // toString
    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
