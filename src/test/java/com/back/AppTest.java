package com.back;


import com.back.standard.util.TestUtil;
import com.back.wiseSaying.WiseSayingApp;

import java.util.Scanner;

public class AppTest {

    public static String run(String input) {
        Scanner scanner = TestUtil.genScanner(input.stripIndent().trim());
        new WiseSayingApp(scanner).start();
        String string = scanner.nextLine();

        return string;
    }

    public static void clear() {
    }
}