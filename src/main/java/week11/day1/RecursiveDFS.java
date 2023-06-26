package week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RecursiveDFS {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 입력받은 문자열을 띄어 쓰기 또는 지정된 delimiter를 기준으로 나누어서 한 단어씩 반환해 주는 도구
        StringTokenizer graphTokenizer // 8 10 입력
                = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken(): 다음 단어를 가져오기
        int maxNodes = Integer.parseInt(graphTokenizer.nextToken());
        int edges = Integer.parseInt(graphTokenizer.nextToken());

        // 인접 행렬: 2차원 배열
        // 계산할 때마다 -1 을 해 주거나 인접 행렬을 하나씩 더 늘리거나
        int[][] adjMatrix = new int[maxNodes][maxNodes]; // 0~ 7 까지 표현 가능한 인접 행렬
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer
                    = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken()); // i 입력
            int endNode = Integer.parseInt(edgeTokenizer.nextToken()); // j 입력
            // 유향 그래프의 경우 이것만
            adjMatrix[startNode][endNode] = 1;
            // 무향 그래프의 경우에만 수행
            adjMatrix[endNode][startNode] = 1;
        }
        boolean[] visited = new boolean[maxNodes];
        List<Integer> visitOrder = new ArrayList<>();

        recursive(0, maxNodes, adjMatrix, visited, visitOrder);
        System.out.println(visitOrder);
    }

    // 목적: dfs를 했을 때 정점 방문 순서 기록
    public void recursive(
            // 다음 (이번 호출)에서 방문할 곳
            int next,
            // 원활한 순회를 위한 maxNodes
            int maxNodes,
            // 인접 정점 정보 (그래프 정보)
            int[][] adjMatrix,
            // 방문한 정점 정보
            boolean[] visited,
            // 방문 순서 기록을 위한 리스트
            List<Integer> visitOrder
        ) {
        visited[next] = true;
        visitOrder.add(next);
        for (int i = 0; i < maxNodes; i++) {
            // 연결이 되어 있으며 방문한 적 없을 때 재귀 호출
            if(adjMatrix[next][i] == 1 && !visited[i])
                recursive(i, maxNodes, adjMatrix, visited, visitOrder);
        }
    }

    public static void main(String[] args) throws IOException {
        RecursiveDFS recursiveDFS = new RecursiveDFS();
        recursiveDFS.solution();
    }
}
/*
8 10
0 1
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