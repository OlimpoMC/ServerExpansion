package br.com.brunoxkk0.serverexpansion.commands;

import br.com.brunoxkk0.servercore.api.commands.Command;
import br.com.brunoxkk0.servercore.api.commands.CommandImplementable;
import br.com.brunoxkk0.serverexpansion.ServerExpansion;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

@Command(plugin = ServerExpansion.class, label = "light", getAliases = {"luz", "acender", "apagar"})
public class Light implements CommandImplementable {

    @Override
    public boolean process(CommandSender commandSender, String s, String[] strings) {

        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("This command only can be executed by players.");
            return false;
        }

        Player player = (Player) commandSender;

        PotionEffect potionEffect = player.getPotionEffect(PotionEffectType.NIGHT_VISION);

        if(potionEffect != null && potionEffect.getAmplifier() == 2){

            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            player.sendMessage("§8[§7Luz Apagada§8]");

            return true;

        }

        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 10000, 2), true);
        player.sendMessage("§8[§eLuz Acesa§8]");


        return true;
    }

}
