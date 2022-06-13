package NewPatterns.behavioral.Template;

import MyPatterns.behavioral.Template.NewsPage;
import MyPatterns.behavioral.Template.WelcomePage;

public class Runner {
    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        NewsPage newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("============================");
        newsPage.showPage();
    }
}
