package invisibleshoes;


import invisibleshoes.items.InvisibleShoesArmorItem;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.ItemRegistry;

@ModEntry
public class InvisibleShoes
{
  public void init()
  {
    ItemRegistry.registerItem("is_invisibleshoes",
        new InvisibleShoesArmorItem(),
        50,
        true);
  }

  public void initResources()
  {
  }

  public void postInit()
  {
  }

}
