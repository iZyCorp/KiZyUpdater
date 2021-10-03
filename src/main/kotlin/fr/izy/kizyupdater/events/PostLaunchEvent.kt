package fr.izy.kizyupdater.events

@Cancellable interface PostLaunchEvent {

   fun onPostLaunch()
}