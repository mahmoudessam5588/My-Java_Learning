package com.company.JavaTime;

import java.time.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class TIImeZonesClassTest1 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(Arrays.asList(shortIds,ZoneId.systemDefault()));
        ZoneId pakistanZone =ZoneId.of("Asia/Karachi");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zone = now.atZone(pakistanZone);
        System.out.println(zone);
        System.out.println(pakistanZone);
        Instant instant = Instant.now();
        ZonedDateTime atZone = instant.atZone(pakistanZone);
        System.out.println(atZone);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset Manas = ZoneOffset.of("+04:00");
        OffsetDateTime desiredTime = instant.atOffset(Manas);
        System.out.println(desiredTime);
        System.out.println("------------------------------------------");
        OffsetDateTime diff = OffsetDateTime.of(now, Manas);
        System.out.println(diff);


    }
}
