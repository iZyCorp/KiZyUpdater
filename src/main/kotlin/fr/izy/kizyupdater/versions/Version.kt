package fr.izy.kizyupdater.versions

abstract class Version {

    abstract fun getVanilla() : Vanilla

    fun getForge() = null

    fun getFabric() = null

    fun getMCP() = null
}

