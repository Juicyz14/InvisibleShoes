package invisibleshoes.mobs;

import necesse.engine.modLoader.annotations.ModMethodPatch;
import necesse.engine.network.server.ServerClient;
import necesse.entity.mobs.friendly.human.humanShop.StylistHumanMob;
import necesse.level.maps.levelData.villageShops.ShopItem;
import necesse.level.maps.levelData.villageShops.VillageShopsData;
import net.bytebuddy.asm.Advice;

import java.util.ArrayList;

@ModMethodPatch(target = StylistHumanMob.class, name = "getShopItems", arguments = {VillageShopsData.class, ServerClient.class})
public class StylistHumanMobPatch
{
  @Advice.OnMethodExit
  static void onExit(
      @Advice.This StylistHumanMob mob,
      @Advice.Argument(0) VillageShopsData data,
      @Advice.Argument(1) ServerClient client,
      @Advice.Return(readOnly = false) ArrayList<ShopItem> items)
  {
    items.add(ShopItem.item("is_invisibleshoes", 100));
  }
}