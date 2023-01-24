package house.types;

import room.LivingRoom;
import room.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class House {
    private int price;
    private int squareMeters;

    private List<Room> rooms;
    public House(int price) {
        this.price = price;
        addRooms();
        // Summing the square meters of rooms from rooms list
        squareMeters = rooms.stream().
                map(x -> x.getSquareMeters()).reduce(0, Integer::sum);
    }

    // Add rooms with random count and size
    private void addRooms() {

        Random random = new Random();
        int roomSize;
        int livingRoomCount = random.nextInt(0,2);
        int otherRoomCount = random.nextInt(1, 5);

        rooms = new ArrayList<>();
        for (int i=0;i<livingRoomCount;i++) {

            // random room size
            roomSize = random.nextInt(30, 100);
            rooms.add(new LivingRoom(roomSize));
        }
        for (int j=0;j<otherRoomCount;j++) {

            // random room size
            roomSize = random.nextInt(10, 80);
            rooms.add(new Room(roomSize));
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

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    // For printing
    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", squareMeters=" + squareMeters +
                '}';
    }
}
