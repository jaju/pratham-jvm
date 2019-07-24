package com.tavisca.workshops.pratham.datastructures;

public class Queue <Type> {
    private int capacity;
    private Type[] Queue;
    private int start = 0;
    private int end = 0;
    public static int defaultCapacity = 5;

    public Queue(){
        this.capacity = defaultCapacity;
        this.Queue = (Type[]) new Object[this.capacity];
    }

    public Queue(int capacity){
        this.capacity = capacity;
        this.Queue = (Type[]) new Object[this.capacity];
    }

    public void throwException(String exception) throws RuntimeException{
        throw new RuntimeException(exception);
    }

    public void add(Type value) throws RuntimeException{
        //System.out.println("Start is " + this.start + " and End is " + this.end);

        if((this.start == 0 && this.end == this.capacity) || this.end == (this.start-1) % (this.capacity )){
            throwException("Overflow start is " + this.start + " and end is " + this.end + " capacity is " + this.capacity());
        }

        if(this.end >= this.capacity){
            this.end %= this.capacity;
        }

        this.Queue[this.end] = value;
        this.end++;

    }

    public int capacity(){
        return this.capacity;
    }
    public Type remove() throws RuntimeException{

        if(this.start == this.end){
            throwException("Underflow");
        }

        Type value = this.Queue[start];
        this.start++;

        if(this.start >= this.capacity){
            this.start %= this.capacity;
        }

        return value;

    }


    public static void main(String[] args) throws RuntimeException {
        //Queue q = new Queue(5);

        Queue<Integer> q = new Queue<Integer>();
        for(int i = 0; i < 5; i++){
            q.add(i);
        }

        for(int i = 0; i < 3 ; i++){
            System.out.println(q.remove());
        }

        for(int i = 0; i < 2 ; i++){
            q.add(i+6);
        }

        for(int i = 0; i < 4; i++){
            System.out.println(q.remove());
        }
    }
}
