package NewPatterns.creational.prototype;

public class DeveloperFactory {
    DeveloperInfo developerInfo;

    public DeveloperInfo createCopyDeveloperInfo(DeveloperInfo developer){
        developerInfo = developer.copy();
        return developerInfo;
    }

}
