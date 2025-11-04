package dev.sshear.bagelsandlox;

import dev.sshear.bagelsandlox.item.BagelsAndLoxItems;

public final class BagelsAndLox {
    public static final String MOD_ID = "bagelsandlox";

    public static void init() {
        System.out.println("Bagels and Lox mod initializing...");
        BagelsAndLoxItems.registerItems();
    }
}
