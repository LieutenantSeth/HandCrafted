/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sethyn.handcrafted.init;

import net.sethyn.handcrafted.item.CopperWireItem;
import net.sethyn.handcrafted.item.CopperScrewItem;
import net.sethyn.handcrafted.item.CopperRodItem;
import net.sethyn.handcrafted.item.CopperMeshItem;
import net.sethyn.handcrafted.item.CopperCogItem;
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
	// Start of user code block custom items
	// End of user code block custom items
}