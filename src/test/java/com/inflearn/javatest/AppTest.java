package com.inflearn.javatest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("스터디 만들기 \ud83D\uDE31")
    void create() {
        App app = new App();
        System.out.println("create Test");
        assertThat(app).isNotNull();
    }

    @BeforeAll
    static void beforeAll() {
        //해당 annotation 이 달린 메서드가 현재 클래스의 모든 테스트 메서드보다 먼저 실행된다.
        //해당 메서드는 static 이어야 한다.
        System.out.println("before all");
    }

    @BeforeEach
    void beforeEach() {
        //해당 annotation 이 달린 메서드가 각 테스트 메서드 전에 실행된다.
        System.out.println("Before each");
    }

    @AfterAll
    static void afterAll() {
        //해당 annotation 이 달린 메서드가 현재 클래스의 모든 테스트 메소드보다 이후에 실행된다.
        //해당 annotation 이 달린 메서드가 각 테스트 메서드 이후에 실행된다.
        System.out.println("after all");
    }

    @AfterEach
    void afterEach() {
        //해당 annotation 이 달린 메서드가 각 테스트 메서드 이후에 실행된다.
        System.out.println("After each");
    }
}