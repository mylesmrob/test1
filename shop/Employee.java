package shop;

public abstract class Employee extends Customer{
    final double discount = 0;

    public double getDiscount(){
        return 0.0; //Default
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothing);

}
