
package ga.hallzmine.arsplus.rituals.effects;

import com.ma.api.recipes.IRitualRecipe;
import com.ma.api.rituals.RitualEffect;
import com.ma.entities.EntityInit;
import com.ma.entities.rituals.EntityPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.ITeleporter;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Resource;
import java.util.Objects;

public class RitualEffectFlowerPlains extends RitualEffect {
    public RitualEffectFlowerPlains(ResourceLocation ritualName) {
        super(ritualName);
    }

    protected boolean applyRitualEffect(PlayerEntity ritualCaster, ServerWorld world, BlockPos ritualCenter, IRitualRecipe completedRecipe , NonNullList<ItemStack> reagents) {

        ResourceLocation location = new ResourceLocation("arsplus:flower_plains");
        RegistryKey<World> key = RegistryKey.func_240903_a_(Registry.field_239699_ae_, location);
        ritualCaster.changeDimension(world, (ITeleporter) world.getServer().getWorld(key));
        return true;
    }

    protected int getApplicationTicks(ServerWorld world, BlockPos ritualCenter, IRitualRecipe completedrecipe, NonNullList<ItemStack> reagents) {
        return 10;
    }
}