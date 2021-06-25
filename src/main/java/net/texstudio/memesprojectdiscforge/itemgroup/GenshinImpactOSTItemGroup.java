
package net.texstudio.memesprojectdiscforge.itemgroup;

import net.texstudio.memesprojectdiscforge.item.RoughStarItem;
import net.texstudio.memesprojectdiscforge.MemesprojectdiscforgeModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@MemesprojectdiscforgeModElements.ModElement.Tag
public class GenshinImpactOSTItemGroup extends MemesprojectdiscforgeModElements.ModElement {
	public GenshinImpactOSTItemGroup(MemesprojectdiscforgeModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgenshin_impact_ost") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RoughStarItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
