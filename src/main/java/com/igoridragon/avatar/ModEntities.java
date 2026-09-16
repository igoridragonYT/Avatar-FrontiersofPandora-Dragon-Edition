package com.igoridragon.avatar.entity;

import com.igoridragon.avatar.AvatarMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AvatarMod.MOD_ID);

    public static final RegistryObject<EntityType<IkranEntity>> IKRAN =
            ENTITY_TYPES.register("ikran",
                    () -> EntityType.Builder.of(IkranEntity::new, MobCategory.CREATURE)
                            .sized(2.5F, 1.5F)
                            .build("ikran"));
}