package cosw.eci.edu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

import cosw.eci.edu.calculator.model.CalculatorLogic;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private TextView stackTv;
    private String currentText;
    private Stack<String> stack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currentText = "";
        Stack<String> stack=new Stack<>();
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init(){

        tv = (TextView) findViewById(R.id.textView);
        stackTv = (TextView) findViewById(R.id.stack);
    }


    protected void setText(String text){
        currentText=text;
        tv.setText(currentText);

    }

    protected void onClickNumber(View v){
        Button pressed = (Button) v;

        setText(currentText + pressed.getText().toString());

    }

    protected void onClickOperator(View v){
        Button pressed = (Button) v;

        setText(currentText + pressed.getText().toString());
    }

    protected void onClickCleanTextView(View v){

        setText("");
    }

    protected void onClickEquals(View v){

            //setText(CalculatorLogic.calculate(logicalText)+"");

    }
    protected void onClickAddToStack(View v){

    }

    protected void onClickPoint(View v){

    }
}
