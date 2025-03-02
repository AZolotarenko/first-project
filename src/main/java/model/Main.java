package model;

import model.service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Apple redApple=new Apple(50,10,COLOR_RED);
        Apple greenApple=new Apple(60,8, COLOR_GREEN);
        Meat meat=new Meat(100,5);
        Food [] food ={redApple,greenApple,meat};
        ShoppingCart shop=new ShoppingCart(food);
        System.out.printf("Общая сумму товаров без скидки "+shop.getPriceWithoutDis()+"\n");
        System.out.printf("Общая сумму товаров со скидкой "+shop.getPriceWithdis()+"\n");
        System.out.printf("Сумма всех вегетарианских продуктов без скидки "+shop.getPriceVegWithoutDis()+"\n");

        }


    }






