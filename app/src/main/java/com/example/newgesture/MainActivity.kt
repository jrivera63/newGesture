package com.example.newgesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    var gDetector: GestureDetectorCompat? = null

    lateinit var getGestureText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)
        getGestureText = findViewById(R.id.getGestureText)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent): Boolean {
        getGestureText.text = "onDown"
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        getGestureText.text = "onShowPress"
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        getGestureText.text = "onSingleTapUp"
        return true
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        getGestureText.text = "onScroll"
        return true
    }

    override fun onLongPress(e: MotionEvent) {
        getGestureText.text = "onLongPress"
    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        getGestureText.text = "onFLing"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        getGestureText.text = "onSingleTapConfirmed"
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        getGestureText.text = "onDoubleTap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        getGestureText.text = "onDoubleTapEvent"
        return true
    }
}