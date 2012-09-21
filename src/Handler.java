public interface Handler
{
    public void convert();
    public void check();
    public void clear();
}

class HTML implements Handler
{
    public void convert()
    {
        // to do: convert code to BBCode language and print the output on the other textArea
    }
    
    public void check()
    {
        // to do: check for code errors
    }
    
    public void clear()
    {
        // to do: clear textArea
    }
}

class BBCode implements Handler
{
    public void convert()
    {
        // to do: convert code to HTML language and print the output on the other textArea
    }
    
    public void check()
    {
        // to do: check for code errors
    }
    
    public void clear()
    {
        // to do: clear textArea
    }
}

class Context
{
    Handler codeHandler;
}