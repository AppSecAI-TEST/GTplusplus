package gtPlusPlus.xmod.gregtech.common.blocks;

import gregtech.api.enums.Textures;
import gregtech.api.objects.GT_CopiedBlockTexture;
import gregtech.api.util.GT_LanguageManager;
import gregtech.common.blocks.GT_Material_Casings;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.blocks.textures.CasingTextureHandler;
import gtPlusPlus.xmod.gregtech.common.blocks.textures.CasingTextureHandler2;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GregtechMetaCasingBlocks2
extends GregtechMetaCasingBlocksAbstract {

	public final static int GTID = 73;
	
	CasingTextureHandler2 TextureHandler = new CasingTextureHandler2();	

	public GregtechMetaCasingBlocks2() {
		super(GregtechMetaCasingItems.class, "gtplusplus.blockcasings.2", GT_Material_Casings.INSTANCE);
		for (byte i = 0; i < 16; i = (byte) (i + 1)) {
			Textures.BlockIcons.CASING_BLOCKS[GTID + i] = new GT_CopiedBlockTexture(this, 6, i);
		}
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".0.name", "Strctural Glass Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".1.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".2.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".3.name", "Placeholder Casing"); //60
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".4.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".5.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".6.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".7.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".8.name", "Placeholder Casing"); //65
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".9.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".10.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".11.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".12.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".13.name", "Placeholder Casing");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".14.name", "Placeholder Casing ");
		GT_LanguageManager.addStringLocalization(getUnlocalizedName() + ".15.name", "Placeholder Casing ");
		GregtechItemList.Casing_StructuralGlass.set(new ItemStack(this, 1, 0));
		GregtechItemList.Casing_PlaceHolder1.set(new ItemStack(this, 1, 1));
		GregtechItemList.Casing_PlaceHolder2.set(new ItemStack(this, 1, 2));
		GregtechItemList.Casing_PlaceHolder3.set(new ItemStack(this, 1, 3));
		GregtechItemList.Casing_PlaceHolder4.set(new ItemStack(this, 1, 4));
		GregtechItemList.Casing_PlaceHolder5.set(new ItemStack(this, 1, 5));
		GregtechItemList.Casing_PlaceHolder6.set(new ItemStack(this, 1, 6));
		GregtechItemList.Casing_PlaceHolder7.set(new ItemStack(this, 1, 7));
		GregtechItemList.Casing_PlaceHolder8.set(new ItemStack(this, 1, 8));
		GregtechItemList.Casing_PlaceHolder9.set(new ItemStack(this, 1, 9));
		GregtechItemList.Casing_PlaceHolder10.set(new ItemStack(this, 1, 10));
		GregtechItemList.Casing_PlaceHolder11.set(new ItemStack(this, 1, 11));
		GregtechItemList.Casing_PlaceHolder12.set(new ItemStack(this, 1, 12));
		GregtechItemList.Casing_PlaceHolder13.set(new ItemStack(this, 1, 13));
		GregtechItemList.Casing_PlaceHolder14.set(new ItemStack(this, 1, 14));
		GregtechItemList.Casing_PlaceHolder15.set(new ItemStack(this, 1, 15));		
	}

	@Override
	public IIcon getIcon(int aSide, int aMeta) { //Texture ID's. case 0 == ID[57]
		return TextureHandler.getIcon(aSide, aMeta);
	}
}