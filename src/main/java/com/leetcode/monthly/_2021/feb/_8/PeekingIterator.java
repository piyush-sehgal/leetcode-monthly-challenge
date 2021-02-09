package com.leetcode.monthly._2021.feb._8;

import java.util.Iterator;

/**
 * #284 https://leetcode.com/problems/peeking-iterator/
 */
class PeekingIterator implements Iterator<Integer> {

    Iterator<Integer> iterator;
    Integer next = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        next = this.iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return this.next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer result = next;
        if(this.iterator.hasNext()){
            next = this.iterator.next();
        }else{
            next = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
