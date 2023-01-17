package week1;

import week1.src.Sol2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6 ,10, 2};
        Sol2 sol = new Sol2();
        System.out.println(sol.solution(arr));
        System.out.println(sol.solution(arr).equals("6210"));
    }
}
