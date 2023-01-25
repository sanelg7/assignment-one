import house.types.House;
import house.util.HouseList;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Creating an instance of HouseService to run its methods
        HouseService houseService = new HouseService();
        /*
        Creating an instance of HouseList. It takes an integer parameter in
        its constructor which tells how many of each type of house to create automatically.
        In this example, created 30 of each type.
        */
        int houseCount = 30;
        System.out.println("Creating " + houseCount + " of Houses with randomized" +
                " sizes, prices and room counts.\n");
        HouseList houseList = new HouseList(houseCount);

        System.out.println("Passing house list to the house service...\n");
        houseService.setHouseList(houseList);

        // Demonstration for getting houses.
        // Only ran for all types of houses, and selected the first 3 to print for readability.
        List<House> houses = houseList.getHouses();

        System.out.println("Printing 3 houses for demonstrating getHouses()");
        for (int i = 0; i < 3; i++) {

            System.out.println("House : " + houses.get(i));
        }


        // Demonstration for methods that sum prices for different types of houses
        System.out.println("\nSum of all regular house prices: "
                + houseService.sumRegularHousePrices());

        System.out.println("Sum of all summer house prices: "
                + houseService.sumSummerHousePrices());

        System.out.println("Sum of all villa prices: "
                + houseService.sumVillaPrices());

        System.out.println("Sum of all types of house prices: "
                + houseService.sumHousePrices() + "\n");

        // Demonstration for methods that average square meters for different types of houses
        System.out.println("Average of all regular house sizes in square meters: "
                + houseService.avgRegularHouseSize());

        System.out.println("Average of all summer house sizes in square meters: "
                + houseService.avgSummerHouseSize());

        System.out.println("Average of all villa sizes in square meters: "
                + houseService.avgVillaSize());

        System.out.println("Average of all types of house sizes in square meters: "
                + houseService.avgHouseSize() + "\n");

        // Demonstration for filtering houses by regular room and living room counts
        int roomCount = 4;
        int livingRoomCount = 2;
        System.out.println("Filtering houses that have "
                + livingRoomCount + " living rooms"
                + " and " + roomCount + " other rooms.");

        List<House> filteredHouses = houseService.filterHouses(livingRoomCount, roomCount);
        System.out.println("Found " + filteredHouses.size() + " such house(s). Details below: ");
        // Printing filtered houses
        for (House h : filteredHouses) {
            System.out.println(h);
        }


    }

}