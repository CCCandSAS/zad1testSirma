package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> carsList= new ArrayList();
        carsList.add(new Car("RR","Diamonds", 2023));
        carsList.add(new Car("BMW", "X7", 2017));
        carsList.add(new Car("Toyota", "Hibrit", 2013));
        carsList.add(new Car("Mercedes", "G-class", 2019));
        Collections.sort(carsList);
        for(Car o:carsList){
            System.out.println(o.toString());
        }
    }
}
