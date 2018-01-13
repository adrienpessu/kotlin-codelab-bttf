package com.github.adrienpessu.kotlincodelabbttf

import com.github.adrienpessu.kotlincodelabbttf.controllers.EventController
import com.github.adrienpessu.kotlincodelabbttf.models.Event
import org.junit.Assert.assertEquals
import org.junit.Test

class LetterTest {

    @Test
    fun `1985 should return one thousand nine hundred and eighty five`() {
        val events = arrayListOf<Event>(Event("1985", "test", "test"))
        val event = (EventController.Letter.prettier(events) as List<Event>)[0]
        assertEquals(
            event.date
            , "one thousand nine hundred and eighty five")
    }

    @Test
    fun `When there is no date, nothing should be return`() {
        val events = arrayListOf<Event>(Event("", "test", "test"))
        val size = (EventController.Letter.prettier(events) as List<Event>).size

        assertEquals(
            size
            , 0)
    }

    @Test
    fun `When it's no a four letters date, nothing should be return`() {
        val events = arrayListOf<Event>(Event("42", "test", "test"))
        val size = (EventController.Letter.prettier(events) as List<Event>).size

        assertEquals(
            size
            , 0)
    }


}