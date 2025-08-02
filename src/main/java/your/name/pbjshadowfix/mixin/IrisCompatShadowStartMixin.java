package your.name.pbjshadowfix.mixin;

import mod.pbj.compat.iris.IrisCompat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * PointBlank のシャドウ開始フックを完全に無効化する。
 * これにより UnsupportedOperationException を防ぐ。
 */
@Mixin(value = IrisCompat.class, remap = false)
public class MixinIrisCompat {

    // static void onStartRenderShadows()
    @Inject(method = "onStartRenderShadows", at = @At("HEAD"), cancellable = true)
    private static void pbjshadowfix$cancelShadowHook(CallbackInfo ci) {
        ci.cancel(); // 以降の処理を全てスキップ
    }
}
