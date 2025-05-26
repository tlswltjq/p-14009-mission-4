package com.back.domain.wiseSaying.controller;

import com.back.AppTest;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingControllerTest {
    @BeforeEach
    void beforeEach() {
        AppTest.clear();
    }

    @Test
    @DisplayName("등록")
    void t3() {
        final String out = AppTest.run("""
                등록
                현재를 사랑하라.
                작자미상
                """);

        assertThat(out)
                .contains("명언 :")
                .contains("작가 :")
                .contains("1번 명언이 등록되었습니다.");
    }

    @Test
    @DisplayName("목록")
    void t4() {
    }

    @Test
    @DisplayName("삭제")
    void t5() {
    }

    @Test
    @DisplayName("수정")
    void t6() {
    }

    @Test
    @DisplayName("빌드")
    void t7() {
    }

    @Test
    @DisplayName("종료")
    void t8() {
    }
}