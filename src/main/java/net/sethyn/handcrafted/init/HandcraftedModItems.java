/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sethyn.handcrafted.init;

import net.sethyn.handcrafted.item.CopperWireItem;
import net.sethyn.handcrafted.item.CopperTubeItem;
import net.sethyn.handcrafted.item.CopperSpringItem;
import net.sethyn.handcrafted.item.CopperSheetItem;
import net.sethyn.handcrafted.item.CopperCogItem;
import net.sethyn.handcrafted.HandcraftedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class HandcraftedModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HandcraftedMod.MODID);
	public static final DeferredItem<Item> COPPER_COG = REGISTRY.register("copper_cog", CopperCogItem::new);
	public static final DeferredItem<Item> COPPER_WIRE = REGISTRY.register("copper_wire", CopperWireItem::new);
	public static final DeferredItem<Item> COPPER_TUBE = REGISTRY.register("copper_tube", CopperTubeItem::new);
	public static final DeferredItem<Item> COPPER_SPRING = REGISTRY.register("copper_spring", CopperSpringItem::new);
	public static final DeferredItem<Item> COPPER_SHEET = REGISTRY.register("copper_sheet", CopperSheetItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}