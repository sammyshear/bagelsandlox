package dev.sshear.bagelsandlox.neoforge;

import net.neoforged.fml.common.Mod;

import dev.sshear.bagelsandlox.BagelsAndLox;

@Mod(BagelsAndLox.MOD_ID)
public final class BagelsAndLoxNeoForge {
    public BagelsAndLoxNeoForge() {
        // Run our common setup.
        BagelsAndLox.init();
    }
}
