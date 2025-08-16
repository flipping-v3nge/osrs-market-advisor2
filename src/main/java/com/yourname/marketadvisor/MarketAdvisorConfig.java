package com.yourname.marketadvisor;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("marketadvisor")
public interface MarketAdvisorConfig extends Config
{
    @ConfigItem(
            keyName = "growthThresholdPct",
            name = "Growth % threshold",
            description = "Notify when price rises by this % over EMA"
    )
    default int growthThresholdPct() { return 5; }
}
