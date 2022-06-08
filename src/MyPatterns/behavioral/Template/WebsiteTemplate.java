package MyPatterns.behavioral.Template;

public abstract class WebsiteTemplate {
    public final void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
