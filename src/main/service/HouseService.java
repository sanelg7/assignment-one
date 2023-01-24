package service;

import house.types.RegularHouse;
import house.types.SummerHouse;
import house.types.Villa;
import house.util.HouseList;

import java.util.List;

public class HouseService {

    private HouseList houseList;

    public HouseService(){}

    public HouseService(HouseList houseList) {
        this.houseList = houseList;
    }

    // Method to calculate total House (all types of houses) prices.
    public int sumHousePrices(){

        int totalPrice = houseList.getHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);
        return totalPrice;
    }

    public int sumRegularHousePrices(List<RegularHouse> regularHouses){

        int totalPrice = houseList.getRegularHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);
        return totalPrice;
    }

    public int sumSummerHousePrices(List<SummerHouse> summerHouses){

        int totalPrice = houseList.getSummerHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);
        return totalPrice;
    }

    public int sumVillaPrices(List<Villa> villas){

        int totalPrice = houseList.getVillas().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);
        return totalPrice;
    }

    // Method to calculate average RegularHouse squareMeters
    public double avgRegularHouseSize(){

        double houseCount = houseList.getRegularHouses().size();

        double averageSize = houseList.getRegularHouses().stream()
                .map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
        averageSize = averageSize / houseCount;
        return averageSize;
    }

    // Method to calculate average SummerHouse squareMeters
    public double avgSummerHouseSize(){

        double houseCount = houseList.getSummerHouses().size();

        double averageSize = houseList.getSummerHouses().stream()
                .map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
        averageSize = averageSize / houseCount;
        return averageSize;
    }

    // Method to calculate average Villa squareMeters
    public double avgVillaSize(){

        double houseCount = houseList.getVillas().size();

        double averageSize = houseList.getVillas().stream()
                .map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
        averageSize = averageSize / houseCount;
        return averageSize;
    }

    // Method to calculate average House (all types of houses) squareMeters
    public double avgHouseSize(){

        double houseCount = houseList.getHouses().size();

        double averageSize = houseList.getHouses().stream()
                .map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
        averageSize = averageSize / houseCount;
        return averageSize;
    }

    // Method to filter all types of houses according to their room and living room count
    // Assumed sort by filter


    public HouseList getHouseList() {
        return houseList;
    }

    public void setHouseList(HouseList houseList) {
        this.houseList = houseList;
    }
}
