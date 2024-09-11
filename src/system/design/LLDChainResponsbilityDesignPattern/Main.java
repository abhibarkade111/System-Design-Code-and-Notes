package system.design.LLDChainResponsbilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Here we are going to implement logger functionality using chain of responsibility design pattern
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(logProcessor.ERROR,"Error 404");
        logProcessor.log(logProcessor.DEBUG,"Debugging the code");
        logProcessor.log(logProcessor.INFO,"Data saved to database informed");
    }
}
