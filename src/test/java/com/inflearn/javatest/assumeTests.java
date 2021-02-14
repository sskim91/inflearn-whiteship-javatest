package com.inflearn.javatest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class assumeTests {

    @Test
    @DisplayName("조건에 따라 테스트 실행하기 assume")
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_9, JRE.JAVA_10, JRE.JAVA_11})
    void assumeTest() throws Exception {

        String test_env = System.getenv("TEST_ENV");
        System.out.println("test_env = " + test_env);
        assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("assumingThat");
        });

    }

    @Test
    @DisplayName("OS와 JRE를 조건에 따라서 줄 수 있다.")
    @DisabledOnOs(OS.WINDOWS)
    @DisabledOnJre({JRE.JAVA_8})
    void assumeTest2() throws Exception {

        String test_env = System.getenv("TEST_ENV");
        System.out.println("test_env = " + test_env);
        assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("assumingThat");
        });

    }

    @Test
    @DisplayName("어떠한 환경변수를 쓸건지에 따라서 실행")
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "sskim")
    void EnabledIfEnvironmentVariableTest() throws Exception {

        String test_env = System.getenv("TEST_ENV");
        System.out.println("test_env = " + test_env);
        assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("assumingThat");
        });
    }
}
