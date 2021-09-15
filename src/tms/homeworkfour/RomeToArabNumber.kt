package tms.homeworkfour

import kotlin.jvm.JvmStatic
import tms.homeworkfour.CheckPalindromString
import tms.homeworkfour.RomeToArabNumber
import java.util.Locale
import java.lang.StringBuilder

class RomeToArabNumber {
    private var `val` = 0
    private var val_next = 0
    private var temp = 0
    private var result = 0
    fun romeToArabNumber(roman: String): Int {
        var roman = roman
        roman = roman.uppercase(Locale.getDefault())
        var i = 0
        while (i < roman.length) {
            `val` = converter(roman[i])
            val_next = if (i < roman.length - 1) {
                converter(roman[i + 1])
            } else 0
            if (val_next == 0 || `val` == val_next || `val` > val_next) {
                temp = `val`
            } else {
                temp = val_next - `val`
                i++
            }
            result += temp
            i++
        }
        return result
    }

    private fun converter(`val`: Char): Int {
        var a = 0
        when (`val`) {
            'M' -> a = 1000
            'D' -> a = 500
            'C' -> a = 100
            'L' -> a = 50
            'X' -> a = 10
            'V' -> a = 5
            'I' -> a = 1
            else -> {
            }
        }
        return a
    }
}