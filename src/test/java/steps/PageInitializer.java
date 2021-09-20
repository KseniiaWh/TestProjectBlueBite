package steps;

import pages.RafflePage;

public class PageInitializer {
    public static RafflePage rafflePage;

    public static void initializePageObjects(){
        rafflePage=new RafflePage();
    }
}
