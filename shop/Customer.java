package shop;

import java.util.Arrays;

public abstract class Customer extends Person{
    private Clothing[] clothingItems;
    private char size;
    Clothing clothing;

    public char getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                ", clothing=" + clothing +
                '}';
    }
}
