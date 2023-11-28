/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166001.pb0.lat53;

public class PBOLat53 {
    
}
class Animal {
    private final boolean vegetarian;
    private final String eats;
    private final int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}

class Rabbit extends Animal {
    private final String color;
    private final String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Rabbit peter = new Rabbit("Peter", false, "grass", 4, "grey");

        System.out.println("Hello, His name is " + peter.getName());
        System.out.println(peter.getName() + " is Vegetarian? " + peter.isVegetarian());
        System.out.println(peter.getName() + " eats " + peter.getEats());
        System.out.println(peter.getName() + " has " + peter.getNoOfLegs() + " legs. " + peter.getName() + " color is " + peter.getColor());
    }
}