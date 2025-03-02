package model.service;

import model.Food;

public class ShoppingCart {
    Food[] foodAll;
    public ShoppingCart (Food[] foodAllIn){
        this.foodAll =foodAllIn;

}
    public double getPriceWithoutDis(){                  //общую сумму товаров без скидки
        double sum=0;
        for (int i = 0; i< foodAll.length; i++){
        sum =sum+ foodAll[i].getPrice()* foodAll[i].getAmount();
        }
        return sum;
    }
    public double getPriceWithdis(){                     //общую сумму товаров со скидкой
        double sum=0;
        for (int i = 0; i< foodAll.length; i++){
            sum=sum+(foodAll[i].getPrice()- foodAll[i].getPrice()* foodAll[i].getDiscount())* foodAll[i].getAmount();
        }
        return sum;
    }
    public double getPriceVegWithoutDis(){              //получить общую сумму всех вегетарианских продуктов в корзине без скидки
        double sum=0;
        for (int i = 0; i< foodAll.length; i++){
         if (foodAll[i].isVegetarian()){
             sum =sum+ foodAll[i].getPrice()* foodAll[i].getAmount();}
        }
        return sum;
    }


}

