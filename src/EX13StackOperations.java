import java.util.Scanner;

public class EX13StackOperations
{
    int top;
    int maxSize;
    int[] stack;

    // Constructor
     EX13StackOperations(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push Operation
    void push(int item) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed into stack.");
        }
    }

    // Pop Operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No elements to pop.");
        } else {
            System.out.println(stack[top--] + " popped from stack.");
        }
    }
    // Peek Operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }
    // Display Operation
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();
        EX13StackOperations stack = new EX13StackOperations(size);
        int choice;
        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
