package com.tetraarc.resourcebeans.item;


import com.tetraarc.resourcebeans.ResourceBeans;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BaseItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResourceBeans.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}