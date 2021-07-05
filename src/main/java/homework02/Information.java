package homework02;

import java.util.*;

public class Information {

    private List<String> nameList = new ArrayList<>();
    private Set<String> mailSet = new HashSet<>();
    private Map<String, String> informationMap = new HashMap<>();

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public Set<String> getMailSet() {
        return mailSet;
    }

    public void setMailSet(Set<String> mailSet) {
        this.mailSet = mailSet;
    }

    public Map<String, String> getInformationMap() {
        return informationMap;
    }

    public void setInformationMap(Map<String, String> informationMap) {
        this.informationMap = informationMap;
    }

    @Override
    public String toString() {
        return "Information{" +
                "nameList=" + nameList +
                ", mailSet=" + mailSet +
                ", informationMap=" + informationMap +
                '}';
    }

}
