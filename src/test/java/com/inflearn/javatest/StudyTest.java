package com.inflearn.javatest;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기 \ud83D\uDE31")
    void create() {
        Study study = new Study();
        study.setStudyStatus(StudyStatus.DRAFT);
        study.setLimit(5);

        //assertAll로 묶기
        assertAll(
                () -> assertThat(study).isNotNull(),
                () -> assertEquals(StudyStatus.DRAFT, study.getStudyStatus(),
                        () -> "스터디를 처음 만들면 상태값이 " + StudyStatus.DRAFT + "이어야 한다."),
                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 한다.")
        );

        //Exception 테스트
        int[] array = new int[1];
        ArrayIndexOutOfBoundsException exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> array[2] = 5);
        assertEquals("Index 2 out of bounds for length 1", exception.getMessage());

        //시간체크
//        assertTimeout(Duration.ofMillis(100), () ->{
//            new Study();
//            Thread.sleep(300);
//        });
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