package net.storm.optimizer.mixin;

import net.minecraft.entity.boss.dragon.EndCrystalEntity;
import net.minecraft.entity.damage.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EndCrystalEntity.class)
public class EndCrystalMixin {
    
    @Inject(method = "damage", at = @At("HEAD"))
    private void onCrystalDamage(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        EndCrystalEntity crystal = (EndCrystalEntity) (Object) this;
        if (crystal.getWorld().isClient()) {
            // Kristali istemci tarafındaki render dünyasından ANINDA kaldırır. Gecikmeyi sıfırlar.
            crystal.discard(); 
        }
    }
}
