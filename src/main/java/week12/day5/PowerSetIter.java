package week12.day5;

// 반복문으로 부분 집합 구하기
public class PowerSetIter {
    public static void main(String[] args) {
        int[] set = new int[] {2, 3, 5};
        int[] select = new int[3];
        // set의 각 원소를 선택할까 말까를 결정
        // 0이면 선택 X 1이면 선택 O
        for (int i = 0; i < 2; i++) {
            select[0] = i;
            for (int j = 0; j < 2; j++) {
                select[1] = j;
                for (int k = 0; k < 2; k++) {
                    select[2] = k;
                    for (int l = 0; l < 3; l++) {
                        if(select[l] == 1)
                            System.out.println(set[l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
