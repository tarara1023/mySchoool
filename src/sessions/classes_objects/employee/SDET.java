package sessions.classes_objects.employee;

public class SDET extends Employee {
    private String programmingLanguage;

    public SDET(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                 getId() + "" + getName() + '}';
    }
}
