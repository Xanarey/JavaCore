

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println((
                            "Предшествует оператору BREAK. Код пишу сам)))"
                            ));
                    if(t) break second;
                    System.out.println("" +
                            "Этот оператор выполняться не будет");
                }
                System.out.println(
                        "Этот оператор выполняться не будет"
                );

            }
            System.out.println(
                    "Оператор следующий за блоком second"
            );
        }
    }
}
