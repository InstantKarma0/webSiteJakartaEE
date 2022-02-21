package bdd.beans;

public class Article {

    private int id;
    private String imgUrl;
    private String title;
    private String description;
    private float price;

    public Article(String imgUrl, String title, String description, float price) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public Article(int id, String imgUrl, String title, String description, float price) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
