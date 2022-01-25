package ChapsStart;

import java.lang.reflect.Field;

class B11 {
    public static void main(String[] args) throws Exception {
        String value = "Old value";
        System.out.println(value);

        Field field = value.getClass().getDeclaredField("value");

        field.setAccessible(true);

        field.set(value,"TEST".toCharArray());

        System.out.println(value);
    }
}


// TODO не дает изменять (