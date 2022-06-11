package NewPatterns.creational.prototype;

public class DeveloperInfo {
    private String name;
    private int age;
    private String specialty;

    public DeveloperInfo(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public DeveloperInfo copy(){
        return new DeveloperInfo(name, age, specialty);
    }

    @Override
    public String toString() {
        return "DeveloperInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
