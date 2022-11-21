import java.util.Observable;

public class Timer extends Observable
 {
    private int x=0;

    public Timer(int x) {
        this.x = x;
    }
    //constructeur vide
    public Timer() {
    }
    //set x
    public void setX(int x) {
        this.x = x;
        setChanged();
        notifyObservers();
        
    }
    //get x
    public int getX() {
        return x;
    }
    
    
}
