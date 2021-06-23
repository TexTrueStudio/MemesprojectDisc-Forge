
package net.texstudio.memesprojectdiscforge.itemgroup;

import net.texstudio.memesprojectdiscforge.item.SuonaItem;
import net.texstudio.memesprojectdiscforge.MemesprojectdiscforgeModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MemesprojectdiscforgeModElements.ModElement.Tag
public class SuonaDiscItemGroup extends MemesprojectdiscforgeModElements.ModElement {
	public SuonaDiscItemGroup(MemesprojectdiscforgeModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsuona_disc") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SuonaItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
