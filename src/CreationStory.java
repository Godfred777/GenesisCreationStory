public class CreationStory {
    private final String[] stories = {
            "Created Heavens and the Earth in the Beginning",
            "Brought light to the Earth from the Heavens",
            "Created the atmosphere by separating water between the earth and heavens",
            "Created the land, sea and vegetation",
            "Revealed the sun, moon and stars",
            "Created sea creatures and birds",
            "Created land animals and Humans",
            "Rested on this day"

    };

    public void getStories() {
        int day = 0;
        String story;
        while (day < stories.length) {
            story = stories[day];
            System.out.println(story);
            day ++;
        }
    }

    public String getStoryAtIndex(int day) {
        if (day >= stories.length) {
            return "No story at that particular day";
        }
        return stories[day];
    }

}
