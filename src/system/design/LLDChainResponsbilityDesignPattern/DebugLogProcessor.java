package system.design.LLDChainResponsbilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String logMessage) {
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+logMessage);
        }
        else super.log(logLevel, logMessage);
    }
}
