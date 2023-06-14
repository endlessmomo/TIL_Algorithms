//package Programmers.Lv2;
//
//
//import java.util.*;
//
//class Task {
//    String name;
//    int time;
//    int playtime;
//
//    public Task(String name, int time, int playtime) {
//        this.name = name;
//        this.time = time;
//        this.playtime = playtime;
//    }
//
//    public void run(int runtime) {
//        this.playtime -= runtime;
//    }
//
//    @Override
//    public String toString() {
//        return "Task{" +
//                "name='" + name + '\'' +
//                ", time=" + time +
//                ", playtime=" + playtime +
//                '}';
//    }
//}
//
//public class homework {
//    public static void main(String[] args) {
//        String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
//
//        System.out.println(Arrays.toString(solution(plans)));
//    }
//
//    public static String[] solution(String[][] plans) {
//        List<Task> tasks = new ArrayList<>();
//        Stack<Task> fast = new Stack<>();
//        List<String> res = new ArrayList<>();
//
//        for (String[] plan : plans) {
//            String[] time = plan[1].split(":");
//            tasks.add(new Task(plan[0], Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]), Integer.parseInt(plan[2])));
//        }
//
//        tasks.sort((a, b) -> a.time - b.time);
//
//        if (fast.isEmpty()) {
//            fast.add(tasks)
//        }
//
//        fast.stream().map(i -> i.name).forEach(res::add);
//
//        return res.toArray(String[]::new);
//    }
//}
