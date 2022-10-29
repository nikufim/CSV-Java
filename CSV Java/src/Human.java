public class Human {

    private final String surnameName;

    enum Gender{
        Male,
        Female
    }

    public Human(String surnameName){
        this.surnameName = surnameName;
    }

    public String getSurname() {
        return "";
    }

    public String getName() {
        return "";
    }

    public String getSurnameName() {
        return surnameName;
    }
}
