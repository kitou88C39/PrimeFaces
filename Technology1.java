@ManagedBean(name = "technologyList")
public class Technology1 {

    String name, developedBy, year;

    public Technology(String name, String developedBy, String year){
    this.name = name;
    this.developedBy = developedBy;
    this.year = year;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String getDevelopedBy() {
        return developedBy;
    }

    public String setDevelopedBy(String developedBy) {
        this.developedBy = developedBy;
    }

    public String getYear() {
        return year;
    }

    public String setYear(String year) {
        this.year = year;
    }

    public Techology(){
    }
}
