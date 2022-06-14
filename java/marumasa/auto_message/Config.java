package marumasa.auto_message;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class Config {

    public final List<String> Messages;
    public final long tick;

    public Config(Minecraft plugin) {
        plugin.saveDefaultConfig();
        FileConfiguration config = plugin.getConfig();
        Messages = config.getStringList("Messages");
        tick = config.getLong("tick", 6000L);
    }
}