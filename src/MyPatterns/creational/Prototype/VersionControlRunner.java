package MyPatterns.creational.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "ProjectMaster", "Source code:" +
                "public class BuildWebsiteRunner {\n" +
                "    public static void main(String[] args) {\n" +
                "        Director director = new Director();\n" +
                "\n" +
                "        director.setBuilder(new InterpriseWebsiteBuilder());\n" +
                "\n" +
                "        Website website = director.buildWebsite();\n" +
                "\n" +
                "        System.out.println(website);\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}");

        ProjectFactory projectFactory = new ProjectFactory(master);

        Project masterCopyProject = projectFactory.cloneProject();

        System.out.println(master);

        System.out.println("\n=================================\n ");

        System.out.println(masterCopyProject);
    }
}
