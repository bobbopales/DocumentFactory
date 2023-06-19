package main;

public class Texte extends Application{
    private String extension;

    public Texte(String extension){
        this.extension = extension;
    }
    @Override
    public String getDoc() {
        return this.extension;
    }
}
