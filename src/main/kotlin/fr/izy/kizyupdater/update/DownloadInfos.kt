package fr.izy.kizyupdater.update

import java.util.*
import java.util.concurrent.atomic.AtomicLong


class DownloadInfos {

    private val downloadableFiles: MutableList<DownloadableFile> = ArrayList<DownloadableFile>()
    private val totalToDownloadBytes = AtomicLong(0)
    private val downloadedBytes = AtomicLong(0)

    fun clear() {
        downloadableFiles.clear()
        totalToDownloadBytes.set(0)
        downloadedBytes.set(0)
    }
}