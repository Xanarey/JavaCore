package NewPatterns.structural.Composite;

public class Runner {
    public static void main(String[] args) {
        ConstructionTeam constructionTeam = new ConstructionTeam();

        Foreman foreman = new Foreman();
        Roofer roofer = new Roofer();

        constructionTeam.addWorker(foreman);
        constructionTeam.addWorker(roofer);
        constructionTeam.send_a_team_to_work();


    }
}
