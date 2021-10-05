package fr.izy.kizyupdater.events

interface PreUpdateEvent : Cancellable {

    fun onPreUpdate()
}