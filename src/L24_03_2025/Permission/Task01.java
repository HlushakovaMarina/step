package L24_03_2025.Permission;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        EnumMap<Role, Integer> roleObjectEnumMap = new EnumMap<>(Role.class);
        roleObjectEnumMap.put(Role.USER, 10);
        roleObjectEnumMap.put(Role.GUEST, 30);
        roleObjectEnumMap.put(Role.ADMIN, 3);

        for (Map.Entry<Role, Integer> entry : roleObjectEnumMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Role user =Role.USER;
        for (Permission permission : user.getPermissions()) {
            System.out.println(permission + ": "+ permission.getDeclaringClass());
        }
        boolean hasDeletePermission = user.hasPermission(Permission.DELETE);
            System.out.println(hasDeletePermission);

            for (Role value : Role.values()) {
                System.out.println(value.name());

            }
        int ordinal = user.ordinal();
        System.out.println(ordinal);
    }


    }

