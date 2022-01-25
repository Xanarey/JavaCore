package ChapsStart;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution2 {
    public static ArrayList<String> planets = new ArrayList<>();
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "Java", "Pascal", "JavaScript", "Ruby"));

    public static void main(String[] args) {
        //addPlanets();
        //print();
        //createNewPlanet("Звезда Смерти");
        //print();

        System.out.println(programmingLanguages);
        programmingLanguages.remove("Pascal");
        System.out.println(programmingLanguages);
    }

    public static void createNewPlanet(String planetName) {
        for(int i = 0; i < planets.size(); i++)
            if(planets.get(i) == "Земля")
                planets.add(i + 1, planetName);
    }

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%s — %d-я планета от Солнца%n", planets.get(i), (i + 1));
        }
        System.out.println();
    }
}
