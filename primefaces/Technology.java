@ManagedBean(name = "technologyList")
public class Technology {

    public TechnologyList(){

    }

    private List<Technology> getTechnology;

    public List<Technology> getTechnology() {
        return technologyList;
    }

    @PostConstruct
    public void init() {
        technologyList = new ArrayList<TechnologyList>();

        technologyList.add(new Technology("Java programing language", "James Gosling", "1995"));
        technologyList.add(new Technology("Python", "Guido van Rossum", "1991"));
        technologyList.add(new Technology("JavaScript", "Brendan Eich", "1995"));
        technologyList.add(new Technology("PHP", "Rasmus Lerdorf", "1994"));
        technologyList.add(new Technology("C++", "Bjarne Stroustrup", "1985"));
        technologyList.add(new Technology("Ruby", "Yukihiro Matsumoto", "1995"));
        technologyList.add(new Technology("C#", "Anders Hejlsberg", "2000"));
        technologyList.add(new Technology("TypeScript", "Anders Hejlsberg", "2012"));

    }

    public void setTechnologuList(List<Technology> technologuList) {
        this.technologuList = technologuList;
    }
}
