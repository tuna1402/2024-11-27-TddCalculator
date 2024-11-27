package com.ll;

public class PolynomialCalculator {
    // 기본 연산 메서드
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
        return num1 / num2;
    }

    // 괄호 안의 수식 추출
    public String extractInnerExpression(String expression) {
        int open = expression.indexOf("(");
        int close = expression.indexOf(")");
        if (open != -1 && close != -1) {
            return expression.substring(open + 1, close).trim();
        }
        return expression.trim();
    }

    // 간단한 수식 계산
    public int simpleExpression(String expression) {
        String[] parts = expression.split(" ");
        if (parts.length != 3) throw new IllegalArgumentException("Invalid expression: " + expression);

        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[2]);
        String operator = parts[1];

        return switch (operator) {
            case "+" -> sum(operand1, operand2);
            case "-" -> sub(operand1, operand2);
            case "*" -> mul(operand1, operand2);
            case "/" -> div(operand1, operand2);
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }

    // 복합 수식 계산
    public int complexExpression(String expression) {
        // 1. 괄호 안의 수식 계산
        String innerExpression = extractInnerExpression(expression);
        int innerResult = simpleExpression(innerExpression);

        // 2. 계산 결과를 원래 수식에 반영
        String remainingExpression = expression.replace("(" + innerExpression + ")", String.valueOf(innerResult)).trim();

        // 3. 남은 수식 계산
        return simpleExpression(remainingExpression);
    }
    // ((3 + 5) * 5 + -10) * 10

}
