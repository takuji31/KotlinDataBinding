package jp.takuji31.kotlindatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.takuji31.kotlindatabinding.databinding.ActivityColoredBinding

class ColoredActivity : AppCompatActivity() {

    val binding : ActivityColoredBinding by lazy {
        DataBindingUtil.setContentView<ActivityColoredBinding>(this, R.layout.activity_colored)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.backgroundColor = "#00FF00"
    }
}
