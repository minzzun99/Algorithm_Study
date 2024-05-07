package ch8_hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Problem22 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, ArrayList<int[]>> genreMap = new HashMap<>();
        HashMap<String, Integer> playMap = new HashMap<>();

        // 장르 별 고유번호와 재생 수를 저장하는 genreMap
        // 장르 별 재생 수의 합을 저장하는 playMap
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }
            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.get(genre) + play);
        }

        ArrayList<Integer> answer = new ArrayList<>();

        //장르 별 재생 수의 합을 스트림을 사용해서 내림차순 정렬
        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet()
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue()));

        //내림차순 정렬한 sortedGenre를 통해서 genreMap에 저장되어있는 재생수와 고유번호를
        //재생수를 기준으로 내림차순 정렬하고 2개씩 끊어서 answer에 저장
        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                    .sorted((o1, o2) -> Integer.compare(o2[1], o1[1]))
                    .limit(2);
            sortedSongs.forEach(song -> answer.add(song[0]));
        });

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
