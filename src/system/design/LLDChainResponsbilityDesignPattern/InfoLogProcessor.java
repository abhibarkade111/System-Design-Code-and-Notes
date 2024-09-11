package system.design.LLDChainResponsbilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String logMessage) {
        if(logLevel==INFO){
            System.out.println("INFO: "+logMessage);
        }
        else super.log(logLevel, logMessage);
    }
}
