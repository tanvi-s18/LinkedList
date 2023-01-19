
/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList
{
    // instance variables - replace the example below with your own
    private ListNode front;
    private ListNode back;
    private ListNode current;
    private int size;

    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedList()
    {   front= null;
        back= null;

    }

    public LinkedList(String a, String b, String c)
    { front= new ListNode(a, null);
        ListNode mid = new ListNode(b, null);
        front.setNext(mid);
        back= new ListNode(c, null);
        mid.setNext(back);
        size=3;

    }

    public String toString()
    { String answer= "size: " + size + "\nfront node: "+ front.getValue()+ "\nback node: " + back.getValue() + "\n";

        ListNode current= front;
        while( current != null)
        {answer = answer + current.toString() + "\n";
            current = current.returnNext();
        }
        return answer;
    }

    public int size()
    { current= front;
        int i= 0;
        while(current.returnNext() != null)
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
            back=temp;
        }
        else
        {
            back.setNext(temp);
            back = temp;
        }
        size++;

    }

    public void add(int loc, String newData)
    { ListNode temp = new ListNode(newData);

        if (loc > size)
            System.out.print("Location exceeds bounds.");
        if (size==0 && loc ==0)
        {
            front= temp;
            back= temp;
            size++;
        }
        if (loc == (size) && size!=0)
        { back.setNext(temp);
            back= temp;
            size++;
        }
        if ((front != null) && loc==0)
        { temp.setNext(front);
            front= temp;
            size++;
        }
        if(loc != size && loc!= 0)
        { int i=0;
            current= front;
            while(i<loc-1)
            {current= current.returnNext();
                i++;
            }
            temp.setNext(current.returnNext());
            current.setNext(temp);
            size++;

        }
    }

    public void remove(int loc)
    {   if(size==0)
            System.out.print("Index Out Of Bounds- Empty List");
        else if(loc==0)
        {front= front.returnNext();
            size--;
        }
        else if(loc==size-1)
        { current= front;

            for(int i=0; i< size-2;i++)
            {current=current.returnNext();
            }

            back= current;
            back.setNext(null);
            size--;
        }
        else
        {current= front;
            int i=0;
            while (i<loc-1)
            {current= current.returnNext();
                i++;
            }
            if(current.returnNext() != null)
            {current.setNext(current.returnNext().returnNext());
            }
            else current.setNext(null);
            size--;
        }

    }

    public void remove(String val)
    { current= front;
        int i= 0;
        while(current != null)
        { 
            if(current.getValue().equals(val))
            { remove(i);
                i--;
                current=current.returnNext();
                //int j= 0;
                // while(j< i-1)
                // {current= current.returnNext();
                // i++;
                // }
                // current.setNext(current.returnNext().returnNext());
                // size--;
            }
            else 
                current= current.returnNext();
                i++;
        }
    }
}

