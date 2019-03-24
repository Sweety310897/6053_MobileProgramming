package com.example.shoppingcart;

public class Data {
    String productid,category,maincategory,suppliername,weightunit,description,name,productpicurl,status,uom,currencycode,dimunit;
    int quantity;
    double weightmeasure,price,width,height,depth;

    Data(String name, String category) {
        this.productid = productid;
        this.category  = category;
        this.maincategory= maincategory;
        this.suppliername = suppliername;
        this.weightunit =weightunit;
        this.description= description;
        this.name = name;
        this.productpicurl = productpicurl;
        this.status = status;
        this.uom = uom;
        this.currencycode= currencycode;
        this.dimunit=   dimunit;
        this.quantity=quantity;
        this.weightmeasure= weightmeasure;
        this.price = price;
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    public String getCategory() {
        return category;
    }

    public String getMaincategory() {
        return maincategory;
    }

    public String getProductid() {
        return productid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public String getDescription() {
        return description;
    }

    public double getDepth() {
        return depth;
    }

    public String getName() {
        return name;
    }

    public String getProductpicurl() {
        return productpicurl;
    }

    public String getWeightunit() {
        return weightunit;
    }

    public String getStatus() {
        return status;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public double getWeightmeasure() {
        return weightmeasure;
    }

    public String getCurrencycode() {
        return currencycode;
    }

    public String getUom() {
        return uom;
    }

    public double getWidth() {
        return width;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDimunit() {
        return dimunit;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaincategory(String maincategory) {
        this.maincategory = maincategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public void setProductpicurl(String productpicurl) {
        this.productpicurl = productpicurl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWeightunit(String weightunit) {
        this.weightunit = weightunit;
    }

    public void setCurrencycode(String currencycode) {
        this.currencycode = currencycode;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public void setDimunit(String dimunit) {
        this.dimunit = dimunit;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeightmeasure(double weightmeasure) {
        this.weightmeasure = weightmeasure;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
