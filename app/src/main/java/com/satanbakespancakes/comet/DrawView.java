package com.satanbakespancakes.comet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

import androidx.annotation.RequiresApi;

public class DrawView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Matrix matrix = new Matrix();

    public DrawView(Context context) {
        super(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100, 100, 20, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.CYAN);
        paint.setStrokeWidth(3);
        matrix.setRotate(30);
        canvas.setMatrix(matrix);
        //canvas.rotate(-162);
        canvas.drawOval(125, 50, 600, 300, paint);
        canvas.rotate(30);

    }
}
