import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
                
public class myPalette extends JFrame
{    
    public myPalette()
    {
        Color myColor = JColorChooser.showDialog(this, "Choose Color", new Color(0,0,0));
        chosenColor chosenColorWindow = new chosenColor(getHex(myColor)); 
    }
    
    public String getHex(Color c)
    {
        return toHex(c.getRed(), c.getGreen(), c.getBlue());
    }
    
    public static String toHex(int r, int g, int b)
    {
        return "#" + toBrowserHexValue(r) + toBrowserHexValue(g) + toBrowserHexValue(b);
    }
    
    private static String toBrowserHexValue(int number)
    {
        StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
        while (builder.length() < 2)
        {
            builder.append("0");
        }
        return builder.toString().toUpperCase();
    }
}
