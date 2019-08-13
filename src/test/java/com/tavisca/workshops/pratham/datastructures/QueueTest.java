package com.tavisca.workshops.pratham.datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private int capacity = 8;
    private Queue<Integer> b;

    @BeforeEach
    void initialize() {
        this.b = new Queue<>(this.capacity);
    }

    @Test
    void isConstructedWithDefaultCapacity() {
        assertEquals(1, new Queue().GetCapacity());
    }

    @Test
    void canBeConstructedWithSuppliedCapacity() {
        int capacity = 64;
        assertEquals(capacity, new Queue(capacity).GetCapacity());
    }

    @Test
    void acceptsAValueToAdd() {
        b.add(10);
        assertEquals(10, b.remove());
    }

    @Test
    void acceptsMultipleValuesToAdd() {
        for (int v : new int[]{1, 2, 3}) {
            b.add(v);
        }
        assertEquals(1, b.remove());
    }

    @Test
    void removesValuesInTheSameOrderAsAdded() {
        int[] insertedValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int v: insertedValues) {
            b.add(v);
        }
        for (int v: insertedValues) {
            assertEquals(b.remove(), v);
        }
    }

    @Test
    void throwsExceptionWhenCapacityIsExhausted() {
        assertThrows(Exception.class,
                () -> {
                    for (int v : new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}) {
                        b.add(v);
                    }
                });
    }

    @Test
    void handlesInterspersedRemoves() {
        int[] insertionLot1 = new int[]{1, 2, 3, 4};
        int[] insertionLot2 = new int[]{9, 10, 11, 12, 13, 14, 15};

        for (int v: insertionLot1) {
            b.add(v);
        }

        for (int i = 0; i < 3; i++) {
            assertEquals(b.remove(), insertionLot1[i]);
        }

        for (int v: insertionLot2) {
            b.add(v);
        }

    }

    @Test
    @Tag("hidden")
    void andSomeStressTesting() {
        int numLoops = 10;
        Random randomSource = new Random();
        for (int counter = 0; counter < numLoops; counter++) {
            int removalsCount = 2; randomSource.nextInt(128);
            int capacity = removalsCount * 3;
            int halfRun = capacity / 2;
            Queue<Integer> q = new Queue<>(capacity);
            for (int i = 0; i < halfRun; i++) {
                q.add(i);
            }
            for (int i = 0; i < removalsCount; i++) {
                assertEquals(i, q.remove());
            }
            for (int i = halfRun; i < capacity + removalsCount; i++) {
                q.add(i);
            }
            for (int i = removalsCount; i < capacity + removalsCount; i++) {
                int a = q.remove();
                assertEquals(i, a);
            }
            assertThrows(Exception.class, q::remove);
        }
    }
}
