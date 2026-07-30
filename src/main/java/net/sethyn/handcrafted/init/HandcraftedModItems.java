/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sethyn.handcrafted.init;

import net.sethyn.handcrafted.item.*;
import net.sethyn.handcrafted.HandcraftedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class HandcraftedModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HandcraftedMod.MODID);
	public static final DeferredItem<Item> COPPER_COG = REGISTRY.register("copper_cog", CopperCogItem::new);
	public static final DeferredItem<Item> COPPER_WIRE = REGISTRY.register("copper_wire", CopperWireItem::new);
	public static final DeferredItem<Item> COPPER_MESH = REGISTRY.register("copper_mesh", CopperMeshItem::new);
	public static final DeferredItem<Item> COPPER_ROD = REGISTRY.register("copper_rod", CopperRodItem::new);
	public static final DeferredItem<Item> COPPER_SCREW = REGISTRY.register("copper_screw", CopperScrewItem::new);
	public static final DeferredItem<Item> COPPER_SHEET = REGISTRY.register("copper_sheet", CopperSheetItem::new);
	public static final DeferredItem<Item> COPPER_TUBE = REGISTRY.register("copper_tube", CopperTubeItem::new);
	public static final DeferredItem<Item> COPPER_SPRING = REGISTRY.register("copper_spring", CopperSpringItem::new);
	public static final DeferredItem<Item> IRON_COG = REGISTRY.register("iron_cog", IronCogItem::new);
	public static final DeferredItem<Item> IRON_SPRING = REGISTRY.register("iron_spring", IronSpringItem::new);
	public static final DeferredItem<Item> IRON_MESH = REGISTRY.register("iron_mesh", IronMeshItem::new);
	public static final DeferredItem<Item> IRON_ROD = REGISTRY.register("iron_rod", IronRodItem::new);
	public static final DeferredItem<Item> IRON_SCREW = REGISTRY.register("iron_screw", IronScrewItem::new);
	public static final DeferredItem<Item> IRON_SHEET = REGISTRY.register("iron_sheet", IronSheetItem::new);
	public static final DeferredItem<Item> IRON_TUBE = REGISTRY.register("iron_tube", IronTubeItem::new);
	public static final DeferredItem<Item> IRON_WIRE = REGISTRY.register("iron_wire", IronWireItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}