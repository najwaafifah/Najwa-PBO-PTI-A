public class Invoice implements Payable{
    private String productName;
    private int quantity;
    private int pricePerItem;
    
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String toString() {
        return "Nama produk : " + productName + 
                "\nJumlah : " + quantity + 
                "\nHarga per item : " + pricePerItem;
    }
    
    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}
