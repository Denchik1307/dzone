package tms.homeworkfour

import kotlin.jvm.JvmStatic
import tms.homeworkfour.CheckPalindromString
import tms.homeworkfour.RomeToArabNumber
import java.util.Locale
import java.lang.StringBuilder

class CheckPalindromString(private val textToChek: String) {
    fun palindromBuilder(textToChek: String): Boolean {
        val textForCheck = textToChek.replace(" ", "").lowercase(Locale.getDefault())
        val text = StringBuilder(textForCheck)
        val reversText = text.reverse()
        return reversText.toString() == textForCheck
    }
}