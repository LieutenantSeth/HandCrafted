/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sethyn.handcrafted.init;

import net.sethyn.handcrafted.item.*;
import net.sethyn.handcrafted.HandcraftedMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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
	public static final DeferredItem<Item> GOLD_COG = REGISTRY.register("gold_cog", GoldCogItem::new);
	public static final DeferredItem<Item> GOLD_MESH = REGISTRY.register("gold_mesh", GoldMeshItem::new);
	public static final DeferredItem<Item> GOLD_TUBE = REGISTRY.register("gold_tube", GoldTubeItem::new);
	public static final DeferredItem<Item> GOLD_SHEET = REGISTRY.register("gold_sheet", GoldSheetItem::new);
	public static final DeferredItem<Item> GOLD_ROD = REGISTRY.register("gold_rod", GoldRodItem::new);
	public static final DeferredItem<Item> GOLD_SCREW = REGISTRY.register("gold_screw", GoldScrewItem::new);
	public static final DeferredItem<Item> GOLD_SPRING = REGISTRY.register("gold_spring", GoldSpringItem::new);
	public static final DeferredItem<Item> GOLD_WIRE = REGISTRY.register("gold_wire", GoldWireItem::new);
	public static final DeferredItem<Item> MOTOR = REGISTRY.register("motor", MotorItem::new);
	public static final DeferredItem<Item> TIE_ROD = REGISTRY.register("tie_rod", TieRodItem::new);
	public static final DeferredItem<Item> COPPER_MAGNET_ASSEMBLY = REGISTRY.register("copper_magnet_assembly", CopperMagnetAssemblyItem::new);
	public static final DeferredItem<Item> IRON_RING = REGISTRY.register("iron_ring", IronRingItem::new);
	public static final DeferredItem<Item> COAL_DUST = REGISTRY.register("coal_dust", CoalDustItem::new);
	public static final DeferredItem<Item> CARBON_FIBRE = REGISTRY.register("carbon_fibre", CarbonFibreItem::new);
	public static final DeferredItem<Item> MACHINE_BLOCK = block(HandcraftedModBlocks.MACHINE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}