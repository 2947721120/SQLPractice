package randomappsinc.com.sqlpractice.Misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alexanderchiou on 6/29/16.
 */
public class TutorialServer {
    public static final String INTRO = "SELECT Introduction";

    private static TutorialServer instance;

    private Map<String, String> ideaToUrl;

    public static TutorialServer get() {
        if (instance == null) {
            instance = new TutorialServer();
        }
        return instance;
    }

    private TutorialServer() {
        ideaToUrl = new HashMap<>();
        ideaToUrl.put(INTRO, "http://www.w3schools.com/sql/sql_select.asp");
    }

    public String getUrl(String idea) {
        return ideaToUrl.get(idea);
    }
}
