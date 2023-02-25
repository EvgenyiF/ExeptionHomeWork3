package View;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsoleView implements View {

    private final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    @Override
    public void printOutput(String message) {
        System.out.printf("%s", message);
    }

    @Override
    public String getInput(String message) {
        System.out.printf("%s", message);
        return in.nextLine();
    }

}