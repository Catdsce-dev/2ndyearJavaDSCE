import java.util.Scanner;

class Queue
{
    int front, rear, size;
    int[] queue;
    Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = rear = -1;
    }
    // Enqueue operation
    void enqueue(int item) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = item;
            System.out.println(item + " inserted into queue.");
        }
    }
    // Dequeue operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println(queue[front] + " deleted from queue.");
            front++;
        }
    }
    // Peek operation
    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }
    // Display operation
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }
}
class Deque {
    int front, rear, size;
    int[] deque;
    Deque(int size) {
        this.size = size;
        deque = new int[size];
        front = rear = -1;
    }
    // Insert at front
    void insertFront(int item) {
        if (front == 0) {
            System.out.println("Cannot insert at front!");
        } else if (front == -1) {
            front = rear = 0;
            deque[front] = item;
        } else {
            deque[--front] = item;
        }
        System.out.println(item + " inserted at front.");
    }
    // Insert at rear
    void insertRear(int item) {
        if (rear == size - 1) {
            System.out.println("Deque Overflow!");
        } else {
            if (front == -1)
                front = 0;
            deque[++rear] = item;
            System.out.println(item + " inserted at rear.");
        }
    }
    // Delete from front
    void deleteFront() {
        if (front == -1) {
            System.out.println("Deque Underflow!");
        } else {
            System.out.println(deque[front] + " deleted from front.");
            if (front == rear)
                front = rear = -1;
            else
                front++;
        }
    }
// Delete from rear

    void deleteRear() {
        if (rear == -1) {
            System.out.println("Deque Underflow!");
        } else {
            System.out.println(deque[rear] + " deleted from rear.");
            if (front == rear)
                front = rear = -1;
            else
                rear--;
        }
    }
    // Display
    void display() {
        if (front == -1) {
            System.out.println("Deque is empty.");
        } else {
            System.out.println("Deque elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(deque[i] + " ");
            }
            System.out.println();
        }
    }
}
public class EX14QueueAndDequeDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Enter size of Queue/Deque: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        Deque dq = new Deque(size);
        do
        {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Enqueue (Queue)");
            System.out.println("2. Dequeue (Queue)");
            System.out.println("3. Display Queue");
            System.out.println("4. Insert Front (Deque)");
            System.out.println("5. Insert Rear (Deque)");
            System.out.println("6. Delete Front (Deque)");
            System.out.println("7. Delete Rear (Deque)");
            System.out.println("8. Display Deque");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter element to enqueue: ");

                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.print("Enter element to insert at front: ");
                    dq.insertFront(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter element to insert at rear: ");
                    dq.insertRear(sc.nextInt());
                    break;
                case 6:
                    dq.deleteFront();
                    break;
                case 7:
                    dq.deleteRear();
                    break;
                case 8:
                    dq.display();
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
        sc.close();
    }
}
