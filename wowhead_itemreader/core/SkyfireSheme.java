/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wowhead_itemreader.core;

import wowhead_itemreader.Util;
import wowhead_itemreader.WoWHeadData;


public class SkyfireSheme extends BasicSheme
{
    public SkyfireSheme()
    {
        super(new String[]{"entry", "class", "subclass", "SoundOverrideSubclass", "name", "displayid", "Quality", "Flags", "FlagsExtra", "Flags3", "Unk430_1", "Unk430_2", "BuyCount", "BuyPrice", "SellPrice", "InventoryType", "AllowableClass", "AllowableRace", "ItemLevel", "RequiredLevel", "RequiredSkill", "RequiredSkillRank", "requiredspell", "requiredhonorrank", "RequiredCityRank", "RequiredReputationFaction", "RequiredReputationRank", "maxcount", "stackable", "ContainerSlots", "stat_type1", "stat_value1", "stat_unk1_1", "stat_unk2_1", "stat_type2", "stat_value2", "stat_unk1_2", "stat_unk2_2", "stat_type3", "stat_value3", "stat_unk1_3", "stat_unk2_3", "stat_type4", "stat_value4", "stat_unk1_4", "stat_unk2_4", "stat_type5", "stat_value5", "stat_unk1_5`, `stat_unk2_5`, `stat_type6`, `stat_value6`, `stat_unk1_6`, `stat_unk2_6`, `stat_type7`, `stat_value7`, `stat_unk1_7`, `stat_unk2_7`, `stat_type8`, `stat_value8`, `stat_unk1_8`, `stat_unk2_8`, `stat_type9`, `stat_value9`, `stat_unk1_9`, `stat_unk2_9`, `stat_type10`, `stat_value10`, `stat_unk1_10`, `stat_unk2_10`, `ScalingStatDistribution`, `DamageType`, `delay`, `RangedModRange`, `spellid_1`, `spelltrigger_1`, `spellcharges_1`, `spellcooldown_1`, `spellcategory_1`, `spellcategorycooldown_1`, `spellid_2`, `spelltrigger_2`, `spellcharges_2`, `spellcooldown_2`, `spellcategory_2`, `spellcategorycooldown_2`, `spellid_3`, `spelltrigger_3`, `spellcharges_3`, `spellcooldown_3`, `spellcategory_3`, `spellcategorycooldown_3`, `spellid_4`, `spelltrigger_4`, `spellcharges_4`, `spellcooldown_4`, `spellcategory_4`, "spellcategorycooldown_4", "spellid_5", "spelltrigger_5", "spellcharges_5", "spellcooldown_5", "spellcategory_5", "spellcategorycooldown_5", "bonding", "description", "PageText", "LanguageID", "PageMaterial", "startquest", "lockid", "Material", "sheath", "RandomProperty", "RandomSuffix", "itemset", "MaxDurability", "area", "Map", "BagFamily`", "TotemCategory", "socketColor_1", "socketContent_1", "socketColor_2", "socketContent_2", "socketColor_3", "socketContent_3", "socketBonus", "GemProperties", "ArmorDamageModifier", "duration", "ItemLimitCategory", "HolidayId", "StatScalingFactor", "CurrencySubstitutionId", "CurrencySubstitutionCount", "flagsCustom", "WDBVerified"});
    }

    protected String getValueData(WoWHeadData data)
    {
        String values = 
              data.itemId+","
             +data.itemClass+","
             +data.itemSubClass+","
             +"'"+Util.escapeSQL(data.name)+"' ,"
             +data.itemDisplayId+","
             +data.itemQuality+","
             +data.buyprice+","
             +data.sellPrice+","
             +data.inventoryType+","
             +data.reqClass+","
             +data.reqRace+","
             +data.itemLevel+","
             +data.reqLevel+","
             +data.reqskill+","
             +data.reqskillrank+","
             +data.reqFaction+","
             +data.maxCount+","
             +data.containerSlots+", "
             +getSpellStatsQuery(data)+
             +data.scaDist+","
             +data.scaFlag+","
             +data.dmg_type1+","
             +data.attSpeed+","
             +data.range+","
             +getSpellQuery(data)+
             +data.bonding+","
             +"'"+Util.escapeSQL(data.description)+"' ,"
             +data.itemSet+","
             +data.durability+","
             +data.socket_color1+","
             +data.socket_color2+","
             +data.socket_color3+","
             +data.socket_bonus+","
             +data.reqDisentSkill;
        return values;
    }

    @Override
    public String getTableName()
    {
        return "item_template";
    }
}
