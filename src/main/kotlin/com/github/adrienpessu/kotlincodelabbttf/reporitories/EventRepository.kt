package com.github.adrienpessu.kotlincodelabbttf.reporitories

import com.github.adrienpessu.kotlincodelabbttf.models.Event
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : CrudRepository<Event, String> {
    override fun findAll(): List<Event>
}