package Programmers.Lv2;

import java.util.*;

public class FileNameSort {
    public static void main(String[] args) {
        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
        System.out.println(Arrays.toString(solution(files)));
    }

    public static String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String[] ele1 = partition(o1.toLowerCase());
            String[] ele2 = partition(o2.toLowerCase());

           int headSort = ele1[0].compareTo(ele2[0]);

           if(headSort == 0){
               int numberSort = Integer.valueOf(ele1[1]) - (Integer.valueOf(ele2[1]));

               if(numberSort == 0){
                   return 0;
               }
               return numberSort;
           }
           return headSort;
        });

        return files;
    }


    public static String[] partition(String str) {
        int idx = 0;
        String[] partitions = new String[]{"","",""};

        for (; idx < str.length(); ) {
            if (Character.isDigit(str.charAt(idx))) {
                break;
            }
            partitions[0] += str.charAt(idx++);
        }

        for (; idx < str.length(); ) {
            if(partitions[1].length() >= 5 || !Character.isDigit(str.charAt(idx)))
                break;

            partitions[1] += str.charAt(idx++);
        }

        partitions[2] = str.substring(idx);

        return partitions;
    }
}
