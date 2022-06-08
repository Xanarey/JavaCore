package MyPatterns.behavioral.Template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate websiteTemplate = new WelcomePage();
        WebsiteTemplate websiteTemplate1 = new NewsPage();

        websiteTemplate.showPage();

        System.out.println("============================");

        websiteTemplate1.showPage();
    }
}
