package lk.ac.kln.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void Calculate(View view)
   {
       EditText userweight = findViewById(R.id.userweight);
       EditText userHeight = findViewById(R.id.userheight);
       TextView result = findViewById(R.id.userBMI);

           String uweight = userweight.getText().toString();
           double weight = Double.parseDouble(uweight);

            double height = Double.parseDouble(userHeight.getText().toString());
            double userBMI = CalculateBMI(weight,height);
   }
   private double CalculateBMI (double weight,double height){
        return weight/ Math.pow(height,2);

   }
}
