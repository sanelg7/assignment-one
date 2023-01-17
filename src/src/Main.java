public class Main {
    public static void main(String[] args) {


        House test = new RegularHouse(100000, 200);
        House villaTest = new Villa(450000, 345);
        House summerHouseTest = new SummerHouse(350000, 115);

        System.out.println(summerHouseTest.getPrice());
        System.out.println(test.getPrice());
        System.out.println(villaTest.getPrice());

        // TO-DO: Create at least three objects from each type of house.
        // Write the methods that returns these

        }
}