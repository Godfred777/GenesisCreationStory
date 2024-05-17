import java.util.ArrayList;

public class CreationStory {
    private final ArrayList<String> days = new ArrayList<>();
    public CreationStory() {
        days.add("Creating the Heavens🌌🌌 and the Earth🌍🌍 in the beginning");
        days.add("Brought light on the first day☀️💡");
        days.add("Form the atmosphere☁️☁️ on the second day");
        days.add("Created land, sea⛵⛵ and vegetation on the third day🌱🪴🌿🌵");
        days.add("Brought the sun🌅☀️, moon and stars on the fourth day");
        days.add("Populates the sea with sea creatures🐟🦈🐡 and the sky with birds🦅🦆🐦 on the fifth day");
        days.add("Created land animals🫎🫏🦁and humans 🫂🧑‍🤝‍🧑🤼 on the sixth day");
        days.add("Rested🛌🛏️ on the seventh day");
    }

    public void getDays() {
        int day = 0;
        while (day < days.size()) {
            System.out.println(days.get(day));
            day ++;
        }
    }

    public String getStoryAtDay(int day) {
        if (day >= days.size()) {
            return "No such day recorded in the Bible";
        }
        return days.get(day);
    }

}
