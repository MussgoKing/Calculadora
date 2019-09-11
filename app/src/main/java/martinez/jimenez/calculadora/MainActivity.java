package martinez.jimenez.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNum1, editTextNum2;
    Button botonSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.etNum1);
        editTextNum2 = findViewById(R.id.etNum2);
        botonSumar = findViewById(R.id.btnSumar);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etNum1 = editTextNum1.getText().toString();
                String etNum2 = editTextNum2.getText().toString();

                if (etNum1.isEmpty() || etNum2.isEmpty()){
                    mensaje("Debes ingresar dos cantidades");
                }else{
                    int Num1 = Integer.parseInt(etNum1);
                    int Num2 = Integer.parseInt(etNum2);
                    int sum = Num1+Num2;
                    mensaje("El resultado es: " + sum);
                }
            }
        });


    }
    public void mensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}

