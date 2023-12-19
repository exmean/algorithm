package example.personal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammersTest {

    @Test
    @DisplayName("프로그래머스 > 2017 팁스타운 > 예상 대진표")
    void solution1() {

        int n = 256, a = 4, b = 6, answer = 0;

        // 가정: 항상 이김!
        // 결과: 몇 라운드에서 만날까?

        boolean loop = true;
        while (loop) {
            // 라운드 시작!
            answer++;

            // 번호가 2의 배수 일 때 상대방 번호를 확인한다.
            if ((a % 2 == 0 && b == (a - 1)) || (b % 2 == 0 && a == (b - 1))) {
                loop = false;
            }

            // 다음 라운드로 넘어갈 시 새로운 번호를 부여받는다.
            a = (a % 2) == 0 ? (a / 2) : (a / 2) + 1;
            b = (b % 2) == 0 ? (b / 2) : (b / 2) + 1;
        }

        int expect = 3;
        assertEquals(expect, answer);
    }

    @Test
    @DisplayName("프로그래머스 > Summer/Winter Coding(~2018) > 소수 만들기")
    void solution2() {
        int[] nums = new int[]{1, 2, 7, 4, 6};
        int answer = 0;

        for (int i = 0; i <= (nums.length - 3); i++) {
            for (int x = (i + 1); x <= (nums.length - 2); x++) {
                for (int y = (x + 1); y <= (nums.length - 1); y++) {
                    // 배열 인덱스를 통해 숫자의 합을 구한다.
                    int calc = nums[i] + nums[x] + nums[y];

                    // 소수 알고리즘으로 소수 여부를 확인하고, 소수가 아닐시 isPrime 값을 false로 재정의한다.
                    boolean isPrime = true;
                    for (int z = 3; z < calc; z++) {
                        if (calc % z == 0) isPrime = false;
                    }

                    if (isPrime) answer++;
                }
            }
        }

        int expect = 4;
        assertEquals(expect, answer);
    }
}
