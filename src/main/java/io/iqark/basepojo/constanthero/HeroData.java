package io.iqark.basepojo.constanthero;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class HeroData {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("localized_name")
    private String locName;
    @JsonProperty("primary_attr")
    private String primaryAttr;
    @JsonProperty("attack_type")
    private String attackType;
    @JsonProperty("roles")
    private List<String> roles = new ArrayList<>();
    @JsonProperty("img")
    private String img;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("base_health")
    private Integer baseHealth;
    @JsonProperty("base_health_regen")
    private Float baseHPRegen;
    @JsonProperty("base_mana")
    private Integer baseMana;
    @JsonProperty("base_mana_regen")
    private Float baseMPRegen;
    @JsonProperty("base_armor")
    private Integer baseArmor;
    @JsonProperty("base_mr")
    private Integer baseMr;
    @JsonProperty("base_attack_min")
    private Integer baseAttackMin;
    @JsonProperty("base_attack_max")
    private Integer baseAttackMax;
    @JsonProperty("base_str")
    private Integer baseStr;
    @JsonProperty("base_agi")
    private Integer baseAgi;
    @JsonProperty("base_int")
    private Integer baseInt;
    @JsonProperty("str_gain")
    private Float strGain;
    @JsonProperty("agi_gain")
    private Float agiGain;
    @JsonProperty("int_gain")
    private Float intGain;
    @JsonProperty("attack_range")
    private Integer attackRange;
    @JsonProperty("projectile_speed")
    private Integer projectileSpeed;
    @JsonProperty("attack_rate")
    private Float attackRate;
    @JsonProperty("base_attack_time")
    private Float baseAttackTime;
    @JsonProperty("attack_point")
    private Float attackPoint;
    @JsonProperty("move_speed")
    private Integer moveSpeed;
    @JsonProperty("turn_rate")
    private Float turnRate;
    @JsonProperty("cm_enabled")
    private Boolean cmEnabled;
    @JsonProperty("legs")
    private Integer legs;
    @JsonProperty("day_vision")
    private Integer dayVision;
    @JsonProperty("night_vision")
    private Integer nightVision;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocName() {
        return locName;
    }

    public String getPrimaryAttr() {
        return primaryAttr;
    }

    public String getAttackType() {
        return attackType;
    }

    public List<String> getRoles() {
        return roles;
    }

    public String getImg() {
        return img;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getBaseHealth() {
        return baseHealth;
    }

    public Float getBaseHPRegen() {
        return baseHPRegen;
    }

    public Integer getBaseMana() {
        return baseMana;
    }

    public Float getBaseMPRegen() {
        return baseMPRegen;
    }

    public Integer getBaseArmor() {
        return baseArmor;
    }

    public Integer getBaseMr() {
        return baseMr;
    }

    public Integer getBaseAttackMin() {
        return baseAttackMin;
    }

    public Integer getBaseAttackMax() {
        return baseAttackMax;
    }

    public Integer getBaseStr() {
        return baseStr;
    }

    public Integer getBaseAgi() {
        return baseAgi;
    }

    public Integer getBaseInt() {
        return baseInt;
    }

    public Float getStrGain() {
        return strGain;
    }

    public Float getAgiGain() {
        return agiGain;
    }

    public Float getIntGain() {
        return intGain;
    }

    public Integer getAttackRange() {
        return attackRange;
    }

    public Integer getProjectileSpeed() {
        return projectileSpeed;
    }

    public Float getAttackRate() {
        return attackRate;
    }

    public Float getBaseAttackTime() {
        return baseAttackTime;
    }

    public Float getAttackPoint() {
        return attackPoint;
    }

    public Integer getMoveSpeed() {
        return moveSpeed;
    }

    public Float getTurnRate() {
        return turnRate;
    }

    public Boolean getCmEnabled() {
        return cmEnabled;
    }

    public Integer getLegs() {
        return legs;
    }

    public Integer getDayVision() {
        return dayVision;
    }

    public Integer getNightVision() {
        return nightVision;
    }
}
