package com.getir.patika.foodcouriers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    private var userId: String? = "sdsdasds"
    //kullanıcı ilk defa uygulamaya giriyorsa buraya yönlendir

    private var isFirstTime: Boolean? = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        CoroutineScope(Dispatchers.Main).launch {
            delay(SPLASH_TIME)
            //burada kontrol ediyoruz
            if (isFirstTime == true)
                startActivity(AccountActivity.callIntent(this@SplashActivity))
            else {
                 userId?.let {
                    startActivity(MainActivity.callIntent(this@SplashActivity))
                } ?: run {
                    startActivity(OnboardingActivity.callIntent(this@SplashActivity))
                }
            }

        }
    }


    companion object {
        private const val SPLASH_TIME = 4000L
    }


}