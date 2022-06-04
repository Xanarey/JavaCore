package MyPatterns.creational.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "logs . . . \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }

        return programLogger;
    }

    private ProgramLogger() {

    }

    public void addInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogInfo() {
        System.out.println(logFile);
    }
}
