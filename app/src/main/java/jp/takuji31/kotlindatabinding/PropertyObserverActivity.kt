package jp.takuji31.kotlindatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import jp.takuji31.kotlindatabinding.databinding.ActivityPropertyObserverBinding

class PropertyObserverActivity : AppCompatActivity() {

    class Counter : BaseObservable() {
        @get:Bindable
        var count : Int = 0
            set(value) {
                field = value
                notifyPropertyChanged(BR.count)
            }
    }

    val binding : ActivityPropertyObserverBinding by lazy {
        DataBindingUtil.setContentView<ActivityPropertyObserverBinding>(this, R.layout.activity_property_observer)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val counter = Counter()
        binding.counter = counter
        binding.buttonClickListener = View.OnClickListener {
            counter.count += 1
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.buttonClickListener = null
    }

}
