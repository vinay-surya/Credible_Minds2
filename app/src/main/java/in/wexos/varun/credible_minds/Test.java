package in.wexos.varun.credible_minds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.swing_up_right);
        CardView anim= (CardView) findViewById(R.id.software);
        anim.startAnimation(animation);
    }
}