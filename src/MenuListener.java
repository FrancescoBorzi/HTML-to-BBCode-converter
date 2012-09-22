import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MenuListener extends Observable implements ActionListener
{
    
    public MenuListener(Observer o)
    {
        addObserver(o);
    }

    public void actionPerformed(ActionEvent e)
    {
        setChanged();
        notifyObservers(e);
    }
}