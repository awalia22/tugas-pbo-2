/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166001.pbo.lat57;


public class PBOLat57 {
}
        // Kelas Vehicle sebagai superclass
class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
        this.myBrand = "";
        this.myModel = "";
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        this.myModel = model;
    }
}

// Kelas Bicycle sebagai subclass dari Vehicle
class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        super();
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}

// Kelas Skateboard sebagai subclass dari Vehicle
class Skateboard extends Vehicle {
    private double myBoardLength;

    public Skateboard() {
        super();
        System.out.println("Skateboard");
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
    // Kelas Main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Bicycle
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);

        // Menampilkan informasi Bicycle
        System.out.println("Brand " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());

        // Membuat objek Skateboard
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);

        // Menampilkan informasi Skateboard
        System.out.println("Brand " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength());
    }
}
    