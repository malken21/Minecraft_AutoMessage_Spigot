package marumasa.auto_message;

import org.bukkit.plugin.java.JavaPlugin;

public final class Minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);
        getLogger().info(String.valueOf(config.Messages));
        new SendMessage(config).runTaskTimer(this, 0L, config.tick);
    }

    @Override
    public void onDisable() {
    }
}