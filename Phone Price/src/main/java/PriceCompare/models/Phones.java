package PriceCompare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Phones {
    @Id
    public ObjectId _id;
    public String name;
    public int price;
    public String type;
    public String shop;
    public String imgUrl;


    // Constructors
    public Phones() {}

    public Phones(ObjectId _id, String name, int price, String type, String shop, String imgUrl) {
        this._id = _id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.shop = shop;
        this.imgUrl = imgUrl;
    }

    // ObjectId needs to be converted to string
    public String get_id() { return _id.toHexString(); }
    public void set_id(ObjectId _id) { this._id = _id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getImgUrl() { return imgUrl; }
    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

    public String getShop() { return shop; }
    public void setShop(String shop) { this.shop = shop; }
}
