package codes.biscuit.skyblockaddons.utils.skyblockdata;

import codes.biscuit.skyblockaddons.constants.game.Rarity;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.Getter;

@Getter
public class PetInfo {
    String type;
    boolean active;
    double exp;
    Rarity tier;
    boolean hideInfo;
    String heldItem;
    int candyUsed;

    public PetInfo(String petInfo)
    {
        JsonObject pet = new JsonParser().parse(petInfo).getAsJsonObject();

        type = pet.get("type").getAsString();
        active = pet.get("active").getAsBoolean();
        exp = pet.get("exp").getAsDouble();
        tier = Rarity.valueOf(pet.get("tier").getAsString());
        hideInfo = pet.get("hideInfo").getAsBoolean();
        heldItem = pet.get("heldItem").getAsString();
        candyUsed = pet.get("candyUsed").getAsInt();
    }
}
