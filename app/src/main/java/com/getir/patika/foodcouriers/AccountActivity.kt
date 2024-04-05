package com.getir.patika.foodcouriers

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity


class AccountActivity: AppCompatActivity(R.layout.activity_account){



    companion object{
        fun callIntent(context: Context): Intent {
            return Intent(context, AccountActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
        }
    }
}