import java.util.*;
class Window{
    public void wind1(){
        System.out.println("Welcome to Banking System !!!");
        // System.out.println("1. Sign Up");
        System.out.println("1. Sign In");
        // System.out.println("3. Delete Account");
        System.out.println("2. Exit");
        System.out.println("Enter your choice:- ");
    }

    public void wind2(){
        System.out.println("Welcome to Banking System !!!");
        // System.out.println("1. Create Bank Account");
        // System.out.println("2. Delete Bank Account");
        System.out.println("1. Check Bank Account Details");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Transfer Money");
        System.out.println("5. Exit"); 
        System.out.println("Enter your choice:- ");       
    }
}

class Det{
    String name;
    String email;
    String pass;

    public Det(String name, String email, String pass){
        this.name=name;
        this.email=email;
        this.pass=pass;
        System.out.println("Name;- "+name+" Email:- "+email+" Pass:- "+pass);
    }
    
}

class Main{
    public static void main(String args[]){
        
        Det d1 = new Det("Ram","abc@gmail.com","123");
        Det d2 = new Det("Shyam","ss@gmail.com","ss124");
        Det d3 = new Det("Ramesh","ramesh@gmail.com","ramesh1814");
        Det d4 = new Det("Suresh","suresh@gmail.com","srs123");
        Det d5 = new Det("Dhruv","patel@gmail.com","dp758");
        
        ArrayList<Det> details = new ArrayList<>();
        
        details.add(d1);
        details.add(d2);
        details.add(d3);
        details.add(d4);
        details.add(d5);
        
        String a = "Ram";
        if (details.get(0).name == a){
            System.out.println("Hello");
        }
        // System.out.println("\n"+details.get(1).name);
        // System.out.println(details);
        
        Window w = new Window();
        w.wind1();
        
        
        Scanner s1 = new Scanner(System.in);
        int ch1;
        ch1=s1.nextInt();
        
        // Sign in
        
        if (ch1==1){
            String email1,b;
            System.out.println("Enter your email:- ");
            Scanner s3 = new Scanner(System.in);
            email1=s3.nextLine();
            
            System.out.println("Enter Password:- ");
            Scanner s4 = new Scanner(System.in);
            b=s4.nextLine();
            
            for(int i=0;i<5;i++)
            {
                // System.out.println(details.get(i).email);
                if (details.get(i).email == "abc@gmail.com")
                {
                   if (details.get(i).pass == "123")
                    {
                        System.out.println("\nWelcome "+details.get(i).name+" !!!");
                        System.out.println("\n");
                        w.wind2();
                    }
                    else
                    {
                        System.out.println("Password is INCORRECT !!!");
                        w.wind1();
                    }
                    break;
                    
                }
                else
                {
                    if (i==4)
                    {
                        System.out.println("Account not Registered !!!");
                        break;
                    }
                    
                }
            }
            
        }
        
        // Exit
        
        else if (ch1==2){
            System.out.println("Thank You for visiting us !!!");
            // break;
        }
        
        else{
            System.out.println("Please Enter a Valid Choice !!!");
            // break;
        }
    }
}
