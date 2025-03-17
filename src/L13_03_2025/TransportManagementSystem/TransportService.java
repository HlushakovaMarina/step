package L13_03_2025.TransportManagementSystem;

import java.util.*;

public class TransportService {

    private final List<Transport> transports = new ArrayList<>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public User findOwnerByLicensePlate(String licensePlate) {
        for (Transport transport : transports) {
            if (licensePlate.equals(transport.getLicensePlate())) {
                return transport.getUser();
            }
        }
        return null;
    }

    public Map<String, List<User>> groupOwnersByCarCount() {
        Map<String, List<User>> listMap = Map.of("1-2 машины",
                new ArrayList<>(), "3-5 машин", new ArrayList<>(),
                "6 и более машин", new ArrayList<>());

        Map<User, Integer> ownersByCarCount = new HashMap<>();
        for (Transport transport : transports) {
            int size = 1;
            User user = transport.getUser();
            ownersByCarCount.putIfAbsent(user, size);
            if (ownersByCarCount.containsKey(user)) {
                Integer sizeTransports = ownersByCarCount.get(user);
                ownersByCarCount.put(user, ++sizeTransports);
            }
        }
        for (Map.Entry<User, Integer> entry : ownersByCarCount.entrySet()) {
            Integer size = entry.getValue();
            if (size > 0 && size < 3) {
                listMap.get("1-2 машины").add(entry.getKey());
            }
            if (size > 2 && size < 6) {
                listMap.get("3-5 машины").add(entry.getKey());
            } else {
                listMap.get("6 и более машин").add(entry.getKey());
            }
        }
        return listMap;
    }
//    void test(){
//        List<Map.Entry<String,Integer>> m = new ArrayList<>();
//        for (Map.Entry){
//            m.add(entry);
//        }
//        m.sort(new TransportMapValueComparator());
//    }
        public List<String> findTop5MostPopularBrands () {
            Map<String, Integer> top5PopularBrands = new HashMap<>();


        }

}

