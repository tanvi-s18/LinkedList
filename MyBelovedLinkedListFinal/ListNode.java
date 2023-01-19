
/**
 * Write a description of class ListNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListNode
{
   

    private String data;
    private ListNode nextNode;
    
    public ListNode(String dat, ListNode nxt)
    { data= dat;
      nextNode= nxt;
    }
    
    public ListNode(String dat)
    {data=dat;
     nextNode=null;
    }
    
    public String getValue()
    {return data;
    }
    
    public ListNode returnNext()
    {return nextNode;
    }
    
    public void setValue(String nData)
    { data= nData;
    }
    
    public void setNext(ListNode nNext)
    {nextNode= nNext;
    }
    
    public String toString()
    { return "["+ data+ "]";
       // return "["+ this.data+ ":" + this.nextNode+ "]";
    }
}

