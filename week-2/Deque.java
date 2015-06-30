import java.util.*;
import java.util.function.Consumer;

public class Deque<Item> implements Iterable<Item> {
    private Node root;

    class Node {
        private Node after, before;
        private Item value;

        public Node() {
        }

        public Node(Node after, Node before, Item value) {
            this.after = after;
            this.before = before;
            this.value = value;
        }

        public Node(Item value) {
            this.value = value;
        }

        public Node getAfter() {
            return after;
        }

        public Node getBefore() {
            return before;
        }

        public Item getValue() {
            return value;
        }
    }

    Iterator<Item> iterator = new Iterator<Item>() {
        @Override
        public boolean hasNext() {
            return root != null && root.getAfter() != null;
        }

        @Override
        public Item next() {
            // TODO: should remove from iterator
            return root.getAfter().getValue();
        }
    };

    public Deque() {
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

    public void addFirst(Item item) {
        if (root == null) {
            root = new Node();
        } else {
            root = new Node(root.getValue());
        }
    }

    public void addLast(Item item) {
    }

    public Item removeFirst() {
        return null;
    }

    public Item removeLast() {
        return null;
    }

    @Override
    public Iterator<Item> iterator() {
        return iterator;
    }

    public static void main(String[] args) {
    }
}