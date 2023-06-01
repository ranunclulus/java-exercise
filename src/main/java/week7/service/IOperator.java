package week7.service;

public interface IOperator {
    void setA(int a);

    void setB(int b);

    void generateQuestion(int max);

    String getQuestionMsg();

    boolean isEquals(int answer);
}
