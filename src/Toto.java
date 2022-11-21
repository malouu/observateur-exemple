import java.util.Observer;
import java.util.Observable;

public class Toto implements Observer
{   public String name;
    public Toto(String name) {
        this.name = name;
    }
    public void update(Observable o, Object arg) {
        System.out.println(this.name + " says: " + ((Timer)o).getX());
    }
}
    

