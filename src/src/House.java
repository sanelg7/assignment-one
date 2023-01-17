public abstract class House {
    private int price;
    private int squareMeters;

    public House(int price, int squareMeters) {
        this.price = price;
        this.squareMeters = squareMeters;
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


}
