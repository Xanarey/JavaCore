package Chap20;

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("Не подлежит выводу");
        else System.out.println("Объект noVal не содержит значения");

        if(hasVal.isPresent()) System.out.println("Объект has содержит"
                + " следующую строку: " + hasVal.get());

        String defStr = noVal.orElse("Строка по умолчанию");
        System.out.println(defStr);
    }
}
