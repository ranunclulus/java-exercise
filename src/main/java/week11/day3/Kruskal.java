package week11.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Kruskal {
    int[] parent;
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Node, Edge Tokenizer
        StringTokenizer neTokenizer = new StringTokenizer(reader.readLine());
        int nodeCount = Integer.parseInt(neTokenizer.nextToken());
        int edgeCount = Integer.parseInt(neTokenizer.nextToken());

        // Kruskal Algorithm은 서로소 집합의 개념을 이용해 서로 다른 두 정점을
        // 연결했을 때 사이클이 발생하는지 검사한다
        // 배열로 표현한 트리를 만들자
        parent = new int[nodeCount];

        // 각각의 원소들이 자신을 대표자로 하는 집합으로 만들어 줌
        for (int i = 0; i < nodeCount; i++) {
            parent[i] = i;
        }

        // 간선 정보 해독
        int[][] edges = new int[edgeCount][3];
        for (int i = 0; i < edgeCount; i++) {
            StringTokenizer edgeTokenizer = new StringTokenizer(reader.readLine());
            edges[i][0] = Integer.parseInt(edgeTokenizer.nextToken());
            edges[i][1] = Integer.parseInt(edgeTokenizer.nextToken());
            edges[i][2] = Integer.parseInt(edgeTokenizer.nextToken());
        }

        // 1. 간선들을 가중치 기준으로 정렬
        Arrays.sort(edges, Comparator.comparingInt(edge -> edge[2]));

        // 2. 간선들을 가중치 순서대로 순회하면서 고른다
        int picked = 0; // 선택한 간선 수
        int totalWeight = 0;
        List<String> pickedEdges = new ArrayList<>();
        for (int i = 0; i < edgeCount; i++) { // 최대로 많이 순회해 봤자 간선의 수만큼
            int start = edges[i][0];
            int end = edges[i][1];

            // * 사이클이 존재하는지 확인
            if(findSet(start) != findSet(end)) {
                // 두 원소를 하나의 집합으로
                union(start, end);
                // 간선을 골랐음을 표시
                picked++;
                totalWeight += edges[i][2];
                pickedEdges.add(Arrays.toString(edges[i]));
            }
            // 3. 고른 간선의 개수가 n-1 개가 될 때까지
            if (picked == nodeCount - 1) break;
        }
        System.out.println("totalWeight = " + totalWeight);
        System.out.println("pickedEdges = " + pickedEdges);
    }

    // union: x, y가 주어졌을 때 둘을 합하는 연산
    public void union(int start, int end) {
        parent[findSet(end)] = findSet(start);
    }

    // findSet: 내 부모가 나일 때까지 재귀 호출
    public int findSet(int node) {
        if (parent[node] != node)
            return findSet(parent[node]);
        else return node;
    }

    public static void main(String[] args) throws IOException {
        new Kruskal().solution();
    }
}

/*
8 11
0 1 41
0 2 14
0 3 13
1 4 27
2 5 21
3 5 33
3 7 22
4 6 11
4 7 17
5 6 35
6 7 19
*/