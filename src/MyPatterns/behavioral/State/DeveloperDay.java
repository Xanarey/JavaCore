package MyPatterns.behavioral.State;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++){
            System.out.println("STATE OBJECT: " + developer.getState().toString());
            developer.justDoIt();
            developer.changeActivity();

        }
    }
}
