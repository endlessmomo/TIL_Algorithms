package Programmers.Lv2;

public class SkillTree {
    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"CBADF", "AECB", "BDA"}));
    }

    public static int solution(String skill, String[] skill_trees) {
        int res = 0;

        for (String value : skill_trees) {
            String skills = value.replaceAll("[^" + skill + "]", "");

            if(skill.startsWith(skills)){
                res++;
            }
        }
        return res;
    }
}
