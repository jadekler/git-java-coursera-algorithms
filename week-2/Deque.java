import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    class Node {
        public Item value;
        public Node next;
        public Node before;

        public Node(Item value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public Deque() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        if (head == null) {
            head = new Node(item);
            tail = head;
        } else {
            Node oldHead = new Node(head.value);
            Node newHead = new Node(item);
            newHead.next = oldHead;
            head = newHead;
        }

        size += 1;
    }

    public void addLast(Item item) {
        if (tail == null) {
            tail = new Node(item);
            head = tail;
        } else {
            Node oldTail = new Node(tail.value);
            Node newTail = new Node(item);
            newTail.next = oldTail;
            tail = newTail;
        }

        size += 1;
    }

    public Item removeFirst() {
        Item oldHeadValue = head.value;
        head = head.next;
        size -= 1;

        return oldHeadValue;
    }

    public Item removeLast() {
        Item oldTailValue = tail.value;
        tail = tail.next;
        size -= 1;

        return oldTailValue;
    }

    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int index = 0;
            private Node current = head;

            @Override
            public boolean hasNext() {
                return index != size;
            }

            @Override
            public Item next() {
                Item oldCurrentValue = current.value;
                current = current.next;
                return oldCurrentValue;
            }
        };
    }

    public static void main(String[] args) {

    }
}