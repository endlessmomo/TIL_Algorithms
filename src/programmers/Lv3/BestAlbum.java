package programmers.Lv3;

import java.util.*;

class Music {
    String genre;
    int play;
    int idx;

    public Music(String genre, int play, int idx) {
        this.genre = genre;
        this.play = play;
        this.idx = idx;
    }

    public String getGenre() {
        return genre;
    }

    public int getPlay() {
        return play;
    }

    public int getIdx() {
        return idx;
    }
}

public class BestAlbum {
    // 속한 노래가 많이 재생된 장르에 대하여 먼저 수록
    // 장르 내에 가장 많이 재생된 노래를 먼저 수록
    // 장르 내에서 재생 횟수가 같은 경우 고유번호가 낮은 순서로 먼저 수록한다.

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(solution(genres, plays)));
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map <String,Integer> order = new HashMap <>();
        List <Integer> res = new ArrayList <>();

        // 1차적으로 장르별 수록 순서를 정한다

        for (int i = 0; i < genres.length; i++) {
            order.put(genres[i], order.getOrDefault(genres[i], 0) + plays[i]);
        }

        List <Map.Entry <String,Integer>> entryList = new ArrayList <>(order.entrySet());
        entryList.sort(new Comparator <Map.Entry <String,Integer>>() {
            @Override
            public int compare(Map.Entry <String,Integer> o1, Map.Entry <String,Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List <String> genres_Order = new ArrayList <>();
        for (Map.Entry <String,Integer> entry : entryList) {
            genres_Order.add(entry.getKey());
        }

        // 2차적으로 장르내 가장 많이 재생된 곡 순서대로 앨범에 삽입
        // 동일 플레이 횟수인 경우 인덱스가 낮은 번호가 먼저 수록
        List <Music> musicList = new ArrayList <>();
        for (int i = 0; i < genres.length; i++) {
            musicList.add(new Music(genres[i], plays[i], i));
        }

        Collections.sort(musicList, (o1, o2) -> o2.play - o1.play);


        musicList.forEach(i -> System.out.println(i.getPlay() + " " + i.getIdx() + " " + i.getGenre()));

        for (String genre : genres_Order) {
            int count = 0;
            for (int i = 0; i < musicList.size(); i++) {
                if(count == 2){
                    break;
                }
                if (musicList.get(i).getGenre().equals(genre)) {
                    res.add(musicList.get(i).getIdx());
                    count++;
                }
            }
        }

        return res.stream().mapToInt(e->e).toArray();
     }
}