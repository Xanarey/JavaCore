package NewPatterns.creational.builder;

public class Developer {
    private String name;
    private int age;
    private Enum<Specialty> specialty;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(Enum<Specialty> specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialty=" + specialty +
                '}';
    }
}
