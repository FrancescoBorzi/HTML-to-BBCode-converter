public interface Handler
{
    public String convert(String input);
    public String check(String input);
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
        return "TO DO";
    }
    
    public String check(String input)
    {
        return "TO DO";
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
        return "TO DO";
    }
    
    public String check(String input)
    {
        return "TO DO";
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