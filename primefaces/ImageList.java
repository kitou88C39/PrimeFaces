@ManagedBean(name = "ImageList")
public class ImageList {

    private List<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();

        images.add("sea.jpg");
        images.add("car.jpg");
        images.add("moutain.jpg");
    }

    public List<String> getImages() {
        return images;
    }
}
