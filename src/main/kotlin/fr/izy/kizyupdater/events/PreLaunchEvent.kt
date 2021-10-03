package fr.izy.kizyupdater.events

@Cancellable interface PreLaunchEvent {

    fun onPreLaunch()
}