package MyPatterns.behavioral.Observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer subscriber_1 = new Subscriber("Tomas");
        Observer subscriber_2 = new Subscriber("Tim");
        Observer subscriber_3 = new Subscriber("Ann");

        jobSite.addObserver(subscriber_1);
        jobSite.addObserver(subscriber_2);
        jobSite.addObserver(subscriber_3);

        jobSite.addVacancy("Third Java Position");

        jobSite.removeVacancy("First Java Position");
    }
}
