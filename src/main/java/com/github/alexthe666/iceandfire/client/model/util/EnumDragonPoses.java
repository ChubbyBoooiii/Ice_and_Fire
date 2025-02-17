package com.github.alexthe666.iceandfire.client.model.util;

/*
 * Code directly taken from 1.16 IaF, I own no rights over it.
 */
public enum EnumDragonPoses implements IEnumDragonPoses {
    MALE("BaseMale"),
    FEMALE("BaseFemale"),
    FLYING_POSE("Flying"),
    DIVING_POSE("Diving"),
    GROUND_POSE("Ground"),
    HOVERING_POSE("Hovering"),
    SITTING_POSE("Sitting"),
    SLEEPING_POSE("Sleeping"),
    SWIM_POSE("Swimming"),
    SWIM1("Swim1"),
    SWIM2("Swim2"),
    SWIM3("Swim3"),
    SWIM4("Swim4"),
    SWIM5("Swim5"),
    BITE1("Bite1"),
    BITE2("Bite2"),
    BITE3("Bite3"),
    BLAST_BREATH("AttackBlastBreath"),
    BLAST_CHARGE1("AttackBlastCharge1"),
    BLAST_CHARGE2("AttackBlastCharge2"),
    BLAST_CHARGE3("AttackBlastCharge3"),
    STREAM_BREATH("AttackStreamBreath"),
    STREAM_CHARGE1("AttackStreamCharge1"),
    STREAM_CHARGE2("AttackStreamCharge2"),
    STREAM_CHARGE3("AttackStreamCharge3"),
    DEAD("Dead"),
    GRAB1("Grab1"),
    GRAB2("Grab2"),
    GRAB_SHAKE1("GrabShake1"),
    GRAB_SHAKE2("GrabShake2"),
    GRAB_SHAKE3("GrabShake3"),
    ROAR1("Roar1"),
    ROAR2("Roar2"),
    ROAR3("Roar3"),
    EPIC_ROAR1("EpicRoar1"),
    EPIC_ROAR2("EpicRoar2"),
    EPIC_ROAR3("EpicRoar3"),
    TAIL_WHIP1("Tail1"),
    TAIL_WHIP2("Tail2"),
    TAIL_WHIP3("Tail3"),
    WING_BLAST1("WingBlast1"),
    WING_BLAST2("WingBlast2"),
    WING_BLAST3("WingBlast3"),
    WING_BLAST4("WingBlast4"),
    WING_BLAST5("WingBlast5"),
    WING_BLAST6("WingBlast6"),
    WING_BLAST7("WingBlast7"),
    WALK1("Walk1"),
    WALK2("Walk2"),
    WALK3("Walk3"),
    WALK4("Walk4"),
    FLIGHT1("Flight1"),
    FLIGHT2("Flight2"),
    FLIGHT3("Flight3"),
    FLIGHT4("Flight4"),
    FLIGHT5("Flight5"),
    FLIGHT6("Flight6"),
    TACKLE("AttackTackle"),
    SIT_ON_PLAYER_POSE("SittingShoulder");

    private String pose;

    EnumDragonPoses(String pose) { this.pose = pose; }
    @Override
    public String getPose() {
        return pose;
    }
}