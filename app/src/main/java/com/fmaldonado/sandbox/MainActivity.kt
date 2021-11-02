package com.fmaldonado.sandbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fmaldonado.sandbox.databinding.ActivityMainBinding
import com.fmaldonado.sandbox.projects.motionLayout.MotionLayout
import com.fmaldonado.sandbox.projects.nativeDialog.NativeDialog
import com.fmaldonado.sandbox.projects.oldDesign.OldDesign
import com.fmaldonado.sandbox.projects.swipeToDismiss.activities.SwipeToDismiss
import com.fmaldonado.sandbox.projects.youtubeLayout.YoutubeLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val projects = mutableListOf(
        Projects("Swipe to dismiss", SwipeToDismiss::class.java),
        Projects("Motion Layout", MotionLayout::class.java),
        Projects("Youtube Layout", YoutubeLayout::class.java),
        Projects("Native Dialog", NativeDialog::class.java),
        Projects("Android old design", OldDesign::class.java)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecycler()
    }

    private fun setUpRecycler() {
        binding.projectsList.adapter = ProjectsAdapter(projects)
    }
}