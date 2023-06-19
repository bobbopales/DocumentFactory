package main;

public class Pdf extends Application {
    private String extension;

    public Pdf(String extension){
        this.extension = extension;
    }
    @Override
    public String getDoc(){
        return this.extension;
    }


}
