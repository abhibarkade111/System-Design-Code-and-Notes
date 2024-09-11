package system.design.LLDChainResponsbilityDesignPattern;

public class LogProcessor {
    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String logMessage){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(logLevel,logMessage);
        }
    }
}
