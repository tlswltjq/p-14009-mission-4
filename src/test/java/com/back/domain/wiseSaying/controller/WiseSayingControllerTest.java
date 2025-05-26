//package com.back.domain.wiseSaying.controller;
//
//import com.back.AppTest;
//import com.back.global.app.AppConfig;
//import org.junit.jupiter.api.*;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class WiseSayingControllerTest {
//    @BeforeEach
//    void beforeEach() {
//        AppTest.clear();
//    }
//
//    @Test
//    @DisplayName("등록")
//    void t3() {
//        final String out = AppTest.run("""
//                등록
//                현재를 사랑하라.
//                작자미상
//                """);
//
//        assertThat(out)
//                .contains("명언 :")
//                .contains("작가 :")
//                .contains("1번 명언이 등록되었습니다.");
//    }
//
//    // ...
//}