package MyPatterns.structural.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://timurkenson.com");

        project.run();
    }
}
