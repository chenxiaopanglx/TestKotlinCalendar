package com.example.chy.mykotlin.bean

/**
 * Author: chy
 * Date: 2018/11/8 下午10:04
 * Description:
 */

data class CalendarDayBean(val reason: String, val result: CalendarResultBean, val error_code: Int)

data class CalendarResultBean(val data: CalentarDataBean)

data class CalentarDataBean(
        val data: String,
        val weekday: String,
        val animalsYear: String,
        val suit: String,
        val avoid: String,
        val yearMonth: String,
        val holiday: String,
        val lunar: String,
        val lunarYear: String,
        val desc: String
)