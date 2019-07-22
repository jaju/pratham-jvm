package com.tavisca.workshops.pratham.datastructures;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Queue<T> {
    private int capacity;
    private ArrayList<T> queue = new ArrayList<T>();

    public Queue(){
        capacity = 1;
    }

    public Queue(int capacity){
        this.capacity = capacity;
    }

    public  int GetCapacity(){
        return  capacity;
    }

    public void add(T value)throws IndexOutOfBoundsException{
        if(queue.size()<capacity)
            queue.add(value);
        else
            throw new IndexOutOfBoundsException();
    }

    public T remove() throws EmptyStackException {
        if(queue.size()>0)
            return queue.remove(0);
        else
            throw new EmptyStackException();
    }

    public ArrayList<T> GetQueue(){
        return  queue;
    }

    public static void main(String[] args) {
        Queue forDefaultSize = new Queue();
        Queue forSuppliedSize = new Queue(5);
        System.out.println("Default size:" + forDefaultSize.GetCapacity());
        System.out.println("Supplied size:" + forSuppliedSize.GetCapacity());
        for(int i=0; i<5; i++){
            try {
                forSuppliedSize.add(i);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println();
        for (int i=0; i<3; i++)
            try{
                System.out.println(forSuppliedSize.remove());
            }catch (Exception e){
                System.out.println(e);
    }

        System.out.println();

        for(Object items: forSuppliedSize.GetQueue()){
            System.out.println(items);
        }

        System.out.println();
        for (int i=0; i<3; i++)
            try{
                System.out.println(forSuppliedSize.remove());
            }catch (Exception e){
                System.out.println(e);
    }

        System.out.println();

        for(int i=0; i<6; i++){
            try{
                forSuppliedSize.add(i);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
