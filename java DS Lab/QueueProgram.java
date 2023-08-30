import java.util.NoSuchElementException;
class Queue 
{
    private Object[] array;
    private int size = 0;
    private int head = 0; // index of the current front item, if one exists
    private int tail = 0; // index of next item to be added

    public Queue(int capacity) 
    {
        array = new Object[capacity];
    }

    public void enqueue(Object item) 
    {
        if (size == array.length) 
        {
            System.out.println("Queque is full");
        }
        else
        {
            array[tail] = item;
            tail = (tail + 1) % array.length;
            size++;
        }
    }

    public Object dequeue() 
    {
        if (size == 0) 
        {
            throw new NoSuchElementException ("Cannot remove from empty queue");
        }
        else 
        {
            Object item = array[head];
            array[head] = null;
            head = (head + 1) % array.length;
            size--;
            return item;
        }
    }

    public Object peek() 
    {
        if (size == 0) 
        {
           throw new NoSuchElementException("Cannot peek into empty queue");
        
        }
        else 
        { 
        return array[size - 1]; 
        }
    }

    public boolean isEmpty() 
    {
        return size == 0;
    }

    public int size() 
    {
        return size;
    }
}

class QueueProgram 
{
     public static void main(String a[]) 
     {
        Queue q = new Queue(4);
        q.enqueue("A");
            q.enqueue("B");
        q.enqueue("C");
            System.out.println(q.dequeue());
        q.enqueue("D");
            System.out.println(q.dequeue());
        q.enqueue("E");
        q.enqueue("F");
        q.enqueue("G");
    }
}

