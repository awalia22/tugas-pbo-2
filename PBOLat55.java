/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166001.pbo.lat55;


public class PBOLat55 {

    private final String manufaktur = "Samsung";
    private final String os = "Android";
    private final String model = "Grand";
    private final int harga = 3000000;
    private final String androidKeyStore = "234ibfd3840fo";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Android Key Store: " + androidKeyStore);
    }

    public static void main(String[] args) {
        PBOLat55 hp = new PBOLat55();
        hp.displayProduct();
    }
}
    