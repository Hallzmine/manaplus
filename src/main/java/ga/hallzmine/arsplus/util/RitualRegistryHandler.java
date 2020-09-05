package ga.hallzmine.arsplus.util;

import com.ma.api.rituals.RitualEffect;
import ga.hallzmine.arsplus.ArsPlus;
import ga.hallzmine.arsplus.rituals.effects.RitualEffectFlowerPlains;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(
        modid = "arsplus",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class RitualRegistryHandler {
    public static IForgeRegistry<RitualEffect> RITUAL_EFFECTS;

    @SubscribeEvent
    public static void onRegisterRitualEffects(RegistryEvent.Register<RitualEffect> event){
        RITUAL_EFFECTS = event.getRegistry();
        event.getRegistry().register(new RitualEffectFlowerPlains(new ResourceLocation("arsplus", "rituals/flower_plains")).setRegistryName(new ResourceLocation("arsplus", "rituals/flower_plains")));
        ArsPlus.LOGGER.debug("Hallzmine's Mana+: Rituals Registered");
    }
}
