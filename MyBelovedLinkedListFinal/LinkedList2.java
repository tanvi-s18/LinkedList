
/**
 * Write a description of class LinkedList2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList2
{
    // instance variables - replace the example below with your own
    private ListNode front;
    private ListNode back;
    private ListNode current;
    private int size;


public class ListNode
{
   

    private String data;
    private ListNode next;
    
    public ListNode(String dat, ListNode nxt)
    { data= dat;
      next= nxt;
    }
    
    public ListNode(String dat)
    {data=dat;
     next=null;
    }
    
   
    
    public String toString()
    { return "["+ data+ "]";
       // return "["+ this.data+ ":" + this.nextNode+ "]";
    }
}


    /**
     * Constructor for objects of class LinkedList2
     */
    public LinkedList2()
    {   front= null;
        back= null;

    }
    
    public LinkedList2(String a, String b, String c)
    { front= new ListNode(a, null);
        ListNode mid = new ListNode(b, null);
        front.next=mid;
        back= new ListNode(c, null);
        mid.next=back;
        size=3;

    }

    public String toString()
    { String answer= "size: " + size + "\nfront node: "+ front.data+ "\nback node: " + back.data + "\n";

        ListNode current= front;
        while( current != null)
        {answer = answer + current.toString() + "\n";
            current= current.next;
        }
        return answer;
    }
    public int size()
    { current= front;
        int i= 0;
        while(current.next != null)
        { i++;
        }
        i++;
        
        return i;
    }
    public void add(String newData)
    { ListNode temp= new ListNode(newData);
        if (front == null)
        {
            front= temp;
        }
        else
        {
            back.next=temp;
            back = temp;
        }
        size++;

    }

    public void add(int loc, String newData)
    { ListNode temp = new ListNode(newData);
        if (size==0 && loc ==0)
        {
            front= temp;
            back= temp;
            size++;
        }
        else if (loc == (size) && size!=0)
        { back.next=temp;
            back= temp;
            size++;
        }
        else if ((front != null) && loc==0)
        { temp.next=front;
            front= temp;
            size++;
        }
        if(loc != size && loc!= 0)
        { int i=0;
            current= front;
            while(i<loc-1)
            {current= current.next;
                i++;
            }
            temp.next=current.next;
            current.next=temp;
            size++;

        }
    }

    public void remove(int loc)
    {   if(size==0)
            System.out.print("Index Out Of Bounds- Empty List");
        else if(loc==0)
        {front= front.next;
         size--;
        }
        else if(loc==size-1)
        { back= back.next;
          size--;
        }
        else
        {current= front;
            int i=0;
            while (i<loc-1)
            {current= current.next;
                i++;
            }
            if(current.next != null)
            {current.next= (current.next.next);
            }
            else current.next=(null);
            size--;
         }

    }
    
    public void remove(String val)
    { current= front;
        int i= 0;
        while(current != null)
        { 
            if(current.data.equals(val))
            { remove(i);
                i--;
                current=current.next;
                //int j= 0;
                // while(j< i-1)
                // {current= current.returnNext();
                // i++;
                // }
                // current.setNext(current.returnNext().returnNext());
                // size--;
            }
            else 
                current= current.next;
                i++;
        }
    }
}

