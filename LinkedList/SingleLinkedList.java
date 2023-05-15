package LinkedList;
public class SingleLinkedList
{
    private Course head;
    private Course tail;
    private int size;

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    private class Course
    {
        int id;
        String name;
        int credit;
        String instructor;
        Course next;

        Course(int id, String name, int credit, String instructor)
        {
            this.id = id;
            this.name = name;
            this.credit = credit;
            this.instructor = instructor;
        }

        Course(int id, String name, int credit, String instructor, Course next)
        {
            this.id = id;
            this.name = name;
            this.credit = credit;
            this.instructor = instructor;
            this.next = next;
        }
    }

    public void addFirst(int id, String name, int credit, String instructor)
    {

        Course node = new Course(id, name, credit, instructor, head);
        node.next = head;
        head = node;
        if (tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void addLast(int id, String name, int credit, String instructor)
    {
        if (tail == null)
        {
            addFirst(id, name, credit, instructor);
            return;
        }

        Course node = new Course(id, name, credit, instructor);

        tail.next = node;
        tail = node;

        size++;
    }

    public void addIndex(int id, String name, int credit, String instructor, int index)
    {
        if (index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            addFirst(id, name, credit, instructor);
            return;
        }

        if (index == size)
        {
            addLast(id, name, credit, instructor);
            return;
        }

        Course temp = head;
        for (int i = 1; i < index; i++)
        {
            temp = temp.next;
        }

        Course node = new Course(id, name, credit, instructor, temp.next);
        temp.next = node;
        size++;

    }

    public void deleteFirst()
    {
        head = head.next;
        if (head == null)
        {
            tail = null;
        }
        size--;

    }

    public void deleteLast()
    {
        if (size <= 1)
        {
            deleteFirst();
        }

        Course secondLast = findNodeByIndex(size - 2);
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public void delete(int index)
    {
        if (index == 0)
        {
            deleteFirst();
        }
        if (index == size - 1)
        {
            deleteLast();
        }

        Course prev = findNodeByIndex(index - 1);

        prev.next = prev.next.next;
        size--;

    }

    public Course findNodeByIndex(int index)
    {
        Course node = head;

        for (int i = 0; i < index; i++)
        {
            node = node.next;
        }
        return node;
    }

    public Course findNodeByID(int id)
    {
        Course node = head;

        while (node != null)
        {
            if (node.id == id)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display()
    {
        Course temp = head;
        while (temp != null)
        {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }

    public void displayByID(int id)
    {
        Course temp = findNodeByID(id);
        System.out.println("ID: " + temp.id);
        System.out.println("Name: " + temp.name);
        System.out.println("Credit: " + temp.credit);
        System.out.println("Instructor: " + temp.instructor);
    }

}