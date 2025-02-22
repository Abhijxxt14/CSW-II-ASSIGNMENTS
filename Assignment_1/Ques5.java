import java.util.ArrayList;

class ImageLibrary {
    private ArrayList<Image> images = new ArrayList<>();

    public void addImage(Image img) {
        images.add(img);
    }

    public Image getImage(int index) {
        return images.get(index);
    }

    public Image searchImage(String colorCode) {
        for (Image img : images) {
            if (img.getColorCode().equals(colorCode)) {
                return img;
            }
        }
        return null;
    }
}

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary library = new ImageLibrary();
        library.addImage(new Image(1920, 1080, "RGB"));
        library.addImage(new Image(800, 600, "CMYK"));

        Image foundImage = library.searchImage("RGB");
        System.out.println(foundImage);
    }
}
