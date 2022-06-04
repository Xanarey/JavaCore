package MyPatterns.creational.Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new InterpriseWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);


    }
}
