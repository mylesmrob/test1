package shop;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //3 Clothing objects
        Clothing clothingA = new Clothing("Sweater",50, 'L');
        Clothing clothingB = new Clothing("Jeans" ,30, 'S');
        Clothing clothingC = new Clothing("Khakis",40, 'M');

        Manager manager = new Manager();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();

        Clothing[] managerCart  = {clothingA, clothingB, clothingC};
        Clothing[] employeeCart = {clothingA, clothingB, clothingC};

        System.out.println(ShopApp.calcTotal(managerCart));

        Clothing[] customerCart = {clothingA, clothingB, clothingC};
        System.out.println(ShopApp.isAFit(manager,clothingA));

        hourlyEmployee.printEmpPriceAfterDisc(clothingA);
        hourlyEmployee.printEmpPriceAfterDisc(clothingB);

        manager.printEmpPriceAfterDisc(clothingA);
        manager.printEmpPriceAfterDisc(clothingB);

        ArrayList<Clothing> clothing = new ArrayList<>();
        clothing.add(clothingA); clothing.add(clothingB); clothing.add(clothingC);
        for(Clothing c : clothing){
            System.out.println(c.getDescription());
        }

        ShopApp.printEmployeeName(manager);
        ShopApp.printEmployeeName(hourlyEmployee);

        ShopApp.sortAndPrintClothingByPrice(clothing);
    }
}
