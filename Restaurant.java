import java.util.Scanner;
public class Restaurant {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] cart=new int[7][3] ;
        String[] menu_name={
                            "Breakfast",
                            "Lunch",
                            "Dinner",
                            "Drinks",
                            "Snacks",
                            "Starter",
                            "Main Course"
        };
        String[][] menu = {
                    // BreakFast
                    {"Masala omelette with toast",
                    "Poha with peanuts and curry leaves",
                    "Idli with coconut chutney"},

                    // Lunch
                    {"Rajma chawal (kidney beans with rice)",
                    "Vegetable biryani with raita",
                    "Chapati with mixed veg sabzi"},

                    // Dinner
                    {"Grilled paneer tikka with salad",
                    "Dal tadka with jeera rice",
                    "Stuffed paratha with curd"},

                    // Drinks
                    {"Lemon shikanji",
                    "Masala chai",
                    "Cold coffee"},

                    // Snack
                    {"Samosa with tamarind chutney",
                    "Roasted makhana (fox nuts)",
                    "Banana chips"},

                    // Starter
                    {"Corn and cheese balls",
                    "Hara bhara kabab",
                    "Tomato basil soup"},

                    // MainCourse
                    {"Manipuri Eromba with steamed rice",
                    null,
                    null
                    }
                };
        int op=0;
        do{ 
        System.out.println("---MENU---");
        System.out.println("1. Breakfast\n2. Lunch\n3. Dinner\n4. Drinks\n5. Snack\n6. Starter\n7. Main Course(Single Signature Dish)\n0. To exit");
        System.out.print("Enter your choice: ");
        op= input.nextInt();
        
        switch (op) {
            case 1://breakfast
            
                System.out.println("Breakfast Items: ");
                System.out.println("1. Masala omelette with toast\r\n" + 
                                   "2. Poha with peanuts and curry leaves\r\n" + 
                                   "3. Idli with coconut chutney\r\n"+
                                   "0. To quit");
                int cart_1 = 0;
                int i=0;
                do {
                    System.out.print("Select your Breakfast items: ");
                    cart_1= input.nextInt();
                    if(cart_1!=0)
                        {
                            cart[0][i]= cart_1;
                            i++;
                        }
                } while(cart_1!=0 && cart_1<=3);
                break;
            case 2://lunch
                System.out.println("Lunch Items: ");
                System.out.println( "1. Rajma chawal (kidney beans with rice)\r\n" +
                                    "2. Vegetable biryani with raita\r\n" +
                                    "3. Chapati with mixed veg sabzi\r\n" +
                                    "0. To quit");
                i=0;
                int cart_2=0;
                do {
                    System.out.print("Select your Lunch items: ");
                    cart_2= input.nextInt();
                    if(cart_2!=0)
                        {
                            cart[1][i]= cart_2;
                            i++;
                        }
                } while(cart_2!=0 && cart_2<=3);
                break;
            case 3://dinner
                System.out.println("Dinner Items: ");
                System.out.println( "1. Grilled paneer tikka with salad\r\n" +
                                    "2. Dal tadka with jeera rice\r\n" +
                                    "3. Stuffed paratha with curd\r\n" +
                                    "0. To quit");
                i=0;
                int cart_3=0;
                do {
                    System.out.print("Select your Dinner items: ");
                    cart_3= input.nextInt();
                    if(cart_3!=0)
                        {
                            cart[2][i]= cart_3;
                            i++;
                        }
                } while(cart_3!=0 && cart_3<=3);
                break;
            case 4://Drinks
                System.out.println("Drinks Items: ");
                System.out.println( "1. Lemon shikanji\r\n" +
                                    "2. Masala chai\r\n" +
                                    "3. Cold coffee\r\n" +
                                    "0. To quit");
                i=0;
                int cart_4=0;
                do {
                    System.out.print("Select your Drinks items: ");
                    cart_4= input.nextInt();
                    if(cart_4!=0)
                        {
                            cart[3][i]= cart_4;
                            i++;
                        }
                } while(cart_4!=0 && cart_4<=3);
                break;
            case 5://Snacks
                System.out.println("Snacks Items: ");
                System.out.println( "1. Samosa with tamarind chutney\r\n" +
                                    "2. Roasted makhana (fox nuts)\r\n" +
                                    "3. Banana chips\r\n" +
                                    "0. To quit");
                i=0;
                int cart_5=0;
                do {
                    System.out.print("Select your Snacks items: ");
                    cart_5= input.nextInt();
                    if(cart_5!=0)
                        {
                            cart[4][i]= cart_5;
                            i++;
                        }
                } while(cart_5!=0 && cart_5<=3);
                break;
            case 6://starter
                System.out.println("Starter Items: ");
                System.out.println( "1. Corn and cheese balls\r\n" +
                                    "2. Hara bhara kabab\r\n" +
                                    "3. Tomato basil soup\r\n" +
                                    "0. To quit");
                i=0;
                int cart_6=0;
                do {
                    System.out.print("Select your Starter items: ");
                    cart_6= input.nextInt();
                    if(cart_6!=0)
                        {
                            cart[5][i]= cart_6;
                            i++;
                        }
                } while(cart_6!=0 && cart_6<=3);
                break;
            case 7://main course
                System.out.println("Main Course Items: ");
                System.out.println( "1. Manipuri Eromba with steamed rice\r\n" +
                                    "0. To quit");
                i=0;
                int cart_7=0;
                do {
                    System.out.print("Select your Main Course items: ");
                    cart_7= input.nextInt();
                    if(cart_7!=0)
                        {
                            cart[6][i]= cart_7;
                            i++;
                        }
                } while(cart_7!=0 && cart_7<=1);
                break;
        
            default: System.out.println("Thank you for visiting our Restuarant");
                break;
        }
    }while(op!=0);
    
    for (int i = 0; i < 7; i++) {
    boolean hasItems = false;

    // Check if any item is selected in this category
    for (int j = 0; j < 3; j++) {
        if (cart[i][j] != 0) {
            hasItems = true;
            break;
        }
    }

    // Print only if the category has selected items
    if (hasItems) {
        System.out.println(menu_name[i] + ":");
        for (int j = 0; j < 3; j++) {
            int itemIndex = cart[i][j] - 1;
            if (cart[i][j] != 0 && itemIndex >= 0 && itemIndex < menu[i].length && menu[i][itemIndex] != null) {
                System.out.println("\t- " + menu[i][itemIndex]);
            }
        }
        System.out.println();
     }
    }
    }

}
/*
 * not an efficient code , lack tracking selected items in a cart, 
 * cause duplicate selction of items
 * after all, the program code follows the basic 
 * by using :-
 * [Switch case, 2D- Array, Boolean , conditional statement]
 * 
 */
