public class Cart {

    private int qtyOrdered = 0;

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 20){
            System.out.println("Full cart, no more disc allowed");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("Add disc completely");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        System.out.println("Your cart BEFORE remove: ");
        for(int i=0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
        int count = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i] == disc){
                count++;
                qtyOrdered--;
                for(int j=i; j<qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                i--;
            }
        }
        if(count == 0){
            System.out.println("This disc is not in your cart! No removal was conducted");
        }
        else{
            System.out.println("Removed " + (count + " ") + "successfully");
        }
        System.out.println("Your cart AFTER remove: ");
        for(int i=0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
    }

    public float totalCost(){
        float sum = 0;
        for(int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }



}
