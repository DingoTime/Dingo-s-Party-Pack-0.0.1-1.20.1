package io.github.dingotime.partypack.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
	public static final FoodComponent ICECREAM = new FoodComponent.Builder().snack().hunger(4).saturationModifier(0.3f)
		.statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600), 0.25f).build();
}
