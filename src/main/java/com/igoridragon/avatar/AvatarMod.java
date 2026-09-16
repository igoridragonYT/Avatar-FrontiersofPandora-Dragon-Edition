package com.igoridragon.avatar;

import com.igoridragon.avatar.entity.ModEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AvatarMod.MOD_ID)
public class AvatarMod {

    public static final String MOD_ID = "avatar";

    public AvatarMod() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.ENTITY_TYPES.register(modEventBus);

        System.out.println("Avatar: Frontiers of Pandora - Dragon Edition loaded!");
    }
}