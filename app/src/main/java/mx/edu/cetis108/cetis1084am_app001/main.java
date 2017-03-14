package mx.edu.cetis108.cetis1084am_app001;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class main extends AppCompatActivity {
    Button btnSaludar;
    EditText txtNombre;
    EditText txtSaludar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar=(Button)findViewById(R.id.btnSaludar);
        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtSaludar=(EditText)findViewById(R.id.txtSaludar);



    }
    public void Aceptar (View view)
    {
        txtNombre.setText("HOLA "+txtSaludar.getText());
    }
}
