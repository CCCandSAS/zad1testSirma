package com.company;

public class Car extends Vehine implements Comparable<Car>{
    private String marka;
    private String model;
    private int yearOfProdiction;

    public Car(){
        this.marka= "";
        this.model="";
        this.yearOfProdiction=0;
    }
    public Car(String marka, String model, int yearOfProdiction){
        this.marka=marka;
        this.model= model;
        this.yearOfProdiction= yearOfProdiction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProdiction=" + yearOfProdiction +
                '}';
    }



    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProdiction() {
        return yearOfProdiction;
    }

    public void setYearOfProdiction(int yearOfProdiction) {
        this.yearOfProdiction = yearOfProdiction;
    }

    @Override
    public void draw(boolean isActive){
        if(isActive==true) System.out.println("The car is active");
        else System.out.println("The car is NOT active");
    }

    @Override
    public int compareTo(Car o){
        if(getYearOfProdiction()==o.getYearOfProdiction())
            return 0;
        else if(getYearOfProdiction()>o.getYearOfProdiction())
            return 1;
        else return -1;
    }

}
