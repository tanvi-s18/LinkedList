
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    private String data;
    private Node next;
    
    public Node(String dat, Node nxt)
    { data= dat;
      next= nxt;
    }
    
    public Node(String dat)
    {data=dat;
     next=null;
    }
    
    public String getValue()
    {return data;
    }
    
    public Node returnNext()
    {return next;
    }
    
    public void setValue(String nData)
    { data= nData;
    }
    
    public void setNext(Node nNext)
    {next= nNext;
    }
}
