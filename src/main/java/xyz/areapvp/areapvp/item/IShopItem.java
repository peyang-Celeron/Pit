package xyz.areapvp.areapvp.item;

import org.bukkit.inventory.*;

public interface IShopItem
{
    ItemStack getItem();

    String getName();

    int getNeedPrestige();

    int getNeedGold();
}
