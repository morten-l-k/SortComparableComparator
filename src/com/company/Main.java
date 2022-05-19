package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //comparatorer kan sættes op til at sammenligne på flere forskellige måder alt efter hvilke attributter nogle objekter har
        //comparabale giver en natural order hvor man kun kan sammenligne på én måde - dvs. på baggrund af én attribut
        new Main().run();

    }

    public void run(){
        Car car1 = new Car("Testla","brand",FuelType.GASOLINE,2);
        Car car2 = new Car("FORD","Mondeo",FuelType.DIESEL,3);

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);

        System.out.println(cars);

        Collections.sort(cars); //Vi bruger metoden compareTo fra Car klassen til at sortere på model-attributten.
        // Hvis vi i Car klassen ændrede ....

        Collections.sort(cars, new BrandSortComperator());//Her benytter vi så brand-comparatoren
        System.out.println(cars);
        Collections.sort(cars, new AgeSortComparator());//Her benytter vi så age-comparatoren. Som nævnt, så kan comparatorer bruges på flere forskellige attributter.
        System.out.println(cars);

        //HERUNDER LAVER VI EN FOR EACH LOOP (KALDES OGSÅ ENHANCED FOR LOOP - "KÆRT BARN HAR MANGE NAVNE") FOR AT PRINTE HVER INDEXPOSITION I CARS-LISTEN
        for (Car car : cars){
            System.out.println(car);
        }
    }
}
