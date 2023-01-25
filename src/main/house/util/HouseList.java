package house.util;

import house.types.House;
import house.types.RegularHouse;
import house.types.SummerHouse;
import house.types.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HouseList {

    // Creating a list of Houses
    List<House> houses = new ArrayList<>();

    public HouseList (int houseOfEachType) {
        addHouses(houseOfEachType);
    }


    // Helper method to populate HouseList
    public void addHouses (int houseOfEachType) {
        // Random variable for price, square meters and multiplier for different types of Houses
        Random random = new Random();
        int price, regularHouseMul, summerHouseMul, villaMul;

        // Creating Houses with random price and square meters.
        // and populating the House list.
        for (int i=0;i<houseOfEachType;i++) {

            // Random value for price
            price = random.ints(200000,400000).findFirst().getAsInt();

            // RegularHouse multiplier, and creating RegularHouse object
            regularHouseMul = random.ints(4,8).findFirst().getAsInt();
            House regularHouse =
                    new RegularHouse(regularHouseMul*price);

            // SummerHouse multiplier, and creating SummerHouse object
            summerHouseMul = random.ints(5,10).findFirst().getAsInt();
            House summerHouse =
                    new SummerHouse(summerHouseMul*price);

            // Villa multiplier, and creating Villa object
            villaMul = random.ints(8,16).findFirst().getAsInt();
            House villa =
                    new Villa(villaMul*price);

            // Adding them to the list
            houses.add(regularHouse);
            houses.add(summerHouse);
            houses.add(villa);
        }
    }

    // Get RegularHouse objects from the list
    public List<RegularHouse> getRegularHouses() {
        List<RegularHouse> regularHouses = new ArrayList<>();

        // Check type of house object
        for (House h : houses) {
            if (h.getClass() == RegularHouse.class) {

                // Cash House to RegularHouse object and add to the RegularHouse list
                regularHouses.add((RegularHouse) h);
            }
        }
        return regularHouses;
    }

    // Get SummerHouse objects from the list
    public List<SummerHouse> getSummerHouses() {
        List<SummerHouse> summerHouses = new ArrayList<>();

        // Check type of house object
        for (House h : houses) {
            if (h.getClass() == SummerHouse.class) {

                // Cash House to SummerHouse object and add to the SummerHouse list
                summerHouses.add((SummerHouse) h);
            }
        }
        return summerHouses;
    }
    // Get Villa objects from the list
    public List<Villa> getVillas() {
        List<Villa> villas = new ArrayList<>();

        // Check type of house object
        for (House h : houses) {
            if (h.getClass() == Villa.class) {

                // Cash House to Villa object and add to the Villa list
                villas.add((Villa) h);
            }
        }
        return villas;
    }

    // Getters and Setters
    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String s;
        for (House h: houses) {
            s = h.toString() + "\n";
            builder.append(s);
        }
        return builder.toString();
    }
}
