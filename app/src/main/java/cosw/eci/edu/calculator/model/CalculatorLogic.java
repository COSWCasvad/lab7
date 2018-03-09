package cosw.eci.edu.calculator.model;

import java.util.Stack;

/**
 * Created by 2105534 on 3/8/18.
 */

public class CalculatorLogic {

    public static double calculate(String text) throws Exception {
        String[] lst = text.split("jump");
        for (int i = 0; i < lst.length; i++) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!! "+lst[i]);
        }
        Stack<String> tks = new Stack<>();
        tks.push("3");
        tks.push("4");
        tks.push("+");
        System.out.println("Resolviendo ando"+ calculate(tks));
        return 0.0;
    }


    private static double calculate(Stack<String> tks) throws Exception {
        String tk = tks.pop();
        double x,y;
        try {x = Double.parseDouble(tk);}
        catch (Exception e) {
            y = calculate(tks);  x = calculate(tks);
            if      (tk.equals("+"))  x += y;
            else if (tk.equals("-"))  x -= y;
            else if (tk.equals("*"))  x *= y;
            else if (tk.equals("/"))  x /= y;
            else throw new Exception();
        }
        return x;
    }
}
