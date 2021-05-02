package net.deltapvp.randomutils.utils;

import net.deltapvp.randomutils.RandomUtils;
import net.kyori.adventure.text.Component;

import java.util.Collections;
import java.util.List;

public class ServerUtil {

    /**
     * Broadcast an {@link Component} to everyone on the server.
     *
     * @param component the component to broadcast on the server
     */
    public static void broadcast(Component component) {
        broadcast(Collections.singletonList(component));
    }

    /**
     * Broadcast an {@link Component} to everyone on the server.
     *
     * @param components the {@link Component} to send to everyone on the server.
     */
    public static void broadcast(List<Component> components) {
        for (Component component : components) {
            RandomUtils.getInstance().getAdventure().all().sendMessage(component);
        }
    }
}
