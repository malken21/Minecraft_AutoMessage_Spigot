package marumasa.auto_message;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SendMessage extends BukkitRunnable {
    private final Config config;

    private List<String> MessageData = null;
    private List<String> MessageRemove = new ArrayList<>();

    public SendMessage(Config data) {
        config = data;
    }

    @Override
    public void run() {
        if (config.AllSendMessage) {
            if(MessageData == null ){
                MessageData = config.Messages;
            }
            if ( MessageData.isEmpty()) {
                MessageData = MessageRemove;
                MessageRemove = new ArrayList<>();
            }
            final int RANDOM = new Random().nextInt(MessageData.size());
            final String Message = MessageData.get(RANDOM);
            MessageRemove.add(Message);
            MessageData.remove(RANDOM);
            Bukkit.broadcastMessage(Message);
        } else {
            final List<String> Messages = config.Messages;
            final int RANDOM = new Random().nextInt(Messages.size());
            final String Message = Messages.get(RANDOM);
            Bukkit.broadcastMessage(Message);
        }
    }
}