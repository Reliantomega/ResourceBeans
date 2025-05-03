package com.tetraarc.resourcebeans.UIElements;

import com.tetraarc.resourcebeans.ResourceBeans;
import com.tetraarc.resourcebeans.block.BaseBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ResourceBeansCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ResourceBeans.MODID);

    public static final Supplier<CreativeModeTab> RESOOURCEBEANS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("resourcebeans_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(BaseBlocks.IRON_LOG.get()))
                    .title(Component.translatable("creativetab.resourcebeans.resourcebeans_blocks"))
                    .displayItems((itemDisplayParameters, output) ->{
                        output.accept(BaseBlocks.IRON_LOG);

                    })
                    .build() //must be called last
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
