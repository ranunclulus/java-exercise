package week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AdjacentMatrix {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 입력받은 문자열을 띄어 쓰기 또는 지정된 delimiter를 기준으로 나누어서 한 단어씩 반환해 주는 도구
        StringTokenizer graphTokenizer // 8 10 입력
                = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken(): 다음 단어를 가져오기
        int maxNode = Integer.parseInt(graphTokenizer.nextToken());
        int edges = Integer.parseInt(graphTokenizer.nextToken());

        // 인접 행렬: 2차원 배열
        // 계산할 때마다 -1 을 해 주거나 인접 행렬을 하나씩 더 늘리거나
        int[][] adjMatrix = new int[maxNode][maxNode]; // 0~ 7 까지 표현 가능한 인접 행렬
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer
                    = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken()); // i 입력
            int endNode = Integer.parseInt(edgeTokenizer.nextToken()); // j 입력
            // 유향 그래프의 경우 이것만
            adjMatrix[startNode][endNode] = 1;
            // 무향 그래프의 경우에만 수행
            adjMatrix[edges][startNode] = 1;
        }
    }
}
/*
8 10 // 정점의 개수, 간선의 개수
0 1 // i, j
0 2
0 3
1 3
1 4
2 5
3 4
4 7
5 6
6 7
 */