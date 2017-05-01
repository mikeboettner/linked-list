/**
 * @author      Michael Boettner
 * @version     1.0
 * Driver Class containing main method utilizing LinkedList and Node classes
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***********************");
        System.out.println("* COSC 311 Homework 1 *");
        System.out.println("*  Michael Boettner   *");
        System.out.println("***********************");
        
        /**
        * New LinkedList object
        */
        LinkedList myList = new LinkedList();
        
        System.out.println("List contents:\n" + myList.toString());
        myList.insert(8);
        System.out.println("List contents:\n" + myList.toString());
        myList.delete(8);
        System.out.println("List contents:\n" + myList.toString());
        
        myList.insert(3);       
        myList.insert(5);
        myList.insert(1);
        System.out.println("List contents:\n" + myList.toString());
        
        /**
        * New node
        */
        Node n = myList.find(3);
        
        myList.delete(n);
        
        System.out.println("List contents:\n" + myList.toString());
        
        myList.delete(1);
        
        System.out.println("List contents:\n" + myList.toString());
    } 
}