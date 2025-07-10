package top.catowncraft.autoworldmap.velocity.command;

import com.velocitypowered.api.command.CommandSource;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import top.catowncraft.autoworldmap.common.command.ICommandSender;

public class CommandSenderImpl implements ICommandSender {
    private final static LegacyComponentSerializer LEGACY_SERIALIZER = LegacyComponentSerializer.legacySection();

    private final CommandSource source;

    public CommandSenderImpl(CommandSource source) {
        this.source = source;
    }

    @Override
    public void sendFeedback(String msg) {
        this.source.sendMessage(LEGACY_SERIALIZER.deserialize(msg));
    }

    @Override
    public void sendFeedback(String msg, Object... objects) {
        this.source.sendMessage(LEGACY_SERIALIZER.deserialize(String.format(msg, objects)));
    }

    @Override
    public boolean hasPermission(String permission) {
        return this.source.hasPermission(permission);
    }
}
