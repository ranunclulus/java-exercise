package week7.service;

public class MinusOperatorLevelOne implements IOperator{
    private int a;
    private int b;
    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        a = (int)(Math.random() * max);
        b = (int)(Math.random() * max);
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a - b) == answer;
    }
}
