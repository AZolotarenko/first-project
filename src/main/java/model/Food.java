package model;

public abstract class Food implements Discountable{
    int amount;
    double price;
    boolean isVegetarian;
    public Food (double price,int amount,boolean isVegetarian){
        this.price=price;
        this.amount=amount;
        this.isVegetarian=isVegetarian;
    }
    @Override
    public double getDiscount(){
        return 0;
    }
    public double getPrice(){return price;}
    public int getAmount(){return amount;}
    public boolean isVegetarian(){return isVegetarian;}
}

