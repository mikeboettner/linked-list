/**
 * @author      Michael Boettner
 * @version     1.0
 * Node class allows for new node creation and initialization of data
 */
public class Node {
        
    /**
    * Data member, integer value
    */
    int data;
        
    /**
    * Points to the next node in the list
    */
    Node next;
    
     /**
     * Constructor initializes a new node
     *
     * @param  data The int value being stored in the new node
     * @param  next The node which will follow this node
     */
    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
        
     /**
     * Creates String containing data value of the node
     *
     * @return String of node's data
     */    
    @Override
    public String toString()
    {
        return Integer.toString(this.data);
    }
}
