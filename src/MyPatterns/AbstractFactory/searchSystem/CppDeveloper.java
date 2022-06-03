package MyPatterns.AbstractFactory.searchSystem;

import MyPatterns.AbstractFactory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes c++ code . . .");
    }
}
