package fr.izy.kizyupdater.files

object GameFolder {

    lateinit var pathName: String
    lateinit var assets: String
    lateinit var libs: String
    lateinit var natives: String
    lateinit var client: String

    fun build(pathName: String, assets:String = "assets", libs:String = "libs", natives:String = "natives", client:String = "client.jar") {
        this.pathName = pathName
        this.assets = assets
        this.libs = libs
        this.natives = natives
    }
}
