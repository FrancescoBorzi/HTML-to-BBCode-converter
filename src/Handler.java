import java.util.*;

public interface Handler
{
    public String convert(String input);
    public void check(String input);
}

class HTML implements Handler
{
    private static HTML myHandler = new HTML();
    
    public static HTML getHandler()
    {
        return myHandler;
    }
    
    public String convert(String input)
    {
        String bbcode = input;

        for (Map.Entry entry: myMaps.getHTMLMap().entrySet())
        {
            bbcode = bbcode.replaceAll(entry.getKey().toString(), entry.getValue().toString());
        }

        return bbcode;
    }
    
    public void check(String input)
    {
        int check = 0;
        
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == '<')
                check++;
            else if (input.charAt(i) == '>')
                check--;
        }
        
        if (check != 0)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "There are some errors in your code, please check it!", "HTML: Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "Everything's ok!", "HTML: OK", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}

class BBCode implements Handler
{
    private static BBCode myHandler = new BBCode();
    
    public static BBCode getHandler()
    {
        return myHandler;
    }
    
    public String convert(String input)
    {
        String html = input;

        for (Map.Entry entry: myMaps.getBBcodeMap().entrySet())
        {
            html = html.replaceAll(entry.getKey().toString(), entry.getValue().toString());
        }

        return html;

    }
    
    public void check(String input)
    {
        int check = 0;
        
        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == '[')
                check++;
            else if (input.charAt(i) == ']')
                check--;
        }
        
        if (check != 0)
        {
            javax.swing.JOptionPane.showMessageDialog(null, "There are some errors in your code, please check it!", "BBCode: Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        javax.swing.JOptionPane.showMessageDialog(null, "Everything's ok!", "BBCode: OK", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
}

class Context
{
    private static HTML handlerOfHTML = HTML.getHandler();
    private static BBCode handlerOfBBcode = BBCode.getHandler();
    private static Context myContext = new Context();
    
    public static Context getContextHandler()
    {
        return myContext;
    }
    
    public static HTML getHTML()
    {
        return handlerOfHTML;
    }
    
    public static BBCode getBBCode()
    {
        return handlerOfBBcode;
    }
    
}