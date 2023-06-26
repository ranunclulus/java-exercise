package week11.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class AdjacentList {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer: 입력받은 문자열을 띄어 쓰기 또는 지정된 delimiter를 기준으로 나누어서 한 단어씩 반환해 주는 도구
        StringTokenizer graphTokenizer // 8 10 입력
                = new StringTokenizer(reader.readLine());
        // StringTokenizer.nextToken(): 다음 단어를 가져오기
        int maxNode = Integer.parseInt(graphTokenizer.nextToken());
        int edges = Integer.parseInt(graphTokenizer.nextToken());
        // 안쪽의 List<Integer> 가 maxNode의 길이를 반드시 가지지는 않을 것이다.
        List<List<Integer>> adjList = new ArrayList<>();

        // 먼저 List의 내용물을 초기화해 줌
        for (int i = 0; i < maxNode; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeTokenizer
                    = new StringTokenizer(reader.readLine());
            int startNode = Integer.parseInt(edgeTokenizer.nextToken()); // i 입력
            int endNode = Integer.parseInt(edgeTokenizer.nextToken()); // j 입력
            // adjList 의 startNode 번째 리스트에 endNode를 첨부한다.
            // 유향 그래프일 경우
            adjList.get(startNode).add(endNode);
            // 무향 그래프일 경우
            adjList.get(endNode).add(startNode);
        }
        // 선택 사항: DFS/BFS 를 할 때 이왕이면 방문 순서를 작은 숫자부터 방문하도록 지키고 싶다면
        // 정렬해야 한다
        for (List<Integer> adjRow: adjList) {
            Collections.sort(adjRow);
        }

        for (List<Integer> adjRow: adjList
             ) {
            System.out.println(adjRow);
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