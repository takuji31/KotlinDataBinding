package jp.takuji31.kotlindatabinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.takuji31.kotlindatabinding.databinding.ActivityNowBinding
import org.threeten.bp.ZonedDateTime

class NowActivity : AppCompatActivity() {

    val binding : ActivityNowBinding by lazy {
        DataBindingUtil.setContentView<ActivityNowBinding>(this, R.layout.activity_now)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.now = ZonedDateTime.now()
    }
}
