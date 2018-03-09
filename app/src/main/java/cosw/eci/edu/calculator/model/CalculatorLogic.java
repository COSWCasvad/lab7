package cosw.eci.edu.calculator.model;

import java.util.Stack;

/**
 * Created by 2105534 on 3/8/18.
 */

public class CalculatorLogic {

    public double calculate(Stack<String> tks) throws Exception {
        return calculateInternal(tks);
    }


    private double calculateInternal(Stack<String> tks) throws Exception {
        String tk = tks.pop();
        double x, y;
        try {
            x = Double.parseDouble(tk);
        } catch (Exception e) {
            y = calculateInternal(tks);
            x = calculateInternal(tks);
            if (tk.equals("+")) x += y;
            else if (tk.equals("-")) x -= y;
            else if (tk.equals("*")) x *= y;
            else if (tk.equals("/")) x /= y;
            else throw new Exception();
        }
        return x;
    }

    public Boolean isNumberOrOperator(String toEval) {
        Boolean ans = true;
        try {
            Double x = Double.parseDouble(toEval);
        } catch (Exception e) {
            ans = (toEval.equals("+") || toEval.equals("-") || toEval.equals("*") || toEval.equals("/"));
        }
        return ans;
    }

    public String tryChangeNumber(String num) throws Exception {
        String ans = num;
        Double x = Double.parseDouble(num);
        if (x>0) ans="-"+ans;
        else if (x<0) ans=ans.substring(1);
        return ans;
    }
}
