package MyPatterns.creational.AbstractFactory.searchSystem;

import MyPatterns.creational.AbstractFactory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes c++ code . . .");
    }
}
