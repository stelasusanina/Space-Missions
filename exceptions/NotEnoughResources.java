package exceptions;

public class NotEnoughResources extends Exception{
    public NotEnoughResources(){
        super("Not enough resources to build");
    }
}
