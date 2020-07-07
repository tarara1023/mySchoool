package myextras.newboston;

public enum tunaEnum {
    bucky("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12");



    private final String desc;
    private final String year;
     tunaEnum (String description, String birthaday) {
         desc = description;
         year = birthaday;
     }

     public String getDesc() {
         return desc;
     }

     public String getYear() {
         return year;
     }

}
