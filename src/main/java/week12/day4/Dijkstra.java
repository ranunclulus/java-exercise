package week12.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Dijkstra {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer info = new StringTokenizer(reader.readLine());

        // 정점의 개수, 간선의 개수, 시작 정점
        int nodes = Integer.parseInt(info.nextToken());
        int edges = Integer.parseInt(info.nextToken());
        int start = Integer.parseInt(reader.readLine());

        // 인접 행렬: 연결되어 있을 경우 양수, 없을 경우 음수 (-1)
        int[][] adjMat = new int[nodes][nodes];
        for (int[] row: adjMat
             ) {
            Arrays.fill(row, -1);
        }

        // 인접 행렬 초기화
        for (int i = 0; i < edges; i++) {
            StringTokenizer edgeToken = new StringTokenizer(reader.readLine());
            int from = Integer.parseInt(edgeToken.nextToken());
            int to = Integer.parseInt(edgeToken.nextToken());
            int cost = Integer.parseInt(edgeToken.nextToken());

            adjMat[from][to] = cost;
        }

        // 방문 정보 visited
        boolean[] visited = new boolean[nodes];
        // 현재까지의 최소 거리 정보 dist
        int[] dist = new int[nodes];
        // 1. 모든 정점까지 아직 도달할 길이 없으므로 무한대로 초기화
        Arrays.fill(dist, Integer.MAX_VALUE);
        // 2. 시작 정점까지의 거리는 0
        dist[start] = 0;


        // 다익스트라 시작
        // 반복 기준: 아직 방문한 점이 남아 있을 때
        // -> 노드의 개수만큼 반복
        for (int i = 0; i < nodes; i++) {

            // 이번에 방문할 정점을 선택
            // -> 현재 정점들까지의 최단 경로 정보 중 가장 가까운 정점
            // 최소값 비교용 변수
            int minDist = Integer.MAX_VALUE;
            // 최소 거리 노드 index 저장용 변수
            int minDistNode = -1;
            // dist 배열을 검사해서 최단 거리 정점을 조사
            for (int j = 0; j < nodes; j++) {
                // TODO 이 for가 끝나는 시점에
                // 최단 거리가 minDist에 최단 거리 정점이 minDistNode에 기록
                if (!visited[j] && dist[j] < minDist) {
                    minDistNode = j;
                    minDist = dist[j];
                }
            }
            // 더 이상 도달 가능한 미방문 노드가 없을 떼
            if (minDistNode == -1) break;

            // 최종 선택된 노드 방문 처리
            visited[minDistNode] = true;

            for (int j = 0; j < nodes; j++) {
                // 연결되어 있지 않은 경우
                if (adjMat[minDistNode][j] == -1) continue;
                int cost = adjMat[minDistNode][j];
                // 인접 노드가 현재 가지는 최소 비용 (dist[j])
                // 현재 방문한 노드까지의 최소 비용 + 현재 노드에서 인접 노드까지 가는 최소 비용
                // 좀 더 작은 값을 dist[j] 에 업데이트
                if (dist[j] > dist[minDistNode] + cost)
                    dist[j] = dist[minDistNode] + cost;
            }
        }

        // 최종 출력
        System.out.println(Arrays.toString(dist));
    }
}
