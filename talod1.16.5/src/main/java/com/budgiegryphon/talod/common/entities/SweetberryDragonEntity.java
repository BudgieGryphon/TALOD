package com.budgiegryphon.talod.common.entities;


import javax.annotation.Nullable;

import com.budgiegryphon.talod.core.init.EntityTypeInit;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class SweetberryDragonEntity extends AnimalEntity{
	
	public SweetberryDragonEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
		super(type, worldIn);
		this.moveControl = new FlyingMovementController(this, 10, false);
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.FLYING_SPEED, 0.25D);

    }
	
	@Nullable
	public AgeableEntity createChild(AgeableEntity ageable) {
		return EntityTypeInit.SWEETBERRYDRAGON_ENTITY.get().create(this.level);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		
		this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 8.0f));	
	}

	 protected int getExperiencePoints(PlayerEntity player)
	    {
	        return 1;
	    }
	 
	@Override
	public AgeableEntity getBreedOffspring(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
		return EntityTypeInit.SWEETBERRYDRAGON_ENTITY.get().create(p_241840_1_);
	}
}


