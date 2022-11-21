public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Timer timer = new Timer();
        Toto toto = new Toto("Observateur1");
      System.out.println("la valeur initiale de x est : " + timer.getX());
        timer.addObserver(toto);
        
        timer.setX(13);
        
    }
}
