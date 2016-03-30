package jp.takuji31.kotlindatabinding

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.View.OnClickListener
import android.view.ViewGroup
import jp.takuji31.kotlindatabinding.databinding.ActivityMainBinding
import jp.takuji31.kotlindatabinding.databinding.RecyclerRowMainBinding

class MainActivity : AppCompatActivity() {

    val items = listOf(
            Section(label = "Basic binding", onClickListener = OnClickListener {
                startActivity(Intent(this, DataClassActivity::class.java))
            }),
            Section(label = "Property observer", onClickListener = OnClickListener {
                startActivity(Intent(this, PropertyObserverActivity::class.java))
            }),
            Section(label = "Converter", onClickListener = OnClickListener {
                startActivity(Intent(this, DataClassActivity::class.java))

            }),
            Section(label = "Binding adapter", onClickListener = OnClickListener {
                startActivity(Intent(this, DataClassActivity::class.java))
            })
    )

    val binding : ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    data class Section(val label :String, val onClickListener: OnClickListener)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = object : Adapter<ViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
                return ViewHolder(RecyclerRowMainBinding.inflate(layoutInflater, parent, false))
            }

            override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
                holder!!.binding.section = items[position]
            }

            override fun getItemCount(): Int {
                return items.size
            }

        }
    }

    class ViewHolder(val binding: RecyclerRowMainBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}
