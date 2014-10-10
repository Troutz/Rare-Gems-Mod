package RGM.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager{
 
    public static void mainRegistry(){
        initializeItem();
        registerItem();
    }
 
    public static Item grenade;
 
    public static void initializeItem() {
        grenade = new ItemGrenade().setUnlocalizedName("Grenade").setCreativeTab(CreativeTabs.tabCombat).setTextureName("cm:grenade");    }
 
    public static void registerItem(){
        GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());
    }
 
}