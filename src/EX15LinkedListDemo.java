import java.util.Scanner;

//Node class for Singly Linked List
class SLLNode
{
    int data;
    SLLNode next;

    SLLNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List Implementation
class SinglyLinkedList
{
    SLLNode head;

    // Insert at end
    void insertAtEnd(int data)
    {
        SLLNode newNode = new SLLNode(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        SLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Delete by value
    void delete(int key)
    {
        if (head == null)
        {

            System.out.println("List is empty.");
            return;
        }
        if (head.data == key)
        {
            head = head.next;
            System.out.println("Deleted " + key);
            return;
        }
        SLLNode temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;
        if (temp.next == null)
            System.out.println("Element not found.");
        else
        {
            temp.next = temp.next.next;
            System.out.println("Deleted " + key);
        }
    }

    // Display list
    void display()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Singly Linked List: ");
        SLLNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Node class for Doubly Linked List
class DLLNode
{
    int data;
    DLLNode prev, next;

    DLLNode(int data)
    {
        this.data = data;
        this.prev = this.next = null;
    }
}

// Doubly Linked List Implementation
class DoublyLinkedList
{
    DLLNode head;

    // Insert at end
    void insertAtEnd(int data)
    {
        DLLNode newNode = new DLLNode(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        DLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a node
    void delete(int key)
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        DLLNode temp = head;
        while (temp != null && temp.data != key)
            temp = temp.next;
        if (temp == null)
        {
            System.out.println("Element not found.");
            return;
        }
        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        System.out.println("Deleted " + key);
    }

    // Display forward
    void displayForward()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Doubly Linked List (Forward): ");

        DLLNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Display backward
    void displayBackward()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        DLLNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        System.out.print("Doubly Linked List (Backward): ");
        while (temp != null)
        {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }
}

public class EX15LinkedListDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();
        int choice, value;
        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Insert (Singly Linked List)");
            System.out.println("2. Delete (Singly Linked List)");
            System.out.println("3. Display (Singly Linked List)");
            System.out.println("4. Insert (Doubly Linked List)");
            System.out.println("5. Delete (Doubly Linked List)");
            System.out.println("6. Display Forward (Doubly Linked List)");
            System.out.println("7. Display Backward (Doubly Linked List)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:

                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    sll.insertAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    sll.delete(value);
                    break;
                case 3:
                    sll.display();
                    break;
                case 4:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    dll.insertAtEnd(value);
                    break;
                case 5:
                    System.out.print("Enter value to delete: ");
                    value = sc.nextInt();
                    dll.delete(value);
                    break;
                case 6:
                    dll.displayForward();
                    break;
                case 7:
                    dll.displayBackward();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 8);
    }
}
