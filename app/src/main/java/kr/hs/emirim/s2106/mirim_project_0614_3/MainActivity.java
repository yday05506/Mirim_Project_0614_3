package kr.hs.emirim.s2106.mirim_project_0614_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper vFlip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vFlip = findViewById(R.id.vflip);
        Button btnPrev = findViewById(R.id.btn_start);
        Button btnNext = findViewById(R.id.btn_stop);

        btnPrev.setOnClickListener(btnListener);
        btnNext.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_start:
                    vFlip.startFlipping();
                    vFlip.setFlipInterval(2);
                    break;
                case R.id.btn_stop:
                    vFlip.stopFlipping();
                    break;
            }
        }
    };
}