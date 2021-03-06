package com.lq.animationdemo.transition.scene

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.transition.Fade
import android.transition.TransitionManager
import android.view.View
import com.lq.animationdemo.R
import kotlinx.android.synthetic.main.activity_scene_explode.*

/**
 *作者：Created by liuqian on 2019/2/18 10:59
 *描述：淡入淡出
 */
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class FadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene_explode)
        initView()
    }

    private var isStatus: Boolean = true
    private fun initView() {
        button.setOnClickListener {
            val fade = Fade()
            fade.duration = 2000
            if (isStatus) {
                fade.mode = Fade.MODE_IN
                TransitionManager.beginDelayedTransition(cl_parent, fade)
                isStatus = false
                view.visibility = View.GONE
                view1.visibility = View.GONE
                view2.visibility = View.GONE
                view3.visibility = View.VISIBLE
                view4.visibility = View.GONE
            } else {
                fade.mode = Fade.MODE_IN
                TransitionManager.beginDelayedTransition(cl_parent, fade)
                isStatus = true
                view.visibility = View.VISIBLE
                view1.visibility = View.VISIBLE
                view2.visibility = View.VISIBLE
                view3.visibility = View.GONE
                view4.visibility = View.VISIBLE
            }
        }
    }
}