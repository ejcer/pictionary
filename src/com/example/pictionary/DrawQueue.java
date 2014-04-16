package com.example.pictionary;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

import java.util.Queue;

public class DrawQueue<E> implements Queue<E>{
    private ArrayList<E> queue;

    public DrawQueue(){
        queue = new ArrayList<E>();
    }

    public boolean addAll(Collection<? extends E> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    public void clear() {
        queue.clear();
    }

    public boolean contains(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean remove(Object object) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean removeAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean retainAll(Collection<?> arg0) {
        // TODO Auto-generated method stub
        return false;
    }

    public int size() {
        return queue.size();
    }

    public Object[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }

    public <T> T[] toArray(T[] array) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean add(E e) {
        queue.add(e);
        return true;
    }

    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean offer(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    public E poll() {
        // TODO Auto-generated method stub
        return null;
    }

    public E remove() {
        return queue.remove(0);
    }

}
