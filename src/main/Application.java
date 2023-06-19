package main;

public abstract class Application {
    public abstract String getDoc();
    @Override
    public String toString(){

        return "Doc= "+this.getDoc();
    }
}
