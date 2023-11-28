/*
Nama      : Awalia Mutiara Hikmah
Nim       : 22166001
Prodi     : Sistem Informasi
Semester  : 3
Matkul    : PBO
*/
package pkg22166001.pbo.lat60;

import javax.lang.model.SourceVersion;

public class PBOLat60 {
    
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    
}
    // Class Character sebagai superclass
class Character {
    String name;
    int powerLevel;

    public Character(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
    }

    public void useAbility() {
        System.out.println(name + " uses a special ability.");
    }
}

// Kelas Akatsuki sebagai superclass
class Akatsuki {
    // Implementasi polimorfisme menggunakan method overriding
    public void introduction() {
        System.out.println("We are the members of Akatsuki!");
    }
}

// Kelas-kelas anak yang mewarisi dari Akatsuki
class Pain extends Akatsuki {

    private final String name;
    private final int powerLevel;
    // Implementasi inheritance dari class Character
    public Pain(String name, int powerLevel) {
        super.introduction(); // Memanggil method introduction dari superclass Akatsuki
        System.out.println("This is " + name + " - Leader of Akatsuki");
        this.name = name;
        this.powerLevel = powerLevel;
    }

    // Method overriding untuk menampilkan info karakter
    @Override
    public void introduction() {
        System.out.println("Pain's Real Leader");
    }
}

class Itachi extends Akatsuki {

    private final String name;
    private final int powerLevel;
    public Itachi(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    // Method overriding untuk menampilkan info karakter
    @Override
    public void introduction() {
        System.out.println("This is " + name + " - Mangekyou Sharingan");
    }
}

class Kisame extends Akatsuki {

    private final String name;
    private final int powerLevel;
    public Kisame(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    // Method overriding untuk menampilkan info karakter
    @Override
    public void introduction() {
        System.out.println("This is " + name + " - Samehada");
    }
    public static void main(String[] args) {
        // Penggunaan objek dengan polimorfisme
        Akatsuki[] members = {
                new Pain("Nagato", 100),
                new Itachi("Itachi", 95),
                new Kisame("Kisame", 90)
        };

        // Memanggil method introduction dengan polimorfisme
        for (Akatsuki member : members) {
            member.introduction();
        }
    }
}
