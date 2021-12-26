public class MyAbstractClass {

    public MyAbstractClass() {
        System.out.println("Abstr constr");
    }

    // поля и конструкторы
    // абстрактные методы
    // методы с реализацией
}

interface MyInterface {
    // объявление констант
    // методы без реализации
    // статические методы
    // методы по умолчанию (default)
    // приватные методы имеющие реализацию


    // строка не компилируется
    // int value_1;

    int value_2 = 1;
    int a = 5;
    public final int value_3 = 1;
    static int value_4 = 1;
    public final static int value_5 = 1;
    static final int value_6 = 1;
}

interface MyInterface2 {
    // -//-
}

class AIMyClass extends MyAbstractClass implements
        MyInterface, MyInterface2{

    public static void main(String[] args) {
        AIMyClass aiMyClass = new AIMyClass();
    }

    public AIMyClass() {
        System.out.println("AI constr");
    }

    // реализация абстрактных методов
    // иной код

    // реализация методов интерфейса1
    // реализация методов интерфейса2
    // иной код
}
