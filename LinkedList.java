/**
 * @author      Michael Boettner
 * @version     1.0
 * LinkedList class provides framework for a singly linked list of nodes
 */
public class LinkedList {
    
    /**
    * The entry point of the linked list
    */
    private Node head;

    /**
     * Default constructor initializes the head to null
     */
    public LinkedList()
    {
        head = null;
    }
    
     /**
     * Sends node parameter to the compare function to be inserted
     *
     * @param  n the node to be added to the list
     */
    void insert(Node n)
    {
        compare(n);
    }
    
     /**
     * Creates a node with provided int value and calls compare function for
     * insertion
     *
     * @param  x the value to assign to the node's data member
     */
    void insert(int x)
    {
        Node nodeToInsert = new Node(x, null);
        compare(nodeToInsert);
    }
    
     /**
     * Tests all cases in which to insert node in ascending order 
     *
     * @param  nodeToInsert, the node to be inserted
     */
    private void compare(Node nodeToInsert)
    {
        //case if the list does not exist yet
        if(head == null)
        {
            head = nodeToInsert;
        }
        else
        {
            for(Node currentTemp = head; currentTemp != null;
                    currentTemp = currentTemp.next)
            {
                //if our node's data is greater than the first entry
                //we must move forward and test multiple cases
                if(nodeToInsert.data > currentTemp.data)
                {
                    //if true, this means we are at the end of the list
                    //and should insert our node after current node
                    if(currentTemp.next == null)
                    {
                        currentTemp.next = nodeToInsert;
                        break;
                    }
                    //if true, this means the next node's data is greater
                    //than the node to be placed. Insert here.
                    else if(nodeToInsert.data < currentTemp.next.data)
                    {
                        nodeToInsert.next = currentTemp.next;
                        currentTemp.next = nodeToInsert;
                        break;
                    }
                }
                //otherwise, if data of our node to be inserted is
                //less than current node, insert here.
                else if(nodeToInsert.data < currentTemp.data)
                {
                    nodeToInsert.next = head;
                    head = nodeToInsert;
                    break;
                }
            }
        }
        
    }
    
     /**
     * Finds node in list containing provided int data member
     *
     * @param  x The integer being searched for
     * @return Node having x as a data member, null if does not exist
     */
    Node find(int x)
    { 
        for(Node temp = head; temp != null; temp = temp.next)
        {
            if(temp.data == x)
                return temp;
        }
        return null; 
    }
        
     /**
     * Deletes the provided node
     *
     * @param  n The node to be deleted
     */
    void delete(Node n)
    {
       Node previousTemp = head;
       
        if(previousTemp.equals(n))
           head = head.next;
        else
        {
            for(Node currentTemp = head.next; currentTemp != null;
                    currentTemp = currentTemp.next)
            {
                if(currentTemp.equals(n))
                    previousTemp.next = currentTemp.next;
                
                //must also increment the previous pointer before looping
                previousTemp = currentTemp; 
            }
        }
    }
        
     /**
     * Deletes the first node containing the provided int value
     *
     * @param  x The integer being searched for
     */
    void delete(int x)
    {          
        boolean found = false;
        
        Node previousTemp = head;
       
       if(previousTemp.data == x)
       {
           found = true;
           head = head.next;
       }
       else
       {
            for(Node currentTemp = head.next; currentTemp != null;
                    currentTemp = currentTemp.next)
            {
                if(currentTemp.data == x)
                {
                    found = true;
                    previousTemp.next = currentTemp.next;
                }
                
                //must also increment the previous pointer before looping
                previousTemp = currentTemp; 
            }
       }
        
        if(!found)
            System.out.println("\nError: Value does not exist in the list.");
    }
        
     /**
     * Creates String containing data values of all list items
     *
     * @return String formatted with line breaks between values
     */
    @Override
    public String toString()
    {
        String myReturnString = "";
        
        if(head != null)
        {
            for(Node temp = head; temp != null; temp = temp.next)
            {
                myReturnString += temp.data + "\n";
            }
            return myReturnString;
        }
        
        return "\nNo entries exist in the list.";
    }
}