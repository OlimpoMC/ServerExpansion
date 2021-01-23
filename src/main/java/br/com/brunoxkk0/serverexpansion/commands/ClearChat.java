package br.com.brunoxkk0.serverexpansion.commands;

import br.com.brunoxkk0.servercore.api.commands.Command;
import br.com.brunoxkk0.servercore.api.commands.CommandImplementable;
import br.com.brunoxkk0.serverexpansion.ServerExpansion;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

@Command(plugin = ServerExpansion.class, label = "clearchat", getAliases = {"cls", "limparchat", "limpac", "cchat"})
public class ClearChat implements CommandImplementable {

    @Override
    public String getPermission() {
        return "serverexpansion.commands.clearchat";
    }

    @Override
    public boolean process(CommandSender commandSender, String s, String[] strings) {

        for(int i = 0; i < 20; i++){
            Bukkit.broadcastMessage("  \n  \n  \n  \n  \n  \n  \n  \n  \n  \n");
        }

        Bukkit.broadcastMessage("§eO chat foi limpo por §6" + commandSender.getName() + "§e.");

        return true;
    }

}
