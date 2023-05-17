package week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack01 {
    private int[] arr;
    private int pointer = 0;

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[pointer++] = value;
    }
    public int pop() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }
    public void print() {
        System.out.println(Arrays.toString(this.arr));
    }

    public boolean isEmpty() {
        return (this.pointer == 0);
    }

    public int peek() {
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack01 stack = new Stack01(10);
        stack.push(10);
        stack.push(2);
        stack.push(4);
        stack.print();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
