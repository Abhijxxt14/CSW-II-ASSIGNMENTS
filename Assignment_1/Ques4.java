package assignment;
class Image{
	   private int imageWidth;
	    private int imageHeight;
	    private String colorCode;

	 
	    public Image() {
	        this.imageWidth = 0;
	        this.imageHeight = 0;
	        this.colorCode = null; 
	    }
        public Image(int imageWidth, int imageHeight, String colorCode) {
	        this.imageWidth = imageWidth;
	        this.imageHeight = imageHeight;
	        this.colorCode = colorCode;
	    }
       public int getImageWidth() {
	        return imageWidth;
	    }
      public void setImageWidth(int imageWidth) {
	        this.imageWidth = imageWidth;
	    }

	    public int getImageHeight() {
	        return imageHeight;
	    }

	    public void setImageHeight(int imageHeight) {
	        this.imageHeight = imageHeight;
	    }

	    public String getColorCode() {
	        return colorCode;
	    }

	    public void setColorCode(String colorCode) {
	        this.colorCode = colorCode;
	    }
    
        @Override
        public String toString() {
            return "Width is " + imageWidth + " Height is " + imageHeight + " Color code is " + colorCode;
        }

	}

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Image defaultImage = new Image();
        System.out.println(defaultImage);
        Image paramImage = new Image(1920, 1080, "black"); 
        System.out.println(paramImage);
    }
}
