package com.inflearn.javatest;

import com.inflearn.javatest.annotations.FastTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by sskim on 2021/03/24
 * Github : http://github.com/sskim91
 */
public class JunitTag {

    /**
     * 왜 사용?
     * 예를들어 로컬에서 돌릴 때 시간이 얼마 안걸리는 테스트는 실행해도 괜찮지만
     * 시간이 엄청 걸리는 테스트는 부담이된다.
     * 이럴 때 구분하기 위해서 사용
     * 그리고 개발에서의 테스트와 Production 에서의 테스트를 태그를 통해 구분해서 사용이 가능하다.
     */

    @Test
    @FastTest
    @DisplayName("FAST 태그 테스트")
    void fastTest() {
        System.out.println("JunitTag.fastTest");
    }

    @Test
    @DisplayName("SLOW 태그 테스트")
    void slowTest() {
        System.out.println("JunitTag.slowTest");
    }

}
