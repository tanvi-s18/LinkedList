
/**
 * Write a description of class CLLRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CLLRunner
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class CLLRunner
     */
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        // CircularLinkedList<String> test1= new CircularLinkedList();
        // //test1.add("a");
        // System.out.println(test1);
        // test1.add("b");
        // System.out.println(test1);
        // test1.add("d");
        // System.out.println(test1);
        // test1.add(2, "c");
        // System.out.println(test1);
        // test1.remove("d");
        // System.out.println(test1);
        // System.out.println("Add element a to front:");
        // test1.add(0, "a");
        // System.out.println(test1);
        // CircularLinkedList<String> test2= new CircularLinkedList("a", "b", "c", "d");
        // System.out.println(test2);
        // test2.add("e");
          CircularLinkedList<String> test1 = new CircularLinkedList("b", "c", "d", "f");
      System.out.println("Original List:");
      System.out.println(test1);
      //test1.add("d");
      
      System.out.println("Add element a to front:");
      test1.add(0,"a");
      System.out.println(test1);
      System.out.println("Add element g to end:");
      test1.add("g");
      System.out.println(test1);
      System.out.println("Add element e to location 4:");
      test1.add(4,"e");
      System.out.println("Check pointers by stopping when it hits front:");
      test1.printAll();
      System.out.println("Check pointers by using getFront() method:");
      System.out.println(test1.testGetFront());
      System.out.println(test1);
      System.out.println("Remove element g (from end of list):");
      test1.remove("g");
      System.out.println(test1);
      System.out.println("Remove element a (from front of list):");
      test1.remove("a");
      System.out.println(test1);
      System.out.println("Remove element c (from middle of list):");
      test1.remove("c");
      System.out.println(test1);
      System.out.println("Remove element t from list:");
      test1.remove("t");
      System.out.println(test1);
      System.out.println("Restart with list of 7 elements (manually add back removed nodes):");
      test1.add(0,"a");
      test1.add("g");
      test1.add(2,"c");
      System.out.println(test1);
      System.out.println("Get value at location 3:");
      System.out.println(test1.getValue(3));
      System.out.println("Get value at location 6 (loc= size-1):");
      System.out.println(test1.getValue(6));
      System.out.println("Get value at location 0:");
      System.out.println(test1.getValue(0));
      System.out.println("Get value at location 10:");
      System.out.println(test1.getValue(10));
      System.out.println("Get location of value b:");
      System.out.println(test1.getLocation("b"));
      System.out.println("Get location of value a:");
      System.out.println(test1.getLocation("a"));
      System.out.println("Get location of value h:");
      System.out.println(test1.getLocation("h"));
      System.out.println("Remove element at location 3 from list:");
      test1.remove(3);
      System.out.println(test1);
      System.out.println("Remove element at location 0 (front of list) from list:");
      test1.remove(0);
      System.out.println(test1);
      System.out.println("Remove element at location 4 (end of list) from list:");
      test1.remove(4);
      System.out.println(test1);
      System.out.println("Remove element at location 6 (out of bounds)  from list:");
      test1.remove(6);
      System.out.println(test1);
      System.out.println("Remove element at location 1:");
      test1.remove(1);
      System.out.println(test1);
      System.out.println("Remove element at location 0:");
      test1.remove(0);
      System.out.println(test1);
      System.out.println("Remove element at location 0:");
      test1.remove(0);
      System.out.println(test1);
      System.out.println("Add element b when size =1");
      test1.add(1,"b");
      System.out.println(test1);
      System.out.println("Remove element at location 0:");
      test1.remove(0);
      System.out.println(test1);
      System.out.println("Remove element at location 0:");
      test1.remove(0);
      System.out.println(test1);
      System.out.println();
      System.out.println("New list:");
      CircularLinkedList<Double> test2 = new CircularLinkedList(.2, .4, .5, .6);
      System.out.println(test2);
      System.out.println("Add element .3 to location 1");
      test2.add(1, .3);
      System.out.println(test2);
      System.out.println("Add element .1 to front");
      test2.add(0,.1);
      System.out.println(test2);
      System.out.println("Add element .7 to end");
      test2.add(.7);
      System.out.println(test2);
      System.out.println("Remove element .3");
      test2.remove(.3);
      System.out.println(test2);
      System.out.println("Remove element .1");
      test2.remove(.1);
      System.out.println(test2);
      System.out.println("Remove element .6");
      test2.remove(.6);
      System.out.println(test2);
      System.out.println("Restart with list of 7 elements (manually add back removed nodes):");
      test2.add(0, .1);
      test2.add(2, .3);
      test2.add(.7);
      System.out.println(test2);
      System.out.println("Get value at location 2:");
      System.out.println(test2.getValue(2));
      System.out.println("Get location of value .2:");
      System.out.println(test2.getLocation(.2));
      System.out.println("Get location of value .72:");
      System.out.println(test2.getLocation(.72));
      System.out.println("Remove element at location 3");
      test2.remove(3);
      System.out.println(test2);
      System.out.println("Remove element from front of list");
      test2.remove(0);
      System.out.println(test2);
      System.out.println("Remove element from end of list");
      test2.remove(4);
      System.out.println(test2);
      System.out.println("Remove element at location 5");
      test2.remove(6);
      System.out.println(test2);
      System.out.println("Remove element .4");
      test2.remove(.8);
      System.out.println(test2);
      System.out.println("Add element .5 at location 10");
      test2.add(10, .5);
      System.out.println();
      System.out.println("New list:");
      CircularLinkedList<Double> test3 = new CircularLinkedList();
      System.out.println(test3);
      System.out.println("Add element 1.0 when size of list is 0");
      test3.add(1.0);
      System.out.println(test3);
      System.out.println("Add element 0.0 to front of list when size of list is 1");
      test3.add(0,0.0);
      System.out.println(test3);
      System.out.println("New List:");
      CircularLinkedList<Double> test4 = new CircularLinkedList();
      System.out.println(test4);
      System.out.println("Add element 1.0 to location 0 when size of list is 0");
      test4.add(0,1.0);
      System.out.println(test4);
      System.out.println("Remove element at location 0 when size=1");
      test4.remove(0);
      System.out.println(test4);
      
    }
}
