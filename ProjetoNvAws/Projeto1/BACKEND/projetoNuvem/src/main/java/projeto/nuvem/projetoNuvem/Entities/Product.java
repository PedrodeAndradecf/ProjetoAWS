package projeto.nuvem.projetoNuvem.Entities;

public class Product {
    private String name;
    private String description;
    private String image;
    private String brand;
    private String expirationDate;
    private String category;

    public Product(String name, String description, String image, String brand, String expirationDate, String category){
        this.name = name;
        this.description = description;
        this.image = image;
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
