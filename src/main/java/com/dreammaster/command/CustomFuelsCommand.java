package com.dreammaster.command;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

import com.dreammaster.main.MainRegistry;

import eu.usrv.yamcore.auxiliary.PlayerChatHelper;

public class CustomFuelsCommand implements ICommand {

    @Override
    public int compareTo(Object arg0) {
        return 0;
    }

    @Override
    public String getCommandName() {
        return "customfuels";
    }

    @Override
    public String getCommandUsage(ICommandSender p_71518_1_) {
        return "/customfuels reload";
    }

    @Override
    public List getCommandAliases() {
        ArrayList<String> aliases = new ArrayList<>();
        aliases.add("cfuels");
        aliases.add("cfl");
        return aliases;
    }

    @Override
    public void processCommand(ICommandSender pCmdSender, String[] pArgs) {
        if (pArgs.length == 0) {
            if (InGame(pCmdSender)) {
                PlayerChatHelper.SendError(pCmdSender, "Syntax error. Type /customfuels help for help");
            } else {
                PlayerChatHelper.SendPlain(pCmdSender, "[CFLS] Syntax error. Type /customfuels help for help");
            }
            return;
        } else if ("help".equalsIgnoreCase(pArgs[0])) {
            SendHelpToPlayer(pCmdSender);
        } else if ("reload".equalsIgnoreCase(pArgs[0])) {
            boolean tFlag = MainRegistry.Module_CustomFuels.ReloadCustomFuels();
            if (!tFlag) {
                if (!InGame(pCmdSender)) {
                    PlayerChatHelper.SendPlain(pCmdSender, "[CFLS] Reload failed. Check your log for syntax errors");
                } else {
                    PlayerChatHelper.SendWarn(pCmdSender, "Reload failed. Check your log for syntax errors");
                }
            } else {
                if (!InGame(pCmdSender)) {
                    PlayerChatHelper.SendPlain(pCmdSender, "[CFLS] Reload done. New config is activated");
                } else {
                    PlayerChatHelper.SendInfo(pCmdSender, "Reload done. New config is activated");
                }
            }
        } else {
            SendHelpToPlayer(pCmdSender);
        }
    }

    private boolean InGame(ICommandSender pCmdSender) {
        return pCmdSender instanceof EntityPlayer;
    }

    private void SendHelpToPlayer(ICommandSender pCmdSender) {
        if (!InGame(pCmdSender)) {
            PlayerChatHelper.SendPlain(pCmdSender, "[CFLS] Valid options are: reload");
        } else {
            PlayerChatHelper.SendInfo(pCmdSender, "/customfuels reload");
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender pCommandSender) {
        if (pCommandSender instanceof EntityPlayerMP) {
            EntityPlayerMP tEP = (EntityPlayerMP) pCommandSender;
            boolean tPlayerOpped = MinecraftServer.getServer().getConfigurationManager()
                    .func_152596_g(tEP.getGameProfile());
            return tPlayerOpped;
        } else {
            return pCommandSender instanceof MinecraftServer;
        }
    }

    @Override
    public List addTabCompletionOptions(ICommandSender p_71516_1_, String[] p_71516_2_) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
        return false;
    }
}
