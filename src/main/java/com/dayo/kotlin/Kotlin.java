package com.dayo.kotlin;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Kotlin.MOD_ID,
        name = Kotlin.MOD_NAME,
        version = Kotlin.VERSION
)
public class Kotlin {

    public static final String MOD_ID = "kotlin";
    public static final String MOD_NAME = "Kotlin";
    public static final String VERSION = "1.0.0";
}
