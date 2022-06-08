package MyPatterns.behavioral.Memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("\nCreating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");


        System.out.println(project);

        System.out.println("Saving current version to github...\n\n\n");
        timeSleep(5);
        githubRepo.setSave(project.save());

        timeSleep(5);

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing poor code...");

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        timeSleep(5);

        System.out.println("\n\n\nSomething went wrong...");

        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }

    public static void timeSleep(int sleep) {
        System.out.println("\bSleep time:");
        for (int i = sleep;  i > 0; i--){
            System.out.println("Time left: " + i + " second");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
