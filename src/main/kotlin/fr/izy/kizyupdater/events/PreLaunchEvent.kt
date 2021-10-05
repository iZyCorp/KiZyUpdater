package fr.izy.kizyupdater.events

interface PreLaunchEvent : Cancellable {

    fun onPreLaunch()
}