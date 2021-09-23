package fr.izy.kizyupdater.files

import java.nio.file.Path
import java.nio.file.Paths


fun createGameDir(serverName: String): Path {
    val os: String = System.getProperty("os.name").lowercase()
    return if(os.contains("win")) Paths.get(System.getenv("APPDATA"), ".${serverName}")
    else if(os.contains("mac")) Paths.get(System.getProperty("user.home"), "Library", "Application Support", serverName)
    else Paths.get(System.getProperty("user.home"), ".local", "share", serverName)
}