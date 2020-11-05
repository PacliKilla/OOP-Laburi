package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    private Stack<Character> symbolStack;

    public void balance (String inputText) {
        symbolStack = new Stack<Character>();
        for (int index = 0; index < inputText.length(); index++) {
            char currentSymbol = inputText.charAt(index);
            switch (currentSymbol) {
                case '(':

                    symbolStack.push(currentSymbol);
                    break;
                case ')':
                    if (!symbolStack.isEmpty()) {
                        char symbolStackTop = symbolStack.pop();
                        if (currentSymbol == ')' && symbolStackTop != '(')
                                 {
                            System.out.println("Unmatched closing bracket "  );
                            return;
                        }
                    } else {
                        System.out.println("Extra closing bracket ");
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!symbolStack.isEmpty())
            System.out.println("Insufficient closing brackets ");
        else
            System.out.println("Brackets are balanced");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Marin\\IdeaProjects\\Lab4\\three_expressions.txt"));
        String input = null;
        StringBuilder sb = new StringBuilder();
        while ((input = in.readLine()) != null) {
            sb.append(input);
        }
        new Main().balance(sb.toString());
    }
}