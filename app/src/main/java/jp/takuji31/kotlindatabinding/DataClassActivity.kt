package jp.takuji31.kotlindatabinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import jp.takuji31.kotlindatabinding.databinding.ActivityDataClassBinding

class DataClassActivity : AppCompatActivity() {

    var users = listOf(
            User(name = "takuji31", birthDay = "1987/03/01"),
            User(name = "takuji32", birthDay = "1987/03/02"),
            User(name = "takuji33", birthDay = "1987/03/03"),
            User(name = "takuji24884", birthDay = null)
    )

    val binding: ActivityDataClassBinding by lazy {
        DataBindingUtil.setContentView<ActivityDataClassBinding>(this, R.layout.activity_data_class)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.user = users.last()
        binding.randomButtonClickListener = View.OnClickListener {
            binding.user = users[0]
            users = users.drop(1) + binding.user
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.randomButtonClickListener = null
    }
}
