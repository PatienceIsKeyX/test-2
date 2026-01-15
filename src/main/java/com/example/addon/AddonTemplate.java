package com.example.addon;

import com.example.addon.modules.AutoMessage;
import com.example.addon.modules.DiamondHighlighter;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Example");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Addon Template");

        // Registering your modules so they appear in the GUI
        Modules.get().add(new AutoMessage());
        Modules.get().add(new DiamondHighlighter());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}

    // Modules
    Modules.get().add(new AutoMessage());
    Modules.get().add(new DiamondHighlighter()); // Add this line
}
}
