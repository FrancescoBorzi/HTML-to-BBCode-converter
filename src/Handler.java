public interface Handler
{
    public void convert();
    public void check();
}

class HTML implements Handler
{
    private static HTML myHandler = new HTML();
    
    public static HTML getHandler()
    {
        return myHandler;
    }
    
    public void convert()
    {
        // to do: convert code to BBCode language and print the output on the other textArea
    }
    
    public void check()
    {
        // to do: check for code errors
    }
}

class BBCode implements Handler
{
    private static BBCode myHandler = new BBCode();
    
    public static BBCode getHandler()
    {
        return myHandler;
    }
    
    public void convert()
    {
        // to do: convert code to HTML language and print the output on the other textArea
    }
    
    public void check()
    {
        // to do: check for code errors
    }
    
}

class Context
{
    private static HTML handlerOfHTML = HTML.getHandler();
    private static BBCode handlerOfBBcode = BBCode.getHandler();
    private static Context myContex = new Context();
    
    private static HTML getHTML()
    {
        return handlerOfHTML;
    }
    
    private static BBCode getBBcode()
    {
        return handlerOfBBcode;
    }
    
}