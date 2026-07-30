/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sethyn.handcrafted.init;

import net.sethyn.handcrafted.HandcraftedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class HandcraftedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HandcraftedMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HANDCRAFTED = REGISTRY.register("handcrafted",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.handcrafted.handcrafted")).icon(() -> new ItemStack(Blocks.DEEPSLATE_BRICKS)).displayItems((parameters, tabData) -> {
				tabData.accept(HandcraftedModItems.COPPER_COG.get());
				tabData.accept(HandcraftedModItems.COPPER_WIRE.get());
				tabData.accept(HandcraftedModItems.COPPER_MESH.get());
				tabData.accept(HandcraftedModItems.COPPER_ROD.get());
				tabData.accept(HandcraftedModItems.COPPER_SCREW.get());
				tabData.accept(HandcraftedModItems.COPPER_TUBE.get());
				tabData.accept(HandcraftedModItems.COPPER_SPRING.get());
			}).build());
}