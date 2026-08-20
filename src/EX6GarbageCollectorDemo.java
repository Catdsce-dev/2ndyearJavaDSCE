// Program to demonstrate the use of Garbage Collector in Java
class GarbageDemo {
    private int id;
    GarbageDemo(int id) {
        this.id = id;
        System.out.println("Object " + id + " created.");
    }
    // finalize() is called before object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + id + " is garbage collected.");
    }
}
public class EX6GarbageCollectorDemo {
    public static void main(String[] args) {
// Creating multiple objects
        GarbageDemo obj1 = new GarbageDemo(1);
        GarbageDemo obj2 = new GarbageDemo(2);

        GarbageDemo obj3 = new GarbageDemo(3);
// Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;
// Requesting JVM to run Garbage Collector
        System.out.println("Requesting Garbage Collection...");
        System.gc();
// Adding a delay so GC can finish (optional)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method.");
    }
}