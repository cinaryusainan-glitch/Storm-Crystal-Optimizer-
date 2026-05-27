package net.storm.optimizer;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StormOptimizer implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Storm Crystal Optimizer");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Storm Crystal Optimizer successfully initialized! Pure performance mode active.");
    }
}
