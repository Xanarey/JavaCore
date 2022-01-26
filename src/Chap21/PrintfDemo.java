package Chap21;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Значения в форматах: ");

        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);
        System.out.printf("Формат чисел с плавающей точкой " +
                            "по умолчанию: %f\n" , 132213.123 );
        System.out.printf("Формат чисел с плавающей точкой " +
                "по умолчанию: %,f\n" , 132213.123 );
        System.out.printf("Формат чисел с плавающей точкой " +
                "по умолчанию: %f\n" , -132213.123 );
        System.out.printf("Формат чисел с плавающей точкой " +
                "по умолчанию: %,(f\n" , 132213.123 );

        System.out.println("Выравнивание положительных и отричательных чисел: \n");

    }
}
