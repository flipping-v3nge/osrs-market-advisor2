package com.yourname.marketadvisor;

import javax.swing.*;
import net.runelite.client.ui.PluginPanel;

class UiPanel extends PluginPanel
{
    private final DefaultListModel<String> model = new DefaultListModel<>();

    void pushLine(String s)
    {
        model.addElement(s);
    }
}
