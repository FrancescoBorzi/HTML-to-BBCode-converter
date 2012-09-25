import java.util.*;
import java.net.HttpURLConnection;
import java.net.URL;

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
        
        String links[] = URLchecks.findHTMLlinks(input);
        
        for (int i = 0; i < links.length; i++)
        {
            if (!URLchecks.exists(links[i]))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "One or more links may be invalid.", "HTML URL check", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
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
        
        String links[] = URLchecks.findBBCodelinks(input);
        
        for (int i = 0; i < links.length; i++)
        {
            if (!URLchecks.exists(links[i]))
            {
                javax.swing.JOptionPane.showMessageDialog(null, "One or more links may be invalid.", "BBCode URL check", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
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

class URLchecks
{
    public static boolean exists(String URLName)
    {
        try 
        {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
            con.setRequestMethod("HEAD");
            return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
        }
        catch (Exception e)
        {
            return false;
        }
    }
    
    public static String[] findHTMLlinks(String input)
    {
        String[] links;
        
        int count = 0;
        
        for (int i = 0; i < input.length()-5; i++)
        {
            if (
                    input.substring(i, i+5).compareTo("src='") == 0 ||
                    input.substring(i, i+5).compareTo("src=\"") == 0 ||
                    input.substring(i, i+5).compareTo("ref='") == 0 ||
                    input.substring(i, i+5).compareTo("ref=\"") == 0 ||
                    input.substring(i, i+5).compareTo("SRC='") == 0 ||
                    input.substring(i, i+5).compareTo("SRC=\"") == 0 ||
                    input.substring(i, i+5).compareTo("REF='") == 0 ||
                    input.substring(i, i+5).compareTo("REF=\"") == 0
                    )
                count++;
        }
        
        links = new String[count];
        int position = 0;
        
        for (int i = 0; i < count; i++)
        {
            for (; position < input.length()-5; position++)
            {
                if (
                    input.substring(position, position+5).compareTo("src='") == 0 ||
                    input.substring(position, position+5).compareTo("src=\"") == 0 ||
                    input.substring(position, position+5).compareTo("ref='") == 0 ||
                    input.substring(position, position+5).compareTo("ref=\"") == 0 ||
                    input.substring(position, position+5).compareTo("SRC='") == 0 ||
                    input.substring(position, position+5).compareTo("SRC=\"") == 0 ||
                    input.substring(position, position+5).compareTo("REF='") == 0 ||
                    input.substring(position, position+5).compareTo("REF=\"") == 0
                    )
                {
                    position = position + 5;
                    int pos2 = position + 1;
                    while (input.charAt(pos2) != '\"' && input.charAt(pos2) != '\'')
                        pos2++;
                    
                    links[i] = input.substring(position, pos2);
                    position = pos2;
                    break;
                }
            }
        }
          
        return links;
    }
    
    public static String[] findBBCodelinks(String input)
    {
        String[] links;
        
        int count = 0;
        
        for (int i = 0; i < input.length()-5; i++)
        {
            if (
                    input.substring(i, i+4).compareTo("url=") == 0 ||
                    input.substring(i, i+4).compareTo("url]") == 0 ||
                    input.substring(i, i+4).compareTo("img=") == 0 ||
                    input.substring(i, i+4).compareTo("img]") == 0 ||
                    input.substring(i, i+4).compareTo("deo]") == 0 ||
                    input.substring(i, i+4).compareTo("URL=") == 0 ||
                    input.substring(i, i+4).compareTo("URL]") == 0 ||
                    input.substring(i, i+4).compareTo("IMG=") == 0 ||
                    input.substring(i, i+4).compareTo("IMG]") == 0 ||
                    input.substring(i, i+4).compareTo("DEO]") == 0
                    )
                count++;
        }
        
        links = new String[count];
        int position = 0;
        
        for (int i = 0; i < count; i++)
        {
            for (; position < input.length()-5; position++)
            {
                if (
                    input.substring(position, position+4).compareTo("url=") == 0 ||
                    input.substring(position, position+4).compareTo("url]") == 0 ||
                    input.substring(position, position+4).compareTo("img=") == 0 ||
                    input.substring(position, position+4).compareTo("img]") == 0 ||
                    input.substring(position, position+4).compareTo("deo]") == 0 ||
                    input.substring(position, position+4).compareTo("URL=") == 0 ||
                    input.substring(position, position+4).compareTo("URL]") == 0 ||
                    input.substring(position, position+4).compareTo("IMG=") == 0 ||
                    input.substring(position, position+4).compareTo("IMG]") == 0 ||
                    input.substring(position, position+4).compareTo("DEO]") == 0
                    )
                {
                    position = position + 4;
                    int pos2 = position + 1;
                    while (input.charAt(pos2) != ']' && input.charAt(pos2) != '[')
                        pos2++;
                    
                    links[i] = input.substring(position, pos2);
                    position = pos2;
                    break;
                }
            }
        }
        
        return links;
    }
}