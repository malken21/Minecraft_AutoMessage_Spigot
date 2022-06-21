package marumasa.auto_message;

import org.bukkit.plugin.java.JavaPlugin;

public final class Minecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        Config config = new Config(this);
        getLogger().info(String.valueOf(config.Messages));
        getLogger().info(String.valueOf(config.tick));

        if (config.AllSendMessage) {
            new AllSendMessage(config).runTaskTimer(this, config.tick, config.tick);
        } else {
            new SendMessage(config).runTaskTimer(this, config.tick, config.tick);
        }
    }

    @Override
    public void onDisable() {
    }
}