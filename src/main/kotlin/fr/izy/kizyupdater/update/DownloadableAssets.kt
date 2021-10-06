package fr.izy.kizyupdater.update

data class DownloadableAssets(val hash: String, val size: Long) {

    private val assetsPath: String = "/" + this.hash.substring(0, 2) + "/" + this.hash
    val url: String = "https://resources.download.minecraft.net$assetsPath"
    val file: String = "objects$assetsPath"

}
