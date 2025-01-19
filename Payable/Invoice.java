package Payable;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        partNumber = partNumber;
        partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }
    
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setQuantity(int quantity){
        this.quantity=(quantity<0) ? 0 : quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = (pricePerItem <0.0) ? 0.0 : pricePerItem;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public String toString(){
        return String.format("%s: \n%s: %s (%s)\n%s: %d \n%s: $%, .2f","invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(),  pricePerItem, getPricePerItem() );

    }

    public double getPaymentAmount(){
        return getQuantity()*getPricePerItem();
    }

    
}
