package senser;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class AircraftSentenceFactory {
    public AircraftSentence createSentence(JSONArray data) {
        AircraftSentence acs = new AircraftSentence(data);
        return acs;
    }

    public List<AircraftSentence> createSentenceList(JSONArray data) {
        List<AircraftSentence> sentenceList = new ArrayList<AircraftSentence>();

        for (int i = 0; i < data.length(); i++) {
            sentenceList.add(new AircraftSentence(data.getJSONArray(i)));
        }

        return sentenceList;
    }
}
