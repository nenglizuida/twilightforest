package twilightforest.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

public class ItemTFSteeleafHoe extends HoeItem {

	public ItemTFSteeleafHoe(IItemTier material, Properties props) {
		super(material, (int) material.getAttackDamage() + 1, material.getEfficiency(), props);
	}
}
