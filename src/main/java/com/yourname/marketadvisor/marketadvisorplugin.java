package com.yourname.marketadvisor;

import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(
        name = "OSRS Market Advisor",
        description = "Tracks prices and gives investment alerts",
        tags = {"osrs", "market", "invest"}
)
public class MarketAdvisorPlugin extends Plugin
{
    @Override
    protected void startUp() throws Exception
    {
        System.out.println("Market Advisor plugin started!");
    }

    @Override
    protected void shutDown() throws Exception
    {
        System.out.println("Market Advisor plugin stopped!");
    }
}
