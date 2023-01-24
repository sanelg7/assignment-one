import house.types.House;
import house.types.Villa;
import house.util.HouseList;

public class Main {
    public static void main(String[] args) {

        HouseList houseList = new HouseList(10);
        House house = new Villa(1143560);
        System.out.println(house);
        System.out.println(houseList.getSummerHouses());


    }

}