package andy.zhu.android.eleganceinterpolator.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;

/**
 * Created by Andy.Zhu on 2017/4/26.
 */

public class InterpolatorView extends View {

    private Interpolator mInterpolator;

    private Path mPath;
    private Paint mPaint;

    public InterpolatorView(Context context) {
        this(context, null);
    }

    public InterpolatorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPath = new Path();
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(context.getResources().getDisplayMetrics().density * 3);
        mPaint.setColor(Color.CYAN);
    }

    public void setInterpolator(Interpolator interpolator) {
        mInterpolator = interpolator;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int yStart = height - (height - width) / 2;
        int checkPointCount = 100;

        mPath.reset();
        mPath.moveTo(0, yStart);
        for (int i = 0; i < checkPointCount; i++) {
            float progress = 1f * i / checkPointCount;
            mPath.lineTo(progress * width, yStart - mInterpolator.getInterpolation(progress) * width);
        }
        mPath.lineTo(width, (height - width) / 2);

        canvas.drawPath(mPath, mPaint);
    }
}
