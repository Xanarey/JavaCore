package MyPatterns.creational.Singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addInfo("TEST");
        ProgramLogger.getProgramLogger().showLogInfo();

    }
}
