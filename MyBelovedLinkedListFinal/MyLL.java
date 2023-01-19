
/**
 * Write a description of interface MyLL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface MyLL<T>
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    int size();
    void add(T newData);
    void add(int loc, T newData);
    T getValue(int loc);
    int getLocation(T val);
    void remove(T val);
    T remove(int loc);
    String toString();
    
    
}
