// Add a constructor

class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // This is a constructor for a Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
     int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
         return (double) miles/mpg;
    }
}

// With added range() to Vehicle class.
class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle(7, 16, 21);
        var sportscar = new Vehicle(2, 14, 12);

//        int range1, range2;
        double gallons;
        int dist = 252;


        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, MiniVan needs " + gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, SportsCar needs " + gallons + " gallons of fuel.");

        System.out.println();
    }
}




















/*

// Program that uses the Vehicle class.

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon



    // Return the range.
     int range() {
        return fuelcap * mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
         return (double) miles/mpg;
    }
}

// With added range() to Vehicle class.
class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
//        int range1, range2;
        double gallons;
        int dist = 252;

        // Assign values to fields in minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        gallons = minivan.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, MiniVan needs " + gallons + " gallons of fuel.");
//        System.out.println("With a full tank, Minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " miles.");

        gallons = sportscar.fuelNeeded(dist);
        System.out.println("To go " + dist + " miles, SportsCar needs " + gallons + " gallons of fuel.");
//        System.out.println("With a full tank, Sportscar can carry " + sportscar.passengers + " with range of " + sportscar.range() + " miles.");


    }
}








// Program that uses the Vehicle class.

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    // Display the range.
     void range() {
        System.out.println("Range is " + fuelcap * mpg + ".");
    }

}

// With added range() to Vehicle class.
class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
//        int range1, range2;

        // Assign values to fields in minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.print("With a full tank, Minivan can carry " + minivan.passengers + ". ");
        minivan.range(); // display range of minivan.

        System.out.print("With a full tank, Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range(); // display range of sportscar.


    }
}


// This class declares two objects of type Vehicle.
class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        Vehicle car3 = new Vehicle();
        int range1, range2;

        // Assign values to fields in minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Compute range assuming a full tank of capacity.
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("With a full tank, Minivan can carry " + minivan.passengers + " passengers with a range of " + range1 + ".");
        System.out.println("With a full tank, Sportscar can carry " + sportscar.passengers + " passengers with a range of " + range2 + ".");

        System.out.println();

        car3 = sportscar;

        System.out.println(car3.fuelcap);

    }
}


// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        int range;

        // Assign values to fields in minivan.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Compute range assuming a full tank of capacity.
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("With a full tank, minivan can carry " + minivan.passengers + " passengers with a range of " + range + ".");
    }
}
 */