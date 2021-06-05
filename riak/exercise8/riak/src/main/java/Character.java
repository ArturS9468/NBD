public class Character {

    private String name;
    private String clazz;
    private String race;
    private Long age;

    public Character() {
    }

    public Character(String name, String clazz, String race, Long age) {
        this.name = name;
        this.clazz = clazz;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
