package me.notlewx.pgames.config.proxy;

import com.andrei1058.bedwars.proxy.api.Language;
import me.notlewx.pgames.api.PGamesAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static me.notlewx.pgames.config.bedwars.MessagesData.*;

public class ProxyMessagesData {
    YamlConfiguration yml;
    File file;
    private static final List<Language> languages = PGamesAPI.getBwProxyApi().getLanguageUtil().getLanguages();
    public ProxyMessagesData() {
        setupMessages();
    }
    public void setupMessages() {
        file = new File(Bukkit.getPluginManager().getPlugin("BedWarsProxy").getDataFolder().getPath() + "/Language/", "messages_en.yml");
        yml = YamlConfiguration.loadConfiguration(file);
        yml.addDefault(MAIN_MENU_NAME, "&8Private game settings");
        yml.addDefault(PRIVATE_GAME_MENU_ITEM_NAME, "&aPrivate game settings");
        yml.addDefault(PRIVATE_GAME_MENU_ITEM_LORE, Arrays.asList("&7Open this menu to configure your private game", "with up to 11 different options!"));
        yml.addDefault(MENU_SELECTED_MEANING, "&aSelected!");
        yml.addDefault(MENU_CLICK_TO_SELECT_MEANING, "&eClick to Select!");
        yml.addDefault(PRIVATE_GAME_NOT_IN_PARTY, "&cYou are not in a party!");
        yml.addDefault(PRIVATE_GAME_ENABLED, "&aYou've enabled private games");
        yml.addDefault(PRIVATE_GAME_ENABLED_OTHERS, "&a{player} has enabled private games");
        yml.addDefault(PRIVATE_GAME_DISABLED, "&cYou've disabled private games disabled");
        yml.addDefault(PRIVATE_GAME_DISABLED_OTHERS, "&c{player} has disabled private games");
        yml.addDefault(PRIVATE_GAME_NOT_OWNER, "&cYou're not the owner of this party!");
        yml.addDefault(PRIVATE_GAME_NO_PERMISSION, "&cYou don't have permission to use this command!");
        yml.addDefault(PRIVATE_GAME_ALREADY_ENABLED, "&cThe private game is already enabled!");
        yml.addDefault(PRIVATE_GAME_ALREADY_DISABLED, "&cThe private game is already disabled!");
        yml.addDefault(PRIVATE_GAME_COULDNT_JOIN, "&cCouldnt join to the private game of this player!");
        yml.addDefault(PRIVATE_GAME_CANT_IN_GAME, "&cYou cant do this in game!");
        yml.addDefault(MENU_BACK_ITEM_NAME, "&aGo Back");
        yml.addDefault(MENU_BACK_ITEM_LORE, Arrays.asList("&7Go back to your bedwars gameplay"));
        yml.addDefault(ITEM_ONE_HIT_ONE_KILL_NAME, "&aOne hit, one kill");
        yml.addDefault(ITEM_ONE_HIT_ONE_KILL_LORE, Arrays.asList("&7Select which items should", "&7instantly kill enemies", "", "{state}"));
        yml.addDefault(ITEM_HEALTH_BUFF_LEVEL_NAME, "&aHealth Buff");
        yml.addDefault(ITEM_HEALTH_BUFF_LEVEL_LORE, Arrays.asList("&7Buff all players health", "", "&aCurrently Selected: &7{selected}"));
        yml.addDefault(ITEM_LOW_GRAVITY_NAME, "&aLow Gravity");
        yml.addDefault(ITEM_LOW_GRAVITY_LORE, Arrays.asList("&7Experience low gravity... also", "&7known as jump boost", "", "{state}"));
        yml.addDefault(ITEM_SPEED_NAME, "&aSpeed");
        yml.addDefault(ITEM_SPEED_LORE, Arrays.asList("&7Gotta go fast!", "", "&aCurrently Selected: &7{selected}"));
        yml.addDefault(ITEM_RESPAWN_EVENT_TIME_NAME, "&aRespawn Time");
        yml.addDefault(ITEM_RESPAWN_EVENT_TIME_LORE, Arrays.asList("&8Game Specific", "", "&7Modify player respawn time", "", "&aCurrently selected: &7{selected}"));
        yml.addDefault(ITEM_EVENTS_TIME_LEVEL_NAME, "&aEvents Time");
        yml.addDefault(ITEM_EVENTS_TIME_LEVEL_LORE, Arrays.asList("&8Game Specific", "", "&7Modify the time for events.", "", "&aCurrently selected: &7{selected}"));
        yml.addDefault(ITEM_NO_EMERALDS_NAME, "&aNo Emeralds");
        yml.addDefault(ITEM_NO_EMERALDS_LORE, Arrays.asList("&8Game Specific", "", "&7Get rif of em hasty emeralds  ", "", "{state}"));
        yml.addDefault(ITEM_NO_DIAMONDS_NAME, "&aNo Diamonds");
        yml.addDefault(ITEM_NO_DIAMONDS_LORE, Arrays.asList("&8Game Specific", "", "&7To hell with those shiny things", "", "{state}"));
        yml.addDefault(ITEM_ALLOW_MAP_BREAK_NAME, "&aDisable Block Protection");
        yml.addDefault(ITEM_ALLOW_MAP_BREAK_LORE, Arrays.asList("&8Game Specific", "", "&7Allow players to break any", "&7blocks, excluding blocks around", "&7generators and spawns.", "", "{state}"));
        yml.addDefault(ITEM_BED_INSTA_BREAK_NAME, "&aBed Instabreak");
        yml.addDefault(ITEM_BED_INSTA_BREAK_LORE, Arrays.asList("&8Game Specific", "", "&7Beds break with a single punch", "", "{state}"));
        yml.addDefault(ITEM_MAX_TEAM_UPGRADES_NAME, "&aMax Team Upgrades");
        yml.addDefault(ITEM_MAX_TEAM_UPGRADES_LORE, Arrays.asList("&8Game Specific", "", "&7All teams will start with maxed", "&7out team upgrade", "", "{state}"));
        yml.addDefault(SUBMENU_SPEED_NAME, "&8Speed");
        yml.addDefault(ITEM_SUBMENU_SPEED_I_NAME, "&aNo Speed");
        yml.addDefault(ITEM_SUBMENU_SPEED_I_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_SPEED_II_NAME, "&aSpeed I");
        yml.addDefault(ITEM_SUBMENU_SPEED_II_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_SPEED_III_NAME, "&aSpeed II");
        yml.addDefault(ITEM_SUBMENU_SPEED_III_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_SPEED_IV_NAME, "&aSpeed III");
        yml.addDefault(ITEM_SUBMENU_SPEED_IV_LORE, Arrays.asList("{state}"));
        yml.addDefault(SUBMENU_SPEED_BACK_ITEM_NAME, "&aGo Back");
        yml.addDefault(SUBMENU_SPEED_BACK_ITEM_LORE, Arrays.asList("&7Go Back to the settings menu"));
        yml.addDefault(SUBMENU_HEALTH_BUFF_NAME, "&8Health Buff");
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_I_NAME, "&aNormal Health");
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_I_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_II_NAME, "&aDouble Health");
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_II_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_III_NAME, "&aTriple Health");
        yml.addDefault(ITEM_SUBMENU_HEALTH_BUFF_III_LORE, Arrays.asList("{state}"));
        yml.addDefault(SUBMENU_HEALTH_BUFF_BACK_ITEM_NAME, "&aGo Back");
        yml.addDefault(SUBMENU_HEALTH_BUFF_BACK_ITEM_LORE, Arrays.asList("&7Go Back to the settings menu"));
        yml.addDefault(SUBMENU_EVENTS_TIME_NAME, "&8Events Time");
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_I_NAME, "&ax0.5 - Slower");
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_I_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_II_NAME, "&ax1 - Normal");
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_II_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_III_NAME, "&ax2 - Fast");
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_III_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_IV_NAME, "&ax4 - Faster");
        yml.addDefault(ITEM_SUBMENU_EVENTS_TIME_IV_LORE, Arrays.asList("{state}"));
        yml.addDefault(SUBMENU_EVENTS_TIME_BACK_ITEM_NAME, "&aGo Back");
        yml.addDefault(SUBMENU_EVENTS_TIME_BACK_ITEM_LORE, Arrays.asList("&7Go Back to the settings menu"));
        yml.addDefault(SUBMENU_RESPAWN_TIME_NAME, "&8Respawn Time");
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_I_NAME, "&a1 Second");
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_I_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_II_NAME, "&a5 Second");
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_II_LORE, Arrays.asList("{state}"));
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_III_NAME, "&a10 Second");
        yml.addDefault(ITEM_SUBMENU_RESPAWN_TIME_III_LORE, Arrays.asList("{state}"));
        yml.addDefault(SUBMENU_RESPAWN_TIME_BACK_ITEM_NAME, "&aGo Back");
        yml.addDefault(SUBMENU_RESPAWN_TIME_BACK_ITEM_LORE, Arrays.asList("&7Go Back to the settings menu"));
        yml.addDefault(NO_SPEED_MEANING, "&7No speed");
        yml.addDefault(SPEED_I_MEANING, "&7Speed I");
        yml.addDefault(SPEED_II_MEANING, "&7Speed II");
        yml.addDefault(SPEED_III_MEANING, "&7Speed III");
        yml.addDefault(NORMAL_HEALTH_MEANING, "&7Normal Health");
        yml.addDefault(DOUBLE_HEALTH_MEANING, "&7Double Health");
        yml.addDefault(TRIPLE_HEALTH_MEANING, "&7Triple Health");
        yml.addDefault(RESPAWN_EVENT_TIME_I_MEANING, "&71 Second");
        yml.addDefault(RESPAWN_EVENT_TIME_II_MEANING, "&75 Seconds");
        yml.addDefault(RESPAWN_EVENT_TIME_III_MEANING, "&710 Seconds");
        yml.addDefault(EVENTS_TIME_SLOWER_MEANING, "x0.5 - Slow");
        yml.addDefault(EVENTS_TIME_NORMAL_MEANING, "x1 - Normal");
        yml.addDefault(EVENTS_TIME_FAST_MEANING, "x2 - Faster");
        yml.addDefault(EVENTS_TIME_FASTER_MEANING, "x4 - Faster");
        yml.options().copyDefaults(true);
        save();
    }
    public void save() {
        try {
            yml.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
