package com.example.pictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class DrawQueue<E>
    implements Queue<E>
{
    private ArrayList<E> queue;


    public DrawQueue()
    {
        queue = new ArrayList<E>();
    }


    public boolean addAll(Collection<? extends E> arg0)
    {

        // TODO Throw an exception
        return false;
    }


    public void clear()
    {
        queue.clear();
    }


    public boolean contains(Object object)
    {
        for (int i = 0; i < queue.size(); i++)
        {
            if (queue.get(i).equals(object))
            {
                return true;
            }
        }
        return false;
    }


    public boolean containsAll(Collection<?> ourobj)
    {
        int count = 0;
        for (Object obj : ourobj)
        {
            for (int i = 0; i < queue.size(); i++)
            {
                if (queue.get(i).equals(obj))
                {
                    count++;
                    i = queue.size();
                }
            }
        }
        if (count == ourobj.size())
        {
            return true;
        }
        return false;
    }


    public boolean isEmpty()
    {
        if (queue.size() == 0)
            return true;

        return false;
    }


    public Iterator<E> iterator()
    {

        return queue.iterator();
    }


    public boolean remove(Object object)
    {
        for (int j = 0; j < queue.size(); j++)
        {
            if (object.equals(queue.get(j)))
            {
                queue.remove(j);
                return true;
            }
        }
        return false;
    }


    public boolean removeAll(Collection<?> objects)
    {
        int count = 0;
        for (Object obj : objects)
        {
            if (this.remove(obj))
            {
                count++;
            }
        }
        if (count == objects.size())
            return true;
        return false;
    }


    public boolean retainAll(Collection<?> arg0)
    {
        // TODO throw an exception
        return false;
    }


    public int size()
    {
        return queue.size();
    }


    public Object[] toArray()
    {
        // TODO throw an exception
        return null;
    }


    public <T> T[] toArray(T[] array)
    {
        // TODO throw an exception
        return null;
    }


    public boolean add(E e)
    {
        queue.add(e);
        return true;
    }


    public E element()
    {
        // TODO throw an exception
        return null;
    }


    public boolean offer(E e)
    {
        // TODO throw an exception
        return false;
    }


    public E peek()
    {

        return queue.get(0);
    }


    public E poll()
    {
        // TODO throw an exception
        return null;
    }


    public E remove()
    {
        return queue.remove(0);
    }

}
