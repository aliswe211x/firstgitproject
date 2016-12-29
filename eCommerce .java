import java.util.Enumeration;


public class eCommerce {

public String name;
public int cost; 

public eCommerce(String name, int cost){
	this.name =name;
	this.cost=cost;
}

public sell(){
	
	
}

public String statement(int amount[],int types[]) {
    double totalAmount = 0;
    int frequentbuyerPoints = 0;
      //final static int[] t1 ={1,2,3,4,5};
    String result = "Rental Record for " + name + "\n";
    for(int i=0;i<amount.length;i++) {
        double thisAmount = 0;
      
        //determine amounts for each line
        switch (types[i]) {
            case 0:
                thisAmount += 2;
                if (amount[i] > 500)
                    thisAmount += amount[i] * 1.5;
                break;
            case 1:
                thisAmount += amount[i] * 3;
                break;
            case 2:
                thisAmount += 1.5;
                if (amount[i] > 3)
                    thisAmount += (amount[i] - 3) * 1.5;
                break;

        }
        totalAmount += thisAmount;

        // add frequent buyer points
        frequentbuyerPoints ++;
        // add bonus 
        if ((frequentbuyerPoints == 10) && totalAmount > 5000)
        	frequentbuyerPoints =frequentbuyerPoints*10;

        //show figures for this rental
        result += "\t" + name+ "\t" + String.valueOf(totalAmount) + "\n";

    }
    //add footer lines
    result +=  "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentbuyerPoints) + " frequent buyer points";
    return result;

}
}
