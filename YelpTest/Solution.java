package YelpTest;

import java.util.*;

class Event {
    String eventType;
    int occurrences;
    int bizId;

    public Event(String eventType, int occurrences, int bizId) {
        this.eventType = eventType;
        this.occurrences = occurrences;
        this.bizId = bizId;
    }

    public String getEventType() {
        return this.eventType;
    }

    public int getOccurrences() {
        return this.occurrences;
    }

    public int getBizId() {
        return this.bizId;
    }
}

class Solution {

    public List<Integer> findActiveBusinesses(List<Event> events) {
        // COMPLETE ME
        List<Integer> activelist = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();


        for (Event e : events) {
            if (map.containsKey(e.eventType)) {

                map.replace(e.eventType, map.get(e.eventType) + 1);

            } else {
                map.put(e.eventType, 1);
            }


        }
        return activelist;
    }

    public static void main(String[] args) {

    }
}