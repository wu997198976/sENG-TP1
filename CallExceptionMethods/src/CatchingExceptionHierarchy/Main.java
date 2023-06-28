package CatchingExceptionHierarchy;
class MyParentException extends Exception {
}
class MyChildException extends MyParentException {
}
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyChildException();
        } catch (MyChildschildException s) {
            System.err.println("Caught MyChildschildException");
        } catch (MyChildException a) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException e) {
            System.err.println("Caught MyParentException");
        }
    }
}