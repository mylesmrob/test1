package shop;

public abstract class Customer extends Person{
    private Clothing[] clothingItems;
    private char size;
    Clothing clothing;

    public char getSize(){
        return size;
    }

    //MAKE toString();
}
