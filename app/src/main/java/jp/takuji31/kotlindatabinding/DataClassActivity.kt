package jp.takuji31.kotlindatabinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.takuji31.kotlindatabinding.databinding.ActivityDataClassBinding

class DataClassActivity : AppCompatActivity() {

    data class User(val name: String, val birthDay: String?)

    val users = listOf(
            User(name = "takuji31", birthDay = "1987/03/01"),
            User(name = "takuji32", birthDay = "1987/03/02"),
            User(name = "takuji33", birthDay = "1987/03/03"),
            User(name = "takuji24884", birthDay = "1987/03/04")
    )

    val binding: ActivityDataClassBinding by lazy {
        DataBindingUtil.setContentView<ActivityDataClassBinding>(this, R.layout.activity_data_class)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.user = users[0]
    }
}
