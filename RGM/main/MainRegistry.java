package RGM.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "RGM", name = "Rare Gems Mod", version = "0.01")


public class MainRegistry {

	@SidedProxy(clientSide = "RGM.Main.ClientProxy", serverSide = "RGM.main.ServerProxy")
		
	public static ClientProxy proxy;	
	
	
		/**
	    * Loads before
	    * @param PreEvent
	    */
	    @EventHandler
	    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		
		ServerProxy.registerRenderThings();{
			
		}
	    }
	 
	    /**
	    * Loads during
	    * @param Event
	    */
	    @EventHandler
	    public static void Load(FMLInitializationEvent Event) {    
	 
	    }   
	 
	    /**
	    * Loads after
	    * @param PostEvent
	    */
	    @EventHandler
	    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
	 
	    }
	 
	
	
}
