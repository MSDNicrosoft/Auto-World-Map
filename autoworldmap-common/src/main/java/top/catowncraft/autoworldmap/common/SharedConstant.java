package top.catowncraft.autoworldmap.common;

import lombok.Getter;
import top.catowncraft.autoworldmap.common.config.ConfigManager;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

public class SharedConstant {
    public static final String VOXEL_MAP_NAMESPACE = "worldinfo";
    public static final String VOXEL_MAP_NAME = "world_id";
    public static final String VOXEL_MAP_CHANNEL = VOXEL_MAP_NAMESPACE + ":" + VOXEL_MAP_NAME;

    public static final String XAERO_WORLD_MAP_NAMESPACE = "xaeroworldmap";
    public static final String XAERO_WORLD_MAP_NAME = "main";
    public static final String XAERO_WORLD_MAP_CHANNEL = XAERO_WORLD_MAP_NAMESPACE + ":" + XAERO_WORLD_MAP_NAME;

    public static final String XAERO_MINI_MAP_NAMESPACE = "xaerominimap";
    public static final String XAERO_MINI_MAP_NAME = "main";
    public static final String XAERO_MINI_MAP_CHANNEL = XAERO_MINI_MAP_NAMESPACE + ":" + XAERO_MINI_MAP_NAME;

    public static final String PLUGIN_AUTHORS = "The-Cat-Town-Craft, Hendrix-Shen";

    public static final String PLUGIN_DESCRIPTION = "Automatic map switching for VoxelMap, XaeroMap when switching servers.";

    public static final String PLUGIN_ID = "auto-world-map";

    public static final String PLUGIN_NAME = "AutoWorldMap";
    
    public static final String PLUGIN_PERMISSION_ROOT = "autoworldmap";
    
    public static final String PLUGIN_URL = "https://github.com/The-Cat-Town-Craft/Auto-World-Map";

    public static final String PLUGIN_VERSION = "@PLUGIN_VERSION@";

    public static final List<String> CONFIG_HEADER = Arrays.asList(
            " ==================================================",
            "         Auto World Map configuration file",
            "",
            String.format(" Copyright (c) 2020 - %s The Cat Town Craft and ", Calendar.getInstance().get(Calendar.YEAR)),
            " contributors.",
            " =================================================="
    );

    @Getter
    private static final Logger logger = Logger.getLogger("AutoWorldMap");

    @Getter
    private static final ConfigManager config = new ConfigManager();
}
