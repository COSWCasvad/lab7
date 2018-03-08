package cosw.eci.edu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cosw.eci.edu.calculator.model.CalculatorLogic;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private String currentText;
    private String logicalText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        currentText = "";
        logicalText="";
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init(){
        tv = (TextView) findViewById(R.id.textView);
    }


    protected void setText(String text){
        currentText=text;
        tv.setText(currentText);

    }

    protected void onClickNumber(View v){
        Button pressed = (Button) v;
        logicalText += pressed.getText().toString();
        setText(currentText + pressed.getText().toString());

    }

    protected void onClickOperator(View v){
        Button pressed = (Button) v;
        logicalText += "jump"+pressed.getText().toString()+"jump";
        setText(currentText + pressed.getText().toString());
    }

    protected void onClickCleanTextView(View v){
        logicalText = "";
        setText("");
    }

    protected void onClickEquals(View v){
        try{
            setText(CalculatorLogic.calculate(logicalText)+"");
        }catch(Exception e){
            setText("");
        }

    }
}
