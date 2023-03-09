package week1;

import week1.sort.src.가장_큰_수;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6 ,10, 2};
        가장_큰_수 sol = new 가장_큰_수();
        System.out.println(sol.solution(arr));
        System.out.println(sol.solution(arr).equals("6210"));
    }
}
