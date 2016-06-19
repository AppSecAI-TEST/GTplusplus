package miscutil.core.block.general.fluids;

import static miscutil.core.block.ModBlocks.blockFluidJackDaniels;
import static miscutil.core.block.ModBlocks.fluidJackDaniels;
import miscutil.core.lib.CORE;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class FluidRegistryHandler {
	
	//Fluids
		/**
		 * 
		 * Luminosity .setLuminosity(luminosity)
	 		How much light does the fluid emit. Default: 0, Lava uses 15
			Density .setDensity(density)
			How dense is the fluid, the only effect is whether or not a fluid replaces another fluid when they flow into each other. Default: 1000, the density of water at 4 degrees Celsius in kg/m³
			Temperature .setTemperature(temp)
			How hot, or cold is the fluid. Has currently no effect. Default: 295, the "normal" room temperature in degrees Kelvin, this is approximately 72°F or 22°C.
			Viscosity .setViscosity(viscosity)
			How thick the fluid is. Determines how fast it flows. Default: 1000 for water, lava uses 6000
			Is Gaseous .setGaseous(boolean)
			Indicates if the fluid is gaseous. Used for rendering. Default: false
		 * 
		 */

	public static void registerFluids(){
		run();
	}
	
	private static void run(){
		fluidJackDaniels();
	}
	
	private static void fluidJackDaniels(){
		//testFluid
				fluidJackDaniels.setLuminosity(12);
				fluidJackDaniels.setDensity(1200);
				fluidJackDaniels.setTemperature(420);
				fluidJackDaniels.setViscosity(750);
				fluidJackDaniels.setGaseous(true);
				FluidRegistry.registerFluid(fluidJackDaniels);
				blockFluidJackDaniels = new BlockFluidJackDaniels(fluidJackDaniels, Material.water).setBlockName("fluidJackDaniels");
				GameRegistry.registerBlock(blockFluidJackDaniels, CORE.MODID + "_" + blockFluidJackDaniels.getUnlocalizedName().substring(5));
				fluidJackDaniels.setUnlocalizedName(blockFluidJackDaniels.getUnlocalizedName());
	}
	
}