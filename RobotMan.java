import java.util.*;
class RobotMan
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Hello I am your robot man \nToday I will ask you some questions and regarding your reply I am going to judge you\nOK,Ready\nLet get started ");
        System.out.println("Q.Write your full name");
        String name=sc.nextLine();
        System.out.println("Q.How old are you  "+name);
        int old=sc.nextInt();
        if(old>=10)
        {
            System.out.println("welcome to our quiz "+name);
            System.out.println("Q.In which category you fall \"female ,male or others\"");
            String c=sc.next();
            System.out.println("(REQUEST)Please give your answers in\"yes/y or no/n\"");
            System.out.println("Q."+name+" do you have the habit to eat at night");
            String night=sc.next();
            if(night.equalsIgnoreCase("yes")||night.equalsIgnoreCase("y"))
            {
                System.out.println("(REPLY)you are burnded by this world.......please be happy and enjoy your life");

            }
            else 
            {
                System.out.println("(REPLY)my dear this means you are very cool person ");
            }
            System.out.println("");
            System.out.println("Q."+name+" do you have any Girlfrind or Boyfriend");
            String gb=sc.next();
            if(gb.equalsIgnoreCase("yes")||gb.equalsIgnoreCase("y"))
            {
                System.out.println("(REPLY)ohhh!!!!you have a soulmate.Enjoy but be responsible also");
                System.out.println("Q."+name+" have you discussed your relation ship with your parents");
                String dis=sc.next();
                if(dis.equalsIgnoreCase("yes")||dis.equalsIgnoreCase("y"))
                {
                    System.out.println("(REPLY)oh!!!! you have so much of gucts.Then enjoy your life.");
                }
                else
                {
                    System.out.println("(SUGGETION)PLEASE tell to your parents or soon your relationship will be broken.");
                }
                 System.out.println("");
            }
            else
            {
                System.out.println("(REPLY)oh!!you are single then you are strongest person in this world.");

            }
             System.out.println("");
            System.out.println("Q."+name+" Is your height is above 5 feet" );
            String height=sc.next();
            if(height.equalsIgnoreCase("yes")||height.equalsIgnoreCase("y"))
            {
                System.out.println("(REPLY)Your personality is very good but keep trying for better or you will be not able \nto touch the moon ");

            }
            else
            {
                System.out.println("(SUGGETION)No problem with your height.ITS just your height not your life.Your height is not short it is cute but listen do not go too close to small children it is for your benefit");

            }
             System.out.println("");
            System.out.println("Q."+name+" It is very important question.\nIt will test your behaviour.\nYou carry your bag behind your back");
            String be=sc.next();
            if(be.equalsIgnoreCase("yes")||be.equalsIgnoreCase("y"))
            {
                System.out.println("(ANSWERED)WOW!!!!~you you are ready for adventure in your life.\nYou are confident one.Its nice─");
            }
            else
            {
                System.out.println("(ANSWERED)you are week one and not so confident");
            }
             System.out.println("");
            System.out.println("Q."+name+" Ever  in your life have you send and inappropriate message to your parents.");
            String life=sc.next();
             System.out.println("");
            if(life.equalsIgnoreCase("yes")||life.equalsIgnoreCase("y")) 
            {
                System.out.println("Q."+name+" first answer me that you are stupid or not" );
                String stupid=sc.next();
                if(stupid.equalsIgnoreCase("yes")||stupid.equalsIgnoreCase("y"))
                {
                    System.out.println("(JUST KIDDING)hahahah That is why you have done that.");
                }
                else
                {
                    System.out.println("(JUST KIDDING)I know that you are stupid that is why you have done that");
                }
                 System.out.println("");
            }
            else
            {
                System.out.println(" Q."+name+" First tell me that you have sense or not");
                String se=sc.next();
                if(se.equalsIgnoreCase("yes")||se.equalsIgnoreCase("y"))
                {
                    System.out.println("(APPRECIATING)That is why you are careful person.\nGood job because most of the people have done this in their life.");
                }
                else
                {
                    System.out.println("(WARNING)So you are going to do this in your future as you are intruder");
                }
                 System.out.println("");
            }
            System.out.println("☻From now you can answer in your words");
            String w=sc.nextLine();
            System.out.println("Q.Which is your fav cartoon "+name);
            String ca=sc.nextLine();
            

            if(ca.equalsIgnoreCase("Doraemon"))
            {
                System.out.println("(REACTION)you are very innovative person");
                

            }
            else if (ca.equalsIgnoreCase("chota bheem"))
            {
                System.out.println("(REACTION)you have gud fighting skills");
                
            }
            else if(ca.equalsIgnoreCase("Shin chan"))
            {
                System.out.println(" (REACTION)you are funky and naughty and lazy");
                
            }
            else if(ca.equalsIgnoreCase("micky mouse"))
            {
                System.out.println("(REACTION)you like to search things");
                
            }
            else if(ca.equalsIgnoreCase("dora the explorar"))
            {
                System.out.println("(REACTION) You are adventurous person");
                
            }
            else if(ca.equalsIgnoreCase("Shiva"))
            {
                System.out.println("(REACTION) You are intelligent person");
                
            }
            else if(ca.equalsIgnoreCase("kungfu warriors"))
            {
                System.out.println("(REACTION) You are kungfu loving person");
                
            }
            else if(ca.equalsIgnoreCase("motu patlu"))
            {
                System.out.println("(REACTION) You are very friendly person");
                
            }
            else if(ca.equalsIgnoreCase("chacha chaudhary"))
            {
                System.out.println("(REACTION) You have osm IQ level");
               
            }
            else if(ca.equalsIgnoreCase("inspector chingum"))
            {
                System.out.println("(REACTION)You are Smart and courageous");
                
            }
            else if(ca.equalsIgnoreCase("rudra"))
            {
                System.out.println("(REACTION) You love  magic");
                
            }
            else if(ca.equalsIgnoreCase("perman"))
            {
                System.out.println("(REACTION)You love saving this world is your dream");
                
            }
            else if(ca.equalsIgnoreCase("hagemaru"))
            {
                System.out.println("(REACTION) You are clothless bacchaa hahaahah");
                
            }
            else if(ca.equalsIgnoreCase("pokemon"))
            {
                System.out.println("(REACTION) You are trainer. Gud choice dear");
                
            }
            else if(ca.equalsIgnoreCase("avengers"))
            {
                System.out.println("(REACTION) You are rocky person and love to do dangerous things"); 
              
            }
            else if(ca.equalsIgnoreCase("Spider man"))
            {
                System.out.println("(REACTION)science lover...wow");  
                
            }
            else if(ca.equalsIgnoreCase("little krishna"))
            {
                System.out.println("(REACTION)for u GOD is first thing and then all things come");
                
            }
            else if(ca.equalsIgnoreCase("roll no.21"))
            {
                System.out.println("(REACTION)You are idiot but best");  
                
            }
            else if(ca.equalsIgnoreCase("transformers"))
            {
                System.out.println("(REACTION) You are ugly but brave");  
               
            }
            else if(ca.equalsIgnoreCase("ninja hattori"))
            {
                System.out.println("(REACTION)friends forever");  
               
            }
            else if(ca.equalsIgnoreCase("fukrey boys"))
            {
                System.out.println("(REACTION)naughty friends forever");  
               
            }
            else if(ca.equalsIgnoreCase("tom and jerry"))
            {
                System.out.println("(REACTION)best friends");  
                
            }
            else if(ca.equalsIgnoreCase("oggy and cockroaches"))
            {
                System.out.println("(REACTION)funny relationship person");  
                
            }
            else if(ca.equalsIgnoreCase("pakdam pakdai"))
            {
                System.out.println("(REACTION) You always want some naghty things to do");  
                
            }
            else if(ca.equalsIgnoreCase("frozen"))
            {
                System.out.println("(REACTION) You want to go to barbie world");  
               
            }

            else
            {
                System.out.println("(REACTION)you are very different person and useful person");  
            }
             System.out.println("");
            System.out.println("Q."+name+" Answer this question\n I am your sister but you are not my sister\nWho I am");
            String sis=sc.nextLine();
            if(sis.equalsIgnoreCase("brother"))
            {
                System.out.println("(RESPONSE)WOW☻!!you are intelligent person but not enough...yo");  
                count++;
            }
            else
            {
                System.out.println("WRONG\n(RESPONSE)What a fool person you are .You can't even answer this question .\nOK no problem try next");

            }
             System.out.println("");
            System.out.println("Q."+name+" when that animal speaks it seems that it is saying\"CAN I COME\"\nName the animal ");
            String shorter=sc.nextLine();
            if(shorter.equalsIgnoreCase("cat"))
            {
                System.out.println("(APPRICIATING)your IQ level is great .you can pass IS interview\thahahhaa"); 
                count++;
            }
            else
            {
                System.out.println("WRONG\n(SUGGETION)you are WEEK but don't worry most of the people are like you..\nCorrect answer is CAT");

            }
             System.out.println("");
            System.out.println("Q."+name+" That river is very egoistic because none of the river is as long as that river ");
            String clock=sc.nextLine();
            if(clock.equalsIgnoreCase("nile"))
            {
                System.out.println("(compliment)you are our next Einstein "); 
                count++;
            }
            else
            {
                System.out.println("WRONG\n(WARNING)no problem \nGo to bed its next level my dear");  
            }
             System.out.println("");
            System.out.println("Q."+name+" There are 90 cups on the table.If one falls down how many are left on the table"); 
            int cups=sc.nextInt();
            if(cups==5)
            {
                System.out.println("(COMPLIMENT) you are our next prime minister ....too gud");
                count++;
            }
            else
            {
                System.out.println("WRONG\n(REPLY)Most people would say 89 but if you can think out of box its is really funny 'nine tea cups' \n(THE ANSWER IS 8)\nPlease go to bed dear it is very compulsory for you .\nyou are tired.\nBECAUSE IT IS NEXT LEVEL");  
            }
             System.out.println("");
             System.out.println("From the previous 5 questions you gave "+count+" answers correct");
             System.out.println("");
            System.out.println("Thank you for playing our quiz \nWe hope you all enjoyed our hardwork☻");  

        }
        else
        {
            System.out.println("you are not eligible to play this quiz because you are very small");
        }
    }

}