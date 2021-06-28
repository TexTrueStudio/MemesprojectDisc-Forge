
package net.texstudio.memesprojectdiscforge.item;

import net.texstudio.memesprojectdiscforge.itemgroup.GenshinImpactOSTItemGroup;
import net.texstudio.memesprojectdiscforge.MemesprojectdiscforgeModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@MemesprojectdiscforgeModElements.ModElement.Tag
public class ChatteringSnowflakesItem extends MemesprojectdiscforgeModElements.ModElement {
	@ObjectHolder("memesprojectdiscforge:chattering_snowflakes")
	public static final Item block = null;
	public ChatteringSnowflakesItem(MemesprojectdiscforgeModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectdiscforgeModElements.sounds.get(new ResourceLocation("memesprojectdiscforge:chattering_snowflakes")),
					new Item.Properties().group(GenshinImpactOSTItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("chattering_snowflakes");
		}
	}
}
