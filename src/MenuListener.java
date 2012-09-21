import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class MenuListener extends Observable implements ActionListener
{
    private static MenuListener myMenuListener = new MenuListener();
    
    public MenuListener()
    {
        // mi da nullPointerException qui
        this.addObserver(myFrame.getFrame());
    }

    public static MenuListener getMenuListener()
    {
        return myMenuListener;
    }

    public void actionPerformed(ActionEvent e)
    {
        setChanged();
        notifyObservers(e);
    }
}