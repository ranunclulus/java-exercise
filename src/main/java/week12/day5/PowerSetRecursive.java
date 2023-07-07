package week12.day5;

public class PowerSetRecursive {
    public void powerSet(
            int[] set,
            int next,
            int[] select
    ) {
        // 다 고르면 종료
        if (next == set.length) {
            for (int i = 0; i < set.length; i++) {
                if(select[i] == 1) System.out.println(set[i] + " ");
            }
            System.out.println();
            return;
        }
        // 안 골랐을 경우
        select[next] = 0;
        powerSet(set, next + 1, select);
        // 골랐을 경우
        select[next] = 1;
        powerSet(set, next + 1, select);

    }

    public static void main(String[] args) {
        int[] set = new int[] {2, 3, 5};
        int[] select = new int[3];
        new PowerSetRecursive().powerSet(set, 0, select);
    }
}
