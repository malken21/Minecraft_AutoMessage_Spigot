package marumasa.auto_message;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Random;

public class SendMessage extends BukkitRunnable {

    final List<String> Messages;

    public SendMessage(Config data) {
        Messages = data.Messages;

    }

    @Override
    public void run() {
        final int RANDOM = new Random().nextInt(Messages.size());
        final String Message = Messages.get(RANDOM);
        Bukkit.broadcastMessage(Message);
    }
}