package main;

public class Test {
    public static void main(String[] args) {
        Application pdf = ApplicationFactory.getComputer("pdf","PDF");
        Application texte = ApplicationFactory.getComputer("texte","TEXTE");
        System.out.println("Factory PDF Config::"+pdf);
        System.out.println("Factory TEXTE Config::"+texte);
    }
}
