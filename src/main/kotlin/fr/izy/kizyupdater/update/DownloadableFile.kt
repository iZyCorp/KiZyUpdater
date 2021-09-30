package fr.izy.kizyupdater.update

data class DownloadableFile(val url: String, val size: Long, val sha1: String, val name: String)