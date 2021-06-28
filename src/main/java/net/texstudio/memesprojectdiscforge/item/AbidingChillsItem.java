
package net.texstudio.memesprojectdiscforge.item;

import net.texstudio.memesprojectdiscforge.itemgroup.GenshinImpactOSTItemGroup;
import net.texstudio.memesprojectdiscforge.MemesprojectdiscforgeModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

@MemesprojectdiscforgeModElements.ModElement.Tag
public class AbidingChillsItem extends MemesprojectdiscforgeModElements.ModElement {
	@ObjectHolder("memesprojectdiscforge:abiding_chills")
	public static final Item block = null;
	public AbidingChillsItem(MemesprojectdiscforgeModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, MemesprojectdiscforgeModElements.sounds.get(new ResourceLocation("memesprojectdiscforge:abiding_chills")),
					new Item.Properties().group(GenshinImpactOSTItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("abiding_chills");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
