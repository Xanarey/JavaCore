package NewPatterns.behavioral.Memento;

public class Runner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHub gitHub = new GitHub();

        project.setVersionAndDate("1.0");

        System.out.println(project);

        System.out.println("Saving...");

        timeSleep(3);

        gitHub.setSave(project.save());

        timeSleep(3);

        System.out.println("Updating project to version 1.1");

        project.setVersionAndDate("1.1");

        timeSleep(3);

        System.out.println(project);

        System.out.println("Rolling back to Version 1.0");

        project.load(gitHub.getSave());

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
