package ex_22_ENUM;

enum Locators {
    page_button("#btn"),
    page_input("#input1");


    private String c_locators;
    Locators(String hashtag) {
        this.c_locators=hashtag;
    }
    String getLocators()
    {
        return this.c_locators;
    }
}

