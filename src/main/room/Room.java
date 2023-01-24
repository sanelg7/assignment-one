package room;

public class Room {

    private int squareMeters;

    public Room(){}

    public Room(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public String toString() {
        return "room.Room{" +
                "squareMeters=" + squareMeters +
                '}';
    }
}
