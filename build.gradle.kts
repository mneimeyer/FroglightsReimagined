import gg.meza.stonecraft.mod

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

// MattsModpack01 is the live AMP-managed server this mod targets. Never
// overwrites or deletes the live, active jar in its mods folder - always
// lands as a *.jar.disabled sibling that a human has to rename/enable
// manually. Only wired up for the neoforge target, since that's the loader
// MattsModpack01 runs.
if (mod.isNeoforge) {
    val serverModsDir = file("/mnt/amp/MattsModpack01/Minecraft/mods")

    tasks.register<Copy>("deployToServer") {
        dependsOn(tasks.named("remapJar"))
        from(tasks.named("remapJar"))
        into(serverModsDir)
        rename { "$it.disabled" }
    }

    tasks.named("build") {
        finalizedBy("deployToServer")
    }
}
