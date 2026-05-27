package net.storm.optimizer;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StormOptimizer implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.LoggerFactory.getLogger("storm-crystal-optimizer");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Storm Crystal Optimizer ready for CPvP!");
    }
}