
package net.mcreator.wildflowers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class UnfiredPotItem extends Item {
	public UnfiredPotItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
