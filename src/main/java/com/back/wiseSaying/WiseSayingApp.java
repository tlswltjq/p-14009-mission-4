package com.back.wiseSaying;

import java.util.Scanner;

public class WiseSayingApp {
    private Scanner scanner;
    private final WiseSayingController controller;

    public WiseSayingApp(Scanner scanner) {
        this.scanner = scanner;
        this.controller = new WiseSayingController(scanner);
    }

    public void start() {
        while (true) {
            String cmd;
            cmd = scanner.nextLine().trim();
            controller.executeCommand(cmd);
        }
    }
}
