package com.codesharkstudio.domain.test

data class HeroForTestItem(
    val `1_pick`: Int,
    val `1_win`: Int,
    val `2_pick`: Int,
    val `2_win`: Int,
    val `3_pick`: Int,
    val `3_win`: Int,
    val `4_pick`: Int,
    val `4_win`: Int,
    val `5_pick`: Int,
    val `5_win`: Int,
    val `6_pick`: Int,
    val `6_win`: Int,
    val `7_pick`: Int,
    val `7_win`: Int,
    val `8_pick`: Int,
    val `8_win`: Int,
    val agi_gain: Double,
    val attack_point: Double, // absent
    val attack_range: Int,
    val attack_rate: Double,
    val attack_type: String,
    val base_agi: Int,
    val base_armor: Double,
    val base_attack_max: Int,
    val base_attack_min: Int,
    val base_attack_time: Int, // absent
    val base_health: Int,
    val base_health_regen: Double,
    val base_int: Int,
    val base_mana: Int,
    val base_mana_regen: Double,
    val base_mr: Int,
    val base_str: Int,
    val cm_enabled: Boolean, // absent
    val day_vision: Int, // absent
    val icon: String,
    val id: Int,
    val img: String,
    val int_gain: Double,
    val legs: Int,
    val localized_name: String,
    val move_speed: Int,
    val name: String, // absent
    val night_vision: Int, // absent
    val primary_attr: String,
    val pro_ban: Int, // absent
    val pro_pick: Int,
    val pro_win: Int,
    val projectile_speed: Int,
    val pub_pick: Int, //absent
    val pub_pick_trend: List<Int>, // absent
    val pub_win: Int, //absent
    val pub_win_trend: List<Int>, //absent
    val roles: List<String>,
    val str_gain: Double,
    val turbo_picks: Int,
    val turbo_picks_trend: List<Int>, //absent
    val turbo_wins: Int, //absent
    val turbo_wins_trend: List<Int>, //absent
    val turn_rate: Double
)