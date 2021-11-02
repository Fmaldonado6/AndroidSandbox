package com.fmaldonado.sandbox.projects.oldDesign

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import com.fmaldonado.sandbox.R
import com.fmaldonado.sandbox.databinding.ActivityOldDesignBinding

class OldDesign : Activity() {

    private lateinit var binding: ActivityOldDesignBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOldDesignBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.showDialogButton.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("Holo Dialog")
                setMessage("This is a dialog with Android's old design Holo!")
                setPositiveButton("Close") { _, _ -> }
                show()
            }
        }

    }
}