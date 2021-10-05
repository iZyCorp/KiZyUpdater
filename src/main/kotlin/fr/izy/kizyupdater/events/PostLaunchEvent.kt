package fr.izy.kizyupdater.events

interface PostLaunchEvent : Cancellable {

   fun onPostLaunch()

}