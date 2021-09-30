package fr.izy.kizyupdater

import fr.izy.kizyupdater.launch.LaunchProcess
import fr.izy.kizyupdater.versions.Version
import java.nio.file.Path

class KUpdater {

    fun update(gameFolder: Path, version: Version) {
        this.checkFiles(gameFolder);
        this.updateMinecraft(gameFolder)
    }

    private fun checkFiles(folder: Path) {

    }

    private fun updateMinecraft(folder: Path) {

    }

    fun launch() {
        val launchProcess: LaunchProcess = LaunchProcess("mainclass", "classpath");
        /*
        ...
         */
        launchProcess.launch()
    }
}