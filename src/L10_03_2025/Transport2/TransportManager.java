package L10_03_2025.Transport2;

import java.util.*;

import static java.util.Arrays.stream;

public class TransportManager {
    protected final Map<String, Transport> transportByPlate = new HashMap<>();
    protected final Map<String, List<Transport>> transportByType = new HashMap<>();

    public void addTransport(Transport transport) {
        transportByPlate.put(transport.getLicensePlate(), transport);
        String type = transport.getClass().getSimpleName();
        transportByType.putIfAbsent(type, new ArrayList<>());
        transportByType.get(type).add(transport);
//        List<Transport>transports=transportByType.get(type);
//        transports.add(transport);
    }


    public void removeTransport(String licensePlate) {
        Transport transport = transportByPlate.remove(licensePlate);
        if (transport != null) {
            String type = transport.getClass().getSimpleName();
            transportByType.get(type).remove(transport);
            System.out.println("Удалили ");
        } else {
            System.out.println("Не нашли такой транспорт по такому номеру ");
        }
    }

    public void removeTransport2(String licensePlate) {
        transportByPlate.remove(licensePlate);
        for (Map.Entry<String, List<Transport>> entry : transportByType.entrySet()) {
            List<Transport> value = entry.getValue();
            Iterator<Transport> iterator = value.iterator();
            while (iterator.hasNext()) ;
            Transport next = iterator.next();
            if (licensePlate.equals(next.getLicensePlate())) {
                iterator.remove();
            }
        }
    }

    public Transport findTransportByPlate(String licensePlate) {
        return transportByPlate.get(licensePlate);
    }

    public List<Transport> getTransportByType(String type) {
        return transportByType.get(type);
    }

    public Transport getFastestTransportByType(String type) {
        List<Transport> transports = transportByType.get(type);
        transports.sort(Comparator.comparingInt(Transport::getSpeed));
        return transports.getLast();
    }

    public void printAllTransport() {
        transportByPlate.values().forEach(System.out::println);
    }


}
