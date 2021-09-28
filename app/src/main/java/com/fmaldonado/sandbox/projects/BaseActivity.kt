package com.fmaldonado.sandbox.projects

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.fmaldonado.sandbox.ParcelableKeys
import com.fmaldonado.sandbox.Projects

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val project = intent?.extras?.getParcelable<Projects>(ParcelableKeys.ProjectName.name)

        project?.let {
            supportActionBar?.title = it.projectName
        }
    }

}