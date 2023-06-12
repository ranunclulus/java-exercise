package week9.day1;

public class Stack {
    private int top;
    private final int[] arr = new int[16];

    public Stack(){
        top = -1;
    }

    // push: 데이터를 스택 제일 위에 넣는 method
    public void push(int data) {
        if(arr.length - 1 == top) {
            throw new RuntimeException("stack is full");
        }
        else {
            top++;
            arr[top] = data;
        }
    }

    // pop: 데이터를 스택 위에서 하나 삭제하는 mtehod
    public int pop() {
        if (arr.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        else {
            return arr[top--];
        }
    }

    // isEmpty: 스택이 비어 있는지를
    public boolean isEmpty() {
        return (arr.length == 0);
    }

    // isFull: 스택이 가득 차 있는지를
    public boolean isFull() {
        return (arr.length == 16);
    }

    // peek: 가장 위에 있는 데이터 반환
    public int peek() {
        return arr[top];
    }
}
