package io.zipcoder;

import sun.jvm.hotspot.runtime.BasicObjectLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier implements Runnable {

    private Lock lock = new ReentrantLock();

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
            while (stringIterator.hasNext()) {
                copied += stringIterator.next() + " ";
            }
    }
}
