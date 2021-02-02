package in.bitcode.recyclerview2;

public class Product {

    private int mId;
    private String mTitle;
    private int mImageId;
    private float mPrice;

    public Product(int id, String title, int imageId, float price) {
        this.mId = id;
        this.mTitle = title;
        this.mPrice = price;
        this.mImageId = imageId;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public float getPrice() {
        return mPrice;
    }

    public void setPrice(float price) {
        this.mPrice = price;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
