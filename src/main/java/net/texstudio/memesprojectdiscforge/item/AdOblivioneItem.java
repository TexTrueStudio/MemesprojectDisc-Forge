
package net.texstudio.memesprojectdiscforge.item;

import net.texstudio.memesprojectdiscforge.itemgroup.GenshinImpactOSTItemGroup;
import net.texstudio.memesprojectdiscforge.MemesprojectdiscforgeModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@MemesprojectdiscforgeModElements.ModElement.Tag
public class AdOblivioneItem extends MemesprojectdiscforgeModElements.ModElement {
	@ObjectHolder("memesprojectdiscforge:ad_oblivione")
	public static final Item block = null;
	public AdOblivioneItem(MemesprojectdiscforgeModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectdiscforgeModElements.sounds.get(new ResourceLocation("memesprojectdiscforge:ad_oblivione")),
					new Item.Properties().group(GenshinImpactOSTItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ad_oblivione");
		}
	}
}
