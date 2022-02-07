package com.example.iqtest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class Draw2D(context: Context?) : View(context) {
    private val mPaint = Paint()
    private val superColor = Paint()
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val width: Float

        val centerX: Float

        width = getWidth().toFloat()

        centerX = width / 2


        // стиль Заливка
        mPaint.style = Paint.Style.FILL
        superColor.style = Paint.Style.FILL
        superColor.color=Color.WHITE

        // закрашиваем холст белым цветом
        mPaint.color = Color.WHITE
        canvas.drawPaint(mPaint)

        // Рисуем круги
        mPaint.isAntiAlias = true
        mPaint.color = Color.rgb(50,50,50)
        canvas.drawCircle(centerX-250F, 300F+100F, 95F, mPaint)

        mPaint.isAntiAlias = true
        mPaint.color = Color.rgb(50,50,50)
        canvas.drawCircle(centerX, 300F+100F, 95F, mPaint)

        mPaint.isAntiAlias = true
        mPaint.color = Color.rgb(50,50,50)
        canvas.drawCircle(centerX+250F, 300F+100F, 95F, mPaint)

        // рисуем прямоугольники
        val myRect1 = Rect(205, 550, 375, 720)
        val myRect2 = Rect(205+250, 550, 375+250, 720)
        val myRect3 = Rect(205+500, 550, 375+500, 720)

        val superRect = Rect(50,180,1010,1100)

        val greenPaint = Paint()
        greenPaint.color = Color.rgb(50,50,50)
        greenPaint.style = Paint.Style.FILL
        canvas.drawRect(myRect1, greenPaint)
        canvas.drawRect(myRect2, greenPaint)
        canvas.drawRect(myRect3, greenPaint)

        //canvas.drawRect(superRect, superColor)

        mPaint.setStrokeWidth(10F);
        //рисуем треугольники
        canvas.drawLine(centerX, 800F-20F, centerX+80F, 950F-20F, mPaint)
        canvas.drawLine(centerX+80F, 950F-20F, centerX-80F, 950F-20F, mPaint)
        canvas.drawLine(centerX-80F, 950F-20F, centerX, 800F-20F, mPaint)

        canvas.drawLine(centerX-250F, 800F-20F, centerX+80F-250F, 950F-20F, mPaint)
        canvas.drawLine(centerX+80F-250F, 950F-20F, centerX-80F-250F, 950F-20F, mPaint)
        canvas.drawLine(centerX-80F-250F, 950F-20F, centerX-250F, 800F-20F, mPaint)

        //canvas.drawLine(centerX+250F, 800F-20F, centerX+80F+250F, 950F-20F, mPaint)
        //canvas.drawLine(centerX+80F+250F, 950F-20F, centerX-80F+250F, 950F-20F, mPaint)
        //canvas.drawLine(centerX-80F+250F, 950F-20F, centerX+250F, 800F-20F, mPaint)

        mPaint.setTextSize(90.0f);
        canvas.drawText("?", centerX+230F, 895F, mPaint)

        val random11= (1..5).random()
        val random21= (1..3).random()

        if (random11==1) {


            //findViewById<Button>(R.id.button1).setOnClickListener {
            //    startActivity(intent1)
            //}
            //findViewById<Button>(R.id.button2).setOnClickListener {
            //    startActivity(intent1)
            //}
            //findViewById<Button>(R.id.button3).setOnClickListener {
            //    startActivity(intent1)
            //}
        }
        else if (random11==2) {



        }
        else if (random11==3) {



        }
        else if (random11==4) {



        }
        else if (random11==5) {



        }

        // Рисуем текст
        //mPaint.color = Color.BLUE
        //mPaint.style = Paint.Style.FILL
        //mPaint.isAntiAlias = true
        //mPaint.textSize = 100f

        // Подсчитаем размер текста
        //mPaint.getTextBounds(text, 0, text.length, mTextBoundRect)
        //textWidth = textBounds.width();
        // Используем measureText для измерения ширины
        //textWidth = mPaint.measureText(text)
        //textHeight = mTextBoundRect.height().toFloat()
        //canvas.drawText(
        //    text,
        //    centerX - textWidth / 2f,
        //    centerY + textHeight / 2f,
        //    mPaint
        //)
    }
}