package com.fmaldonado.sandbox.projects.motionLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fmaldonado.sandbox.databinding.ActivityMotionlayoutBinding
import com.fmaldonado.sandbox.projects.BaseActivity

class MotionLayout : BaseActivity() {

    private lateinit var binding: ActivityMotionlayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotionlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}