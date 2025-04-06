package testingfile;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int n, int a, int b, int c, int[] num_list) {
        int[] answer = {};

        switch (n) {
            case 1:
                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;

            case 2:
                answer = Arrays.copyOfRange(num_list, a-1, num_list.length);
                break;

            case 3:
                answer = Arrays.copyOfRange(num_list, a-1, b);
                break;

            case 4:
                List<Integer> tempList = new ArrayList<>();
                for (int i = a-1; i <= b; i += c) {
                    tempList.add(num_list[i]);
                }

                answer = tempList.stream().mapToInt(i -> i).toArray();
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Solution sol = new Solution();

        System.out.print("1.숫자열의 0번 인덱스부터 b번 인덱스까지");
        System.out.print("\n2.숫자열의 a번 인덱스부터 마지막 인덱스까지");
        System.out.print("\n3.숫자열의 a번 인덱스부터 b번 인덱스까지");
        System.out.print("\n4.숫자열의 0번 인덱스부터 b번 인덱스까지 c의 간격으로");
        System.out.print("\n번호 입력(1, 2, 3, 4): ");
        int n = scanner.nextInt();

        System.out.print("\n숫자열의 크기 입력: ");
        int size = scanner.nextInt();

        int[] num_list = new int[size];
        System.out.print("\n숫자열의 숫자를 한개씩 입력(숫자 한개 입력+enter반복[숫자열의 크기만큼만]): ");
        for (int i = 0; i < size; i++) {
            num_list[i] = scanner.nextInt();
        }

        System.out.print("\n시작 인덱스 순서 입력(마지막 인덱스 순서 이하, 0개 이상): ");
        int a = scanner.nextInt();
        System.out.print("\n마지막 인덱스 순서 입력(전체 갯수 이하, 시작 인덱스 순서 이상): ");
        int b = scanner.nextInt();
        System.out.print("\n인덱스 간격 입력(1이상 3이하): ");
        int c = scanner.nextInt();

        int[] result = sol.solution(n, a, b, c, num_list);

        String resultString = Arrays.toString(result);
        String numListString = Arrays.toString(num_list);

        switch (n) {
            case 1:
                System.out.println(numListString + "에서 0번 인덱스부터 " + b + "번 인덱스까지 자른 리스트는 " + resultString + "입니다.");
                break;
            case 2:
                System.out.println(numListString + "에서 " + a + "번 인덱스부터 마지막 인덱스까지 자른 리스트는 " + resultString + "입니다.");
                break;
            case 3:
                System.out.println(numListString + "에서 " + a + "번 인덱스부터 " + b + "번 인덱스까지 자른 리스트는 " + resultString + "입니다.");
                break;
            case 4:
                System.out.println(numListString + "에서 " + a + "번 인덱스부터 " + b + "번 인덱스까지 " + c + "개 간격으로 자른 리스트는 " + resultString + "입니다.");
                break;
        }
    }
}
