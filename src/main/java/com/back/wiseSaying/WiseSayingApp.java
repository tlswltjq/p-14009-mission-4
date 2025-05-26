package com.back.wiseSaying;

import java.util.Scanner;

public class WiseSayingApp {
    private Scanner scanner;
    private final WiseSayingController controller;
    private boolean isRunning = true;

    public WiseSayingApp(Scanner scanner) {
        this.scanner = scanner;
        this.controller = new WiseSayingController(scanner);
    }

    public void start() {
        while (isRunning) {
            String cmd;
            System.out.print("명령) ");
            cmd = scanner.nextLine().trim();
            isRunning = controller.executeCommand(cmd);
        }
    }
}
