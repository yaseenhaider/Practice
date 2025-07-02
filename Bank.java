class Supplier {
    int supplierID;
    String SupplierName;


public Supplier(int ID,String name) {
    this.supplierID = ID;
    this.SupplierName = name;

}
}
class Shipment{
    int shipID;
    int shipDate;
    int shipTime;
    String shipAddress;

    public void shipment(int ID, int Date, int Time, String Address){
        this.shipID=ID;
        this.shipDate=Date;
        this.shipTime=Time;
        this.shipAddress=Address;

    }

}
//You are requird to construct a funnctional DBMS for the Ammunition delivery to different Houthi Ordience lines/units in yehman throw sea routes.use the ERD below for design.normalize the relation before implimentation into 3NF.You will need to create a form that select a supplier,customer,product and then the customer submit the order for product.achieve a better quality and cost but keep the deadline on first  priority.supplier has attribute:supplierID,supplierName ,Shipment has attribute :shipmentID,ShipmentDate,ShipmentTime,destination address .origin address ,quantity bill.item has attribute itemID,itemname,itemquantity,weight,unit price,total price,item deadline .product has attribute has attribute:productid,productname,product_price,date manufactured,date sent,product deadline.order has attribute:orderid,order detail,date recived,order ammount.deadline.customer has attribute:customerid customer name,address