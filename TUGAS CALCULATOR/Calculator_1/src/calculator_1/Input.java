/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator_1;

import java.util.Stack;

/**
 *
 * @author AURA
 */
public class Input {
    Operan operator1 = new Operan();
    private Stack<Character> operatorStack;
    private Stack<Double> IsiStack;
    private boolean error;   

    public Input(){
    operatorStack = new Stack<Character>();
    IsiStack = new Stack<Double>();
    error = false;
    }
    
    private boolean adalahOperator(char ch){
       return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }
    
    private int urutanHitung (char ch){
        if (ch=='+' || ch=='-'){
            return 2;
        }
        if (ch=='*' || ch=='/' || ch=='%'){
            return 1;
        }
        return 0;
    }
    
    private void ProsesHitung(char t) {
        double a, b;
        if (IsiStack.empty()) {
            System.out.println("ERROR");
            error = true;
            return;
        } else {
            operator1.b = IsiStack.peek();
            IsiStack.pop();
        }
        if (IsiStack.empty()) {
            System.out.println("error tidak ada isi.");
            error = true;
            return;
        } else {
            operator1.a = IsiStack.peek();
            IsiStack.pop();
        }
        double r=0;
        if (t == '+') {
            r = operator1.tambah();
        } else if (t == '-') {
            r = operator1.kurang();
        } else if (t == '*') {
            r = operator1.multiple();
        } else if(t == '/') {
            r = operator1.divide();
        } else if(t == '%') {
            r = operator1.modulus();
        } else {
            System.out.println("Operator error.");
            error = true;
        }
        IsiStack.push(r);
    }
    
    public void ProsesInput(String input) {
        String[] tokens = input.split(" ");
        for (String nextToken : tokens) {
            char ch = nextToken.charAt(0);
            if (ch >= '0') {
                double Isi = Double.parseDouble(nextToken);
                IsiStack.push(Isi);
            } else if (adalahOperator(ch)) {
                if (operatorStack.empty() || urutanHitung(ch) > urutanHitung(operatorStack.peek())) {
                    operatorStack.push(ch);
                } else {
                    while (!operatorStack.empty() && urutanHitung(ch) <= urutanHitung(operatorStack.peek())) {
                        char toProcess = operatorStack.peek();
                        operatorStack.pop();
                        ProsesHitung(toProcess);
                    }
                    operatorStack.push(ch);
                }
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.empty() && adalahOperator(operatorStack.peek())) {
                    char toProcess = operatorStack.peek();
                    operatorStack.pop();
                    ProsesHitung(toProcess);
                }
                if (!operatorStack.empty() && operatorStack.peek() == '(') {
                    operatorStack.pop();
                } else {
                    System.out.println("Error: Kurung ada yang Kurang");
                    error = true;
                }
            }
        }
        
        while (!operatorStack.empty() && adalahOperator(operatorStack.peek())) {
            char toProcess = operatorStack.peek();
            operatorStack.pop();
            ProsesHitung(toProcess);
        }
        
        if (error == false) {
            double result = IsiStack.peek();
            IsiStack.pop();
            if (!operatorStack.empty() || !IsiStack.empty()) {
                System.out.println("Error : ada operan yang tidak tertulis atau operan yang salah.");
            } else {
                System.out.println("The result is " + result);
            }
        }
    }
}
