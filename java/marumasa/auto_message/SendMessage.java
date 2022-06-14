package marumasa.auto_message;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Random;

public class SendMessage extends BukkitRunnable {
    private final Config config;

    public SendMessage(Config data) {
        config = data;
    }

    @Override
    public void run() {
        final List<String> Messages = config.Messages;

        final Random RANDOM = new Random();
        final String Message = Messages.get(RANDOM.nextInt(Messages.size()));
        Bukkit.broadcastMessage(Message);
    }
}