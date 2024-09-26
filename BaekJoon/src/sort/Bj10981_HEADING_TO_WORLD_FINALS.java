package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj10981_HEADING_TO_WORLD_FINALS {
    private static int N, K;
    private static List<Team> teams;

    private static class Team {
        String college;
        String teamName;
        int solveCount;
        int penalty;

        Team(String college, String teamName, int solveCount, int penalty) {
            this.college = college;
            this.teamName = teamName;
            this.solveCount = solveCount;
            this.penalty = penalty;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        teams = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String college = st.nextToken();
            String team = st.nextToken();
            int solve = Integer.parseInt(st.nextToken());
            int penalty = Integer.parseInt(st.nextToken());

            teams.add(new Team(college, team, solve, penalty));
        }

        Collections.sort(teams, (o1, o2) -> {
            if (o1.solveCount == o2.solveCount) {
                return o1.penalty - o2.penalty;
            } else {
                return o2.solveCount - o1.solveCount;
            }
        });

        Set<String> selectedColleges = new HashSet<>();
        List<String> resultTeams = new ArrayList<>();

        for (Team team : teams) {
            if (!selectedColleges.contains(team.college)) {
                resultTeams.add(team.teamName);
                selectedColleges.add(team.college);
            }
            if (resultTeams.size() == K) {
                break;
            }
        }

        // 결과 출력
        for (String teamName : resultTeams) {
            sb.append(teamName).append('\n');
        }

        System.out.println(sb);
    }
}
