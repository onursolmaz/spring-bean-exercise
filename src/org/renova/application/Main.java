package org.renova.application;

import org.renova.domain.ClothesStore;
import org.renova.domain.FoodStore;
import org.renova.domain.IndividualCustomer;
import org.renova.domain.TechnologyStore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Scanner;

/*
- Sistemde 3 tana farklı mağaza çeşidi bean olarak tanımlanmıştır ve bean property ile default değerleri verilmiştir.
- Bean tanımlarken default map değerleri verildi. init-destroy, destroy-method' ları kullanıldı.
- Customer bean'leri tanımlanırken parent, constructor-arg, property özellikleri kullanıldı.
 */

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // get spring context
        ApplicationContext context=new ClassPathXmlApplicationContext("resources/Context.xml");

        System.out.println("Welcome shopping center\n *******************");

        printInfo();
        int choise=input.nextInt();

        switch (choise){
            case 1:
                Map<String, Double> clothesList = context.getBean("clothesStore", ClothesStore.class).getClothesList();
                printStock(clothesList);
                break;
            case 2:
                Map<String, Double> foodList = context.getBean("foodStore", FoodStore.class).getFoodList();
                printStock(foodList);
                break;
            case 3:
                Map<String, Double> productList = context.getBean("technologyStore", TechnologyStore.class).getProductList();
                printStock(productList);
                break;
            default:
                System.out.println("Please enter valid value");
        }

        // get individual customer as a bean
        IndividualCustomer individualCustomer = context.getBean("individualCustomer", IndividualCustomer.class);
        System.out.println(individualCustomer);


        // close context
        ((AbstractApplicationContext)context).registerShutdownHook();

    }

    private static void printInfo() {
        System.out.println("1- Clothes Store\n2- Food Store \n3- Technology Store");
        System.out.print("\nPlease chose one:");
    }

    private static void printStock(Map map) {
        System.out.println("-----Product List-----");
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
