package com.back.wiseSaying;

import java.util.Scanner;

public class WiseSayingApp {
    private Scanner scanner;
    private final WiseSayingController controller = new WiseSayingController(scanner);

    public WiseSayingApp(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("명령) ");
            String cmd;
            cmd = scanner.nextLine().trim();
            controller.executeCommand(cmd);
        }
    }
}
