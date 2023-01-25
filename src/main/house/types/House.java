package house.types;

import room.LivingRoom;
import room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class House {
    private int price;
    private int squareMeters;

    private List<Room> otherRooms;
    private List<LivingRoom> livingRooms;

    public House() {
    }

    public House(int price) {
        this.price = price;
        addRooms();
        // Summing the square meters of rooms from rooms list
        squareMeters = otherRooms.stream().
                map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
    }

    // Add rooms with random count and size
    private void addRooms() {

        Random random = new Random();
        int roomSize;

        // Not checking if present for optional value as parameters are hard coded.
        int livingRoomCount =
                random.ints(1,4).findFirst().getAsInt();
        int otherRoomCount =
                random.ints(1, 8).findFirst().getAsInt();

        otherRooms = new ArrayList<>();
        livingRooms = new ArrayList<>();
        for (int i=0;i<livingRoomCount;i++) {

            // random room size
            // Not checking if present for optional value as parameters are hard coded.
            roomSize = random.ints(30, 100).findFirst().getAsInt();
            livingRooms.add(new LivingRoom(roomSize));
        }
        for (int j=0;j<otherRoomCount;j++) {

            // random room size
            // Not checking if present for optional value as parameters are hard coded.
            roomSize = random.ints(10, 80).findFirst().getAsInt();
            otherRooms.add(new Room(roomSize));
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public List<Room> getOtherRooms() {
        return otherRooms;
    }

    public void setOtherRooms(List<Room> otherRooms) {
        this.otherRooms = otherRooms;
    }

    public List<LivingRoom> getLivingRooms() {
        return livingRooms;
    }

    public void setLivingRooms(List<LivingRoom> livingRooms) {
        this.livingRooms = livingRooms;
    }



    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", squareMeters = " + squareMeters +
                ", otherRooms = " + otherRooms.size() +
                ", livingRooms = " + livingRooms.size() +
                '}';
    }
}
