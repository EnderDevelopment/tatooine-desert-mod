package com.f88484116.tatooinedesertmod.world.feature;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;

public class TatooineVillageFeature extends Feature<NoneFeatureConfiguration> {
    
    public TatooineVillageFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }
    
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        StructureTemplateManager templateManager = context.level().getLevel().getServer().getStructureManager();
        StructureTemplate template = templateManager.getOrCreate(new ResourceLocation("tatooinedesertmod:tatooine_village"));
        
        if (template == null) {
            return false;
        }
        
        BlockPos pos = context.origin();
        StructurePlaceSettings settings = new StructurePlaceSettings()
            .setRotation(Rotation.NONE)
            .setMirror(net.minecraft.world.level.block.Mirror.NONE);
        
        template.placeInWorld(context.level(), pos, pos, settings, context.random(), 2);
        return true;
    }
}