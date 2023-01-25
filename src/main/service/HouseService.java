package service;

import house.types.House;
import house.util.HouseList;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    private HouseList houseList;

    public HouseService(){}

    public HouseService(HouseList houseList) {
        this.houseList = houseList;
    }

    // Method to calculate total House (all types of houses) prices.
    public int sumHousePrices(){

        return houseList.getHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);

    }

    public int sumRegularHousePrices(){

        return  houseList.getRegularHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);

    }

    public int sumSummerHousePrices(){

        return houseList.getSummerHouses().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);

    }

    public int sumVillaPrices(){

        return houseList.getVillas().stream()
                .map(x -> x.getPrice()).reduce(0, Integer::sum);

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
    public List<House> filterHouses(int livingRooms, int otherRooms){
        return houseList.getHouses()
                .stream()
                .filter(x -> x.getOtherRooms().size() == otherRooms
                        && x.getLivingRooms().size() == livingRooms)
                .collect(Collectors.toList());
    }


    public HouseList getHouseList() {
        return houseList;
    }

    public void setHouseList(HouseList houseList) {
        this.houseList = houseList;
    }
}
