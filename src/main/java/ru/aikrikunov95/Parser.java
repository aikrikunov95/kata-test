package ru.aikrikunov95;

public class Parser {

    public Result run(String input) {
        String[] tokens = input.split(" ");
        if (tokens.length > 3)
            throw new RuntimeException();

        RomanConverter romanConverter = new RomanConverter();
        int firstNumber;
        int secondNumber;
        boolean romanMode = false;
        try {
            firstNumber = Integer.parseInt(tokens[0]);
            secondNumber = Integer.parseInt(tokens[2]);
        } catch (Exception arabicException) {
            try {
                romanMode = true;
                firstNumber = romanConverter.toInt(tokens[0]);
                secondNumber = romanConverter.toInt(tokens[2]);
            } catch (Exception romanException) {
                throw new RuntimeException();
            }
        }
        Operation operation = Operation.parse(tokens[1]);
        return new Result(firstNumber, secondNumber, operation, romanMode);
    }

    public record Result(
            int firstNumber,
            int secondNumber,
            Operation operation,
            boolean romanMode
    ) {
    }
}
