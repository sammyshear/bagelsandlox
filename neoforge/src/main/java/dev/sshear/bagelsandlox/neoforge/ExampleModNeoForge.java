package dev.sshear.bagelsandlox.neoforge;

import net.neoforged.fml.common.Mod;

import dev.sshear.bagelsandlox.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
