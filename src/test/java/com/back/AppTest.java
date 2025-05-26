package com.back;


import com.back.standard.util.TestUtil;
import com.back.wiseSaying.WiseSayingApp;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTest {
    public static String run(String input) {
        Scanner scanner = TestUtil.genScanner(input);

        ByteArrayOutputStream capturedOutput = TestUtil.setOutToByteArray();

        WiseSayingApp wiseSayingApp = new WiseSayingApp(scanner, "./src/test/resources");
        wiseSayingApp.start();

        String outputString = capturedOutput.toString();

        TestUtil.clearSetOutToByteArray(capturedOutput);

        return outputString;
    }
    public static void clear() {
    }
}