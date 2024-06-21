package system.design.solidprinciples.dependencyInversionPrinciple;

public class DependencyInversionPrinciple {
    public static void main(String[] args) {

    }
}

enum Type{
    wired,bluetooth
}
interface KeyBoard{
}

interface Mouse{

}

class MacBook{
    final KeyBoard keyBoard;
    final Mouse mouse;
    MacBook(KeyBoard keyBoard, Mouse mouse){
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }
}
