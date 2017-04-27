package andy.zhu.android.eleganceinterpolator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import andy.zhu.android.eleganceinterpolator.AccDecInterpolator;

public class MainActivity extends AppCompatActivity {

    private InterpolatorView mInterpolatorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInterpolatorView = (InterpolatorView) findViewById(R.id.interpolator_view);
        mInterpolatorView.setInterpolator(new AccDecInterpolator());
    }
}
