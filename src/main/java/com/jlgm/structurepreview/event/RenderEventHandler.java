package com.jlgm.structurepreview.event;
/**
 * Class based on the work by Maruohon
 * https://github.com/maruohon/placementpreview
 */


import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderEventHandler{

	@SubscribeEvent
	public void onRenderWorldLast(RenderWorldLastEvent event){
        /*if((Minecraft.getMinecraft().thePlayer.getHeldItemMainhand() != null && Minecraft.getMinecraft().thePlayer.getHeldItemMainhand().getItem() == TESTItem.buildPreview) || TESTMain.instance.pinnedPos != null){
			Structure structure;
			//if(TESTMain.instance.structure == null){
				structure = new Structure(null, "endcity/ship", new PlacementSettings().setRotation(StructPrevMath.getRotationFromYaw()).setMirror(Mirror.NONE));
			}else{
				//structure = TESTMain.instance.structure;
			}
			
			BlockPos structurePreviewPos;
			/*if(TESTMain.instance.pinnedPos == null){
				structurePreviewPos = Minecraft.getMinecraft().objectMouseOver.getBlockPos().add(0, 1, 0);
			}else{
				structurePreviewPos = TESTMain.instance.pinnedPos;
			}
		structure.renderStructure(structurePreviewPos, Minecraft.getMinecraft().theWorld, Minecraft.getMinecraft().thePlayer, event.getPartialTicks());

		}*/
	}
}
