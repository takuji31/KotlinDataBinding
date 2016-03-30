package jp.takuji31.kotlindatabinding

import android.databinding.BindingAdapter
import android.widget.TextView
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter

object Adapters {
    @JvmStatic
    @BindingAdapter("android:text")
    fun convertZonedDateTimeToString(textView: TextView, zonedDateTime: ZonedDateTime) {
        val timeString = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:ss"))
        textView.text = timeString
    }
}