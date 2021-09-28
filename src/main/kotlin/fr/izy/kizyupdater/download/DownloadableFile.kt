package fr.izy.kizyupdater.download

data class DownloadableFile(val url: String, val size: Long, val sha1: String, val name: String)