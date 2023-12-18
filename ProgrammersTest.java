package example.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgrammersTest {

    @Test
    void solution() {
        int n = 8;
        int a = 1;
        int b = 2;
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        // 가정: 항상 이김!
        // 결과: 몇 라운드에서 만날까?

        // 상대방 번호(x: a 상대, y: b 상대)
        // 라운드 변수: n
        int r = 1;

        boolean loop = true;
        while (loop) {
            int x = 0;
            int y = 0;

            if (r == 1) {
                if (a == 1) {
                    x = r+1;
                } else if (a == n) {
                    x = n-1;
                }

                if (b == 1) {
                    y = b+1;
                } else if (b == n) {
                    y = n-1;
                }

                // 1라운드에서 만난다면?
                if (a == y || b == x) {
                    answer = r;
                    loop = false;
                } else {
                    r++;
                }
            }
        }

        int expect = 1;
        assertEquals(expect, answer);
    }
}
