package shop;

public class Manager extends Employee implements IDiscountable{

    public double getDiscount(){
        return 0.25;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(calcDiscount(clothing));
    }

    @Override
    public double calcDiscount(Clothing clothing) {
        return (getDiscount() * clothing.getPrice()) + clothing.getPrice();
    }

    //MAKE toString
}
