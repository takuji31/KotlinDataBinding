package jp.takuji31.kotlindatabinding.databinding

import android.databinding.BindingConversion
import org.threeten.bp.ZonedDateTime
import org.threeten.bp.format.DateTimeFormatter

object Adapters {
    @JvmStatic
    @BindingConversion
    fun convertZonedDateTimeToString(zonedDateTime : ZonedDateTime) : CharSequence {
        return zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd/ HH:mm:SS"))
    }
}