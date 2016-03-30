package jp.takuji31.kotlindatabinding

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen

/**
 * Created by takuji on 2016/03/30.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
    }
}