package NewPatterns.behavioral.Template;

public abstract class PageTemplate {
    public void showPage(){
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    public abstract void showContent();
}
