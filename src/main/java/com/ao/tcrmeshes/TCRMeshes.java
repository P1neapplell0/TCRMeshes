package com.ao.tcrmeshes;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import yesman.epicfight.api.client.model.Meshes;
import yesman.epicfight.client.mesh.HumanoidMesh;

@Mod(TCRMeshes.MOD_ID)
public class TCRMeshes {

    public static final String MOD_ID = "tcrmeshes";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Mesh Accessors
    public static final Meshes.MeshAccessor<HumanoidMesh> IGNIS_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/ignis",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> SCYLLA_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/scylla",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> LEVIATHAN_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/leviathan",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> HARBINGER_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/harbinger",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> ENDER_GUARDIAN_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/ender_guardian",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<NetheriteHumanoidMesh> NETHERITE_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/netherite",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(NetheriteHumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> MALEDICTUS_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/maledictus",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    public static final Meshes.MeshAccessor<HumanoidMesh> ANCIENT_REMAIN_HUMANOID =
            Meshes.MeshAccessor.create(TCRMeshes.MOD_ID, "entity/ancient_remain",(jsonModelLoader) -> jsonModelLoader.loadSkinnedMesh(HumanoidMesh::new));

    // Texture Resource Locations
    public static final ResourceLocation IGNIS_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/ignis_humanoid.png");

    public static final ResourceLocation SCYLLA_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/scylla_humanoid.png");

    public static final ResourceLocation LEVIATHAN_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/leviathan_humanoid.png");

    public static final ResourceLocation HARBINGER_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/harbinger_humanoid.png");

    public static final ResourceLocation ENDER_GUARDIAN_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/ender_guardian_humanoid.png");

    public static final ResourceLocation NETHERITE_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/netherite_humanoid.png");

    public static final ResourceLocation MALEDICTUS_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/maledictus_humanoid.png");

    public static final ResourceLocation ANCIENT_REMAIN_HUMANOID_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(TCRMeshes.MOD_ID, "textures/entity/ancient_remain_humanoid.png");

    public TCRMeshes() {
        if(!ModList.get().isLoaded("tcr_bosses")) {
            LOGGER.error("[TCRMeshes] : This mod is exclusively for 'the Casket of Reveries' modpack. If you wish to use this mod or models, please request authorization from P1nero (gaylordfocker@foxmail.com).");
            System.exit(0);
        }

    }
}