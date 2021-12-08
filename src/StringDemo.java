public class StringDemo {
    public static void main(String[] args) {
        String str1 = "First string";
        String str2 = " Second string";
        String str3 = str1;

        System.out.println("Length first string: " + str1.length());
        System.out.println("charAt(3) first string = " + str1.charAt(3));

        if(str1.equals(str2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(str1.equals(str3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
