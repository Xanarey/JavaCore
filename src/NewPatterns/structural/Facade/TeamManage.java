package NewPatterns.structural.Facade;

public class TeamManage {
    Developer developer = new Developer();
    HR hr = new HR();
    QATester qaTester = new QATester();

    public void startTeamWork(){
        developer.writeCode();
        hr.hrWork();
        qaTester.test();
    }
}
