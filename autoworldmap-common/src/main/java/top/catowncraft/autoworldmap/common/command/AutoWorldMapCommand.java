package top.catowncraft.autoworldmap.common.command;

import top.catowncraft.autoworldmap.common.SharedConstant;
import top.catowncraft.autoworldmap.common.util.CommandUtil;

import java.util.ArrayList;
import java.util.List;

public class AutoWorldMapCommand {
    public List<String> doCompletion(ICommandSender sender, List<String> args) {
        List<String> ret = new ArrayList<>();
        if (args.isEmpty()) {
            if (CommandUtil.hasPermission(sender, "reload")) {
                ret.add("reload");
            }
        }
        return ret;
    }

    public void execute(ICommandSender sender, List<String> args) {
        if (args.isEmpty()) {
            sender.sendFeedback(String.format("§a%s §bv%s §7by §6%s", SharedConstant.PLUGIN_NAME,
                    SharedConstant.PLUGIN_VERSION, SharedConstant.PLUGIN_AUTHORS));
        } else if (args.size() == 1 && "reload".equals(args.get(0))) {
            SharedConstant.getConfig().reload();
            sender.sendFeedback("§aConfiguration reloaded successfully!");
        } else {
            sender.sendFeedback("§cUnknown command!");
        }
    }
}
