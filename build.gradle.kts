import gg.meza.stonecraft.mod
import java.util.Properties

plugins {
    id("gg.meza.stonecraft")
}

modSettings {
    clientOptions {
        fov = 90
        guiScale = 3
        narrator = false
        darkBackground = true
        musicVolume = 0.0
    }
}

repositories {
    mavenCentral()
}

dependencies {
    if (mod.isFabric) {
        modImplementation("net.fabricmc.fabric-api:fabric-api:${mod.prop("fabric_version")}")
    }
}

sourceSets {
    main {
        resources {
            srcDir("src/main/resources")
        }
    }
}

tasks.processResources {
    doLast {
        val versionDataDir = file("src/main/resources/data")
        if (versionDataDir.exists() && versionDataDir.isDirectory) {
            copy {
                from(versionDataDir)
                into(layout.buildDirectory.dir("resources/main/data"))
            }
        }
    }
}

// Optional, per-contributor convenience: if local.properties (gitignored,
// never committed) sets neoforgeDeployModsDir, every build copies the jar
// there as a *.jar.disabled sibling - never overwrites or deletes whatever
// jar is already active, a human has to rename it to enable. Absent that
// property (the default for any fresh checkout), this does nothing.
if (mod.isNeoforge) {
    val localPropertiesFile = rootProject.file("local.properties")
    val localProperties = Properties()
    if (localPropertiesFile.exists()) {
        localPropertiesFile.inputStream().use { stream -> localProperties.load(stream) }
    }
    val deployModsDir = localProperties.getProperty("neoforgeDeployModsDir")

    if (deployModsDir != null) {
        tasks.register<Copy>("deployToServer") {
            dependsOn(tasks.named("remapJar"))
            from(tasks.named("remapJar"))
            into(file(deployModsDir))
            rename { "$it.disabled" }
        }

        tasks.named("build") {
            finalizedBy("deployToServer")
        }
    }
}
