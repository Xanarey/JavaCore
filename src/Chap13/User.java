package Chap13;

import java.io.*;
import java.time.LocalDate;

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private String login;


    public volatile long x = 2222222222222222222L;


    private transient String password;
    private transient int randomNumber;
    private transient InputStream is;    //java.io.NotSerializableException
    private transient BufferedReader br; //java.io.NotSerializableException
    private transient final String role = "simple_user"; // Сериализация константы помеченной как transient !

    public User() {}

    public User(String firstName, String lastName, String email, LocalDate birthDate, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    static void serialize(User user, String path) throws IOException {

        try (FileOutputStream outputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(user);
        }

    }

    static User deserialize(String path) throws IOException, ClassNotFoundException {

        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            //загружаем объект из файла
            return (User) objectInputStream.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final String path = "C:\\Users\\Пользователь\\Desktop\\123.txt";

        User user = new User();
        user.setFirstName("Tim");
        user.setLastName("Bro");
        user.setEmail("XXXXXXXXX@gmail.com");
        user.setBirthDate(LocalDate.of(1995, 8, 25));
        user.setLogin("Xanarey");
        user.setPassword("79832qy7uiHD)(@#EWSA___ASD+");

        System.out.println("Initial user: " + user + "\r\n");

        serialize(user, path);

        User loadedUser = deserialize(path);
        System.out.println("Loaded user from file: " + loadedUser + "\r\n");
    }
}
