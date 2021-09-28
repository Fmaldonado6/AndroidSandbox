package com.fmaldonado.sandbox.projects.youtubeLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fmaldonado.sandbox.databinding.ActivityYoutubeLayoutBinding
import com.fmaldonado.sandbox.projects.BaseActivity

class YoutubeLayout : BaseActivity() {
    private lateinit var binding:ActivityYoutubeLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}