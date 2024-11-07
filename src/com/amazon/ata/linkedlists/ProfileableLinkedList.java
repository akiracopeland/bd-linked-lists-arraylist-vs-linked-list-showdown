package com.amazon.ata.linkedlists;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A ProfileableList implementation using a LinkedList.
 *
 * PARTICIPANTS: Implement all methods that throw UnsupportedOperationException in any order.
 */
public class ProfileableLinkedList implements ProfileableList {
    private LinkedList<Double> list = new LinkedList<>();

    @Override
    public String getListImplementationType() {
        return "LinkedList";
    }

    @Override
    public void addFirst(Double data) {
        list.addFirst(data);
    }

    @Override
    public void addLast(Double data) {
        list.addLast(data);
    }

    @Override
    public Double getFirst() {
        return list.getFirst();
    }

    @Override
    public Double getMiddle() {
        int length = list.size();
        return list.get(length/2);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void addAll(Collection<Double> collection) {
        this.list.addAll(collection);
    }
}
