// TODO: junit what the heck??

import java.util.Iterator;

public class DequeTest {
    public void testIsEmpty() throws Exception {
        Deque<String> deque = new Deque<>();
        assertEquals(true, deque.isEmpty());
    }

    public void testIterator() throws Exception {
        Deque<String> deque = new Deque<>();
        deque.addFirst("hello world");
        Iterator<String> iterator = deque.iterator();
        assertNotNull(iterator);
        assertEquals(true, iterator.hasNext());
        assertEquals("hello world", iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    private void assertNotNull(Object input) throws Exception {
        if (input == null) {
            throw new Exception("Object is null");
        }
    }

    private void assertEquals(Object expected, Object actual) throws Exception {
        if (expected != actual) {
            throw new Exception("Expected " + expected + " to equal " + actual);
        }
    }

    public static void main(String[] args) {
        DequeTest dequeTest = new DequeTest();

        try {
            dequeTest.testIsEmpty();
            dequeTest.testIterator();

            System.out.println("All tests passed");
        } catch (Exception e) {
            System.out.printf("Exception: " + e);
            e.printStackTrace();
        }
    }
}