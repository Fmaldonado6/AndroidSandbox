package com.fmaldonado.sandbox.projects.nativeDialog

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.app.AlertDialog
import android.content.Context
import android.net.wifi.WifiManager
import com.fmaldonado.sandbox.R
import com.fmaldonado.sandbox.databinding.ActivityNativeDialogBinding

class NativeDialog : Activity() {

    private lateinit var binding: ActivityNativeDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNativeDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.showDialog.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("Native dialog")
                setMessage("This dialog will look different depending on your device theme")
                setPositiveButton("Accept") { _, _ -> }
                show()
            }
        }
    }
}