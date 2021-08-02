package com.zzz.designPatterns.decorate;

/**
 * @author ZhaoZezhong
 * date 2021/7/29 14:09
 */
public class Main {
    public static void main(String[] args) {
        Decorate milkyTea = new MilkyTea();
        Sugar sugar = new Sugar();
        Fruit fruit = new Fruit();

        fruit.setDrink(new Milk());
        sugar.setDrink(fruit);
        milkyTea.setDrink(sugar);

        int cost = 0;

        while(milkyTea != null){
            cost += milkyTea.cost();
            System.out.println(milkyTea.name() + " " + milkyTea.cost() + "元");
            milkyTea = milkyTea.getDrink();
        }

        System.out.println("共花费" + cost + "元");
    }
}
