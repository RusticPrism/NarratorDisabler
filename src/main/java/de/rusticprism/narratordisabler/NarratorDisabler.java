package de.rusticprism.narratordisabler;

import net.fabricmc.api.ClientModInitializer;

public class NarratorDisabler implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("Enabled NarratorDisabler");
    }
}
