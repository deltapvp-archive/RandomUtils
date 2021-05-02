package net.deltapvp.randomutils.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class TextUtil {

    /**
     *
     * @param input the string to serialize to a {@link Component}
     * @return the parsed {@link Component}
     */
    public static Component parse(String input) {
        Component toLegacy = LegacyComponentSerializer.builder()
                .extractUrls()
                .hexColors()
                .character('&')
                .build()
                .deserialize(input);

        return MiniMessage.get().parse(MiniMessage.get().serialize(toLegacy));
    }
}
