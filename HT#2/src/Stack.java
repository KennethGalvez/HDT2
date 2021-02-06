/*
Kenneth Eduardo Galvez Requena 20079
Ultima modificación: 05/02/2021
Interface Stack <E>
 */

public interface Stack<E> {
    public void push(E item);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();
}
