@ManagedBean(name = "cb")
public class CoursesBean {
    private List<String> courses;

    @PostConstruce
    public void init() {

        courses = new ArrayList();
        courses.add("JSF");
        courses.add("React");
        courses.add("Flutter");
    }

public List<String> getCourses(){
    retrun this.courses;
}

    public void setCourses(List<String> coureses) {
        this.courses = courses;
    }
}
