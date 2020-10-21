package com.example.dotunlockdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //用数组保存9个圆点的对象  用于滑动过程中遍历
    //对象创建的顺序：构造方法->init代码块、属性的创建->onCreate(setContentView(R.layout.activity_main)
    //private val dots= arrayOf(dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8,dot9)   直接这样会报错（空指针异常） 因为加载顺序中init代码块和属性创建是谁在前面谁先加载，这里把属性放在前面，还没有初始化，所以找不到这个，所以会报错
    //下面是解决这种问题的两种方法
    //private var dots:Array<ImageView>?=null   //创建为可选值（可为空）避免了空指针异常
    //懒加载
    private val dots:Array<ImageView>by lazy {
        arrayOf(dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8,dot9)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //dots= arrayOf(dot1,dot2,dot3,dot4,dot5,dot6,dot7,dot8,dot9)
        Log.v("wxw","${dots.size}")
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN->{

            }
            MotionEvent.ACTION_MOVE->{

            }
            MotionEvent.ACTION_UP->{

            }

        }
    }
}