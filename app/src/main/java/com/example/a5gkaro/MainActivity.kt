package com.example.a5gkaro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    fun openPhoneInfoScreen() {
        try {
            val intent = Intent(Intent.ACTION_MAIN).apply {
                setClassName("com.android.phone", "com.android.phone.settings.RadioInfo")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intent)
        } catch (e: Exception) {
            Log.d("Failed", "Failed with: ${intent.component}")
            Log.d("Failed", e.toString())

        }
        finish()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openPhoneInfoScreen()

    }

}
