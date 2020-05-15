package xyz.ultra.comandos;

import org.bukkit.command.*;
import org.bukkit.entity.*;

import com.nametagedit.plugin.NametagEdit;

import net.md_5.bungee.api.ChatColor;
import xyz.ultra.system.TagsAPI;

public class TagCMD implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§c§lERRO §fApenas jogadores podem executar este comando.");
            return true;
        }
        final Player p = (Player)sender;
        if (args.length != 0) {
            if (args[0].equalsIgnoreCase("dono")) {
                if (p.hasPermission("tag.dono")) {
                    TagsAPI.setarTag(p, "§4§lDONO §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lDONO §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
                
            }
            if (args[0].equalsIgnoreCase("subdono")) {
                if (p.hasPermission("tag.subdono")) {
                    TagsAPI.setarTag(p, "§4§lSUBDONO §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lSUBDONO §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            if (args[0].equalsIgnoreCase("diretor")) {
                if (p.hasPermission("tag.diretor")) {
                    TagsAPI.setarTag(p, "§4§lDIRETOR §4");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_RED + "§4§lDIRETOR §4");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            if (args[0].equalsIgnoreCase("coordenador")) {
                if (p.hasPermission("tag.coordenador")) {
                    TagsAPI.setarTag(p, "§9§lCOORD §9");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.DARK_AQUA + "§9§lCOORD §9");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            if (args[0].equalsIgnoreCase("admin")) {
                if (p.hasPermission("tag.admin")) {
                    TagsAPI.setarTag(p, "§c§lADMIN §c");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.RED + "§c§lADMIN §c");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            if (args[0].equalsIgnoreCase("gerente")) {
                if (p.hasPermission("tag.gerente")) {
                    TagsAPI.setarTag(p, "§c§lGERENTE §c");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.RED + "§c§lGERENTE §c");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            if (args[0].equalsIgnoreCase("membro")) {
                if (p.hasPermission("tag.membro")) {
                    TagsAPI.setarTag(p, "§7");
                    NametagEdit.getApi().setPrefix(p.getName(), ChatColor.ITALIC + "§7");
                    p.sendMessage("§a§lTAG §fVocê alterou sua tag.");
                    return true;
                }
                p.sendMessage("§c§lTAG §fVocê não possui acesso a está tag.");
            }
            return false;
        }
        if (p.hasPermission("tag.dono")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lDONO§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.subdono")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lSUBDONO§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.diretor")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§4§lDIRETOR§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.coordenador")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§9§lCOORDENADOR§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.admin")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lADMIN§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.gerente")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§c§lGERENTE§f, §7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
        if (p.hasPermission("tag.membro")) {
        	p.sendMessage("§f");
        	p.sendMessage("§3§lTAG §fSelecione uma tag abaixo:");
        	p.sendMessage("§f");
        	p.sendMessage("§7§lMEMBRO§f.");
        	p.sendMessage("§f");
        	p.sendMessage("§aTodas as tags disponíveis em sua conta!");
            p.sendMessage("§f");
            return true;
        }
		return false;
}
}
    
