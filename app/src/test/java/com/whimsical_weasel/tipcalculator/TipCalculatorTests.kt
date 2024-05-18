package com.whimsical_weasel.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 100.00f
        val tipPercent = 20.00f
        val expectedTip = NumberFormat.getCurrencyInstance().format(20)
        val actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}