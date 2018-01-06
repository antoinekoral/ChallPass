package challenge.challpass;

import android.graphics.Color;
import android.net.Network;
import android.speech.tts.TextToSpeech;
import android.support.constraint.solver.Cache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ru);
    }

    public void bipAuthorise(View view) {

        RelativeLayout monLayout = (RelativeLayout) findViewById(R.id.gestionRU);
        monLayout.setBackgroundColor(Color.GREEN);

        final TextView text = (TextView) findViewById(R.id.textViewRU);
        String prenom = "Prenom";
        String nom = "Nom";
        text.setText(prenom +" "+ nom);


    }

    public void bipNonAuthorise(View view) {

        RelativeLayout monLayout = (RelativeLayout) findViewById(R.id.gestionRU);
        monLayout.setBackgroundColor(Color.RED);

        Button button = (Button) findViewById(R.id.button2);
        button.setVisibility(View.VISIBLE);

    }

    public void forcerPassage(View view) {

        Button button = (Button) findViewById(R.id.button2);
        button.setVisibility(View.INVISIBLE);

        bipAuthorise(view);

    }
}
