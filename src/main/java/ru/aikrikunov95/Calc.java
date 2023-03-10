package ru.aikrikunov95;

public class Calc {
    public String run(String input) {
        Parser parser = new Parser();
        Parser.Result parseResult = parser.run(input);
        int firstNumber = parseResult.firstNumber();
        int secondNumber = parseResult.secondNumber();

        if (firstNumber > 10 || secondNumber > 10)
            throw new RuntimeException();

        int calcResult = switch (parseResult.operation()) {
            case PLUS ->  firstNumber + secondNumber;
            case MINUS -> firstNumber - secondNumber;
            case STAR ->  firstNumber * secondNumber;
            case SLASH -> firstNumber / secondNumber;
        };

        if (calcResult < 0 && parseResult.romanMode())
            throw new RuntimeException();

        if (parseResult.romanMode()) {
            RomanConverter romanConverter = new RomanConverter();
            return romanConverter.toRoman(calcResult);
        } else {
            return String.valueOf(calcResult);
        }
    }
}
