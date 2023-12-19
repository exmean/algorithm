package example.personal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgrammersTest {

    @Test
    @DisplayName("프로그래머스 > 2017 팁스타운 > 예상 대진표")
    void solution() {

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
}
