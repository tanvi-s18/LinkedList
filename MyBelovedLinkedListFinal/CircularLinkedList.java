
/**
 * Write a description of class CircularLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircularLinkedList<T> implements MyLL<T>
{
    // instance variables - replace the example below with your own
    private ListNode front;
    private ListNode back;
    private ListNode current;
    private int size;

    public class ListNode
    {

        private T data;
        private ListNode next;

        public ListNode(T dat, ListNode nxt)
        
        
        { data= dat;
          next= nxt;
        }

        public ListNode(T dat)
        {data=dat;
         next=null;
        }

        public String toString()
        { return "["+ data+ "]";
            // return "["+ this.data+ ":" + this.nextNode+ "]";
        }
    }

    /**
     * Constructor for objects of class CircularLinkedList
     */
    public CircularLinkedList()
    {   front= null;
        back= front;

    }

    public CircularLinkedList(T a, T b, T c, T d)
    { front= new ListNode(a, null);
        ListNode mid = new ListNode(b, null);
        front.next=mid;
        ListNode mid1= new ListNode(c, null);
        mid.next= mid1;
        back= new ListNode(d, front);
        mid1.next=back;
        size=4;

    }
    @Override
    public String toString()
    { 
        String answer;
        if (size>0)
        { answer= "size: " + this.size() + "\nfront node: "+ front.toString()+ "\nback node: " + back.toString() + "\n";

        ListNode current= front;
          do 
        {answer = answer + current.toString() + "\n";
            current= current.next;
        }
        while( current != front);
    }
        else 
        answer= "List is empty";
        return answer;
    }
    @Override
    public int size()
    { current= front;
        int i= 0;
         do 
        { i++;
          current= current.next;
        }
        while(current != front);
        
    
        if (size == i)
        {return i;
        }
        else
        {System.out.println("Size was not properly updated");
        return 0;
    }
    }
    @Override
    public void add(T newData)
    { ListNode temp= new ListNode(newData);
        if (front == null)
        {
            front= temp;
            back=temp;
            back.next= front;
        }
        else
        {
            back.next=temp;
            back = temp;
            back.next= front;
        }
        size++;

    }
    @Override
    public void add(int loc, T newData)
    { ListNode temp = new ListNode(newData);
        if (size==0 && loc ==0)
        {
            front= temp;
            back= front;
            back.next= front;
            size++;
        }
        
        else if (loc == (size) && size!=0)
        { back.next=temp;
            back= temp;
            back.next= front;
            size++;
        }
        else if ((front != null) && loc==0)
        { temp.next=front;
            back.next= temp;
            front= temp;
            back.next= front;
            size++;
        }
        else if(loc > size)
        {System.out.println("Out of Bounds");
        }
        else if(loc != size && loc!= 0)
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
    @Override
    public T remove(int loc)
    {   T temp1;
        ListNode temp2;
        if(size==0)
            System.out.print("Index Out Of Bounds- Empty List");
        else if(loc==0)
        {   temp1= front.data;
            front= front.next;
            back.next=front;
            size--;
            return temp1;
        }
        else if(loc==size-1)
        { 
            current= front;

            for(int i=0; i< size-2;i++)
            {current=current.next;
            }
            temp1= back.data;
            back= current;
            back.next=front;
            size--;
            return temp1;
        }
        else if(loc >= size || loc <0)
        { System.out.println("Index Out of Bounds");
            return null;
        }
        else
        {current= front;
            int i=0;
            while (i<loc-1)
            {current= current.next;
                i++;
            }
            temp1= current.next.data;
            current.next=current.next.next;
            size--;
            return temp1;
        }
        return null;
    }
    @Override
    public void remove(T val)
    { current= front;
        int i= 0;
        int c=0;
        do 
        { 
            if(current.data.equals(val))
            { remove(i);
                i--;
                current=current.next;
                c++;
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
        while(current != front);
        if (c == 0)
        {System.out.println("Value not found-cannot be removed");
        }
    }
    @Override
    public T getValue(int loc)
    {   
        if (loc >= 0 && loc < size)
        {int i=0;
            current= front;
            while(i<loc)
            {current= current.next;
                i++;
            }
            return current.data;
        }   
        System.out.println("Location out of bounds");

        return null;

    }
    @Override
    public int getLocation(T val)
    { current= front;
        int i= 0;
        do 
        {if (current.data.equals(val))
            {return i;
            }
            i++;
            current= current.next;
        }
        while(current != front);
        System.out.println("Value not found");
        return -1;
    }
    public void printAll()
    { current= front;
        do
        {System.out.println(current);
         current= current.next;
        }
        while(current!=front);
    }
    public ListNode testGetFront()
    {return back.next;
    }
}

