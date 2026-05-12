public class Main {

    public static void main(String[] args) {

        Vehicle v = new Vehicle("red", 3, 4, 6);
        Moped slowRide = new Moped("black", 1, 4,1);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        Hovercraft hover = new Hovercraft("White", 4, 3 ,2);
        hover.setNumOfPassengers(3);
        System.out.println(slowRide.getFuelCapacity() + " " + hover.getNumOfPassengers());


    }
}