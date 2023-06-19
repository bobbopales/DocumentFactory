package main;

public class ApplicationFactory {
    public static Application getComputer(String type, String extension) {
        if ("Pdf".equalsIgnoreCase(type)) return new Pdf(extension);
        else if ("Texte".equalsIgnoreCase(type)) return new Texte(extension);

        return null;
    }
}
