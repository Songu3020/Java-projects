
import java.util.Scanner;

public class Nokia1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    String menu = """
                    1.Phone book
                    2.Messages
                    3.Chat
                    4.Call register
                    5.Show call duration
                    6.Show call cost
                    7.Show call divert
                    8.Games
                    9.Calculator
                   10.Reminders
                   11.Clock
                   12.Profiles
                   13.SIM services
                   0. Exit

                   """;
        System.out.println(menu);
    
        System.out.print("Enter an option: ");
        int phoneMenu = input.nextInt();

        switch(phoneMenu){
            case 1 :{
                 System.out.print("""
                    1.Search
                    2.Service Nos.
                    3.Add name
                    4.Erase
                    5.Edit
                    6.Assign tone
                    7.Send b'card
                    8.Options                  
                    9.Speed dials
                   10.Voice tag
                    0.Back  
                            """);
                 System.out.print("Enter sub option: ");
                 int option = input.nextInt();

                switch(option){
               case 8 :System.out.print("""
                     1. Type of view
                     2. Memory status                        
                                """);break;
                case 0: System.out.print(phoneMenu);
                           }
                    }

                case 2:{
                System.out.print("""
                     1.Write messages
                     2.Inbox
                     3.Outbox
                     4.Picture messages
                     5.Templates
                     6.Smileys
                     7.Message settings
                     8.Info service
                     9.Voice mailbox number
                    10.Service command editor

                                """);
            System.out.print("Enter sub option: ");
            int messagesettings  = input.nextInt();

               switch(messagesettings){

                 case 7:{

                 System.out.print("""
                       1. set 1
                       2. common
                          """);
            System.out.print("Enter a choice: ");
                int setchoice = input.nextInt();

               switch(setchoice){
                    case 1: System.out.print("""
                         1. Message centre number
                         2. Message sent as
                         3. Message validity 

                          """);
            System.out.print("Enter a choice: ");
            int setchoice2 = input.nextInt();

            switch(setchoice2){
                   case 2: System.out.print("""
                        1. Delivery reports
                        2. Reply via same centre
                        3. Character support 
                        0. Exit
                            """);break;}

                  case 3 :   System.out.print("Chat");break;

                  case 4 :{
                        System.out print("""

                        1. Missed calls 
                        2. Received calls
                        3. Dialld numbers
                        4. Erase recent calls lists
                        5. Show call duration
                        6. show call costs
                        7. Call cost settings
                        8. Prepaid credit               

                            """);




}

                                }

{



                }     


                 
                            }

      )
        }
               

                        
            
        


      


