package ru.aikrikunov95;

public enum Operation {
    PLUS, MINUS, STAR, SLASH;

    public static Operation parse(String s) {
        return switch (s) {
            case "+" -> PLUS;
            case "-" -> MINUS;
            case "*" -> STAR;
            case "/" -> SLASH;
            default -> throw new RuntimeException();
        };
    }
}
