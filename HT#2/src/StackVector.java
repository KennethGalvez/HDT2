/*
Kenneth Eduardo Galvez Requena 20079
Ultima modificación: 05/02/2021
 */
public class StackVector<E> implements Stack<E> {

    protected Vector<E> v;

    public StackVector()
    {
        v = new Vector<E>();
    }

    public void push(E n)
    {
        v.add(n);
    }

    public E pop()
    {
        return v.remove(size()-1);
    }

    public E peek()
    {
        return v.get(size() - 1);
    }

    public int size()
    {
        return v.size();
    }

    public boolean empty()
    {
        return size() == 0;
    }


}
