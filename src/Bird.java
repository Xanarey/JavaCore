interface Flyable {
    String species = "";
    int age = 10;

    void fly();
}

public abstract class Bird {
    private String species;
    private int age;

    public abstract void fly();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Mockingjat extends Bird {

    @java.lang.Override
    public void fly() {
        System.out.println("Fly bird!");
    }

    public static void main(String[] args) {
        Mockingjat someBird = new Mockingjat();
        someBird.setAge(10);
        System.out.println(someBird.getAge());
    }
}