package system.design.LLDChainResponsbilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String logMessage) {
        if(logLevel==ERROR){
            System.out.println("ERROR: "+logMessage);
        }
        else super.log(logLevel, logMessage);
    }
}
