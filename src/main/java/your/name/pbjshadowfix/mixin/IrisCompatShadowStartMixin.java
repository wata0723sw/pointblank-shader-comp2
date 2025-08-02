package your.name.pbjshadowfix.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Cancel Point Blank's Iris shadow hook.
 * Target: mod.pbj.compat.iris.IrisCompat#onStartRenderShadows(...)
 */
@Mixin(targets = "mod.pbj.compat.iris.IrisCompat", remap = false)
public abstract class IrisCompatShadowStartMixin {

    @Inject(method = "onStartRenderShadows", at = @At("HEAD"), cancellable = true)
    private static void pbjshadowfix$cancelShadowHook(CallbackInfo ci) {
        ci.cancel();
    }
}
