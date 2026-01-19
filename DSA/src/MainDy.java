public class MainDy {
    public static void main(String[] args) {
        DynamicArray1 dynamicArray = new DynamicArray1();
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0,"x");

        System.out.println(dynamicArray);
        System.out.println("Size : "+ dynamicArray.size);
        System.out.println("Capacity : "+ dynamicArray.capacity);
        System.out.println("Empty :" + dynamicArray.isEmpty());
    }
}

