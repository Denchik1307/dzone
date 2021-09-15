package tms.homeworkfour

import kotlin.jvm.JvmStatic
import tms.homeworkfour.CheckPalindromString
import tms.homeworkfour.RomeToArabNumber
import java.util.Locale
import java.lang.StringBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val text = CheckPalindromString("")
        println(text.palindromBuilder("D321 1 2 3d"))

        //System.out.println(RomeToArabNumber("XMD"));
        val numberArab = RomeToArabNumber()
        println(numberArab.romeToArabNumber("xiv"))
    }
}