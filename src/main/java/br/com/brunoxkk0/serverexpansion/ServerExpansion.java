package br.com.brunoxkk0.serverexpansion;

import br.com.brunoxkk0.servercore.core.managers.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerExpansion extends JavaPlugin {

    public static ServerExpansion instance;

    public static ServerExpansion getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        CommandManager.getInstance().build(this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
