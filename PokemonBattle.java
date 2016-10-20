import java.util.*;

public class PokemonBattle{
   public static void main(String[] args){
   Scanner userIn = new Scanner (System.in);
   String inString = new String("");
   ArrayList<Pokemon> battleArray = new ArrayList<Pokemon>();
   boolean loop = true;
   while(loop){
   System.out.println("Player 1 choose a pokemon.");
   System.out.println("1. Bulbasaur");
   System.out.println("2. Ivysaur");
   System.out.println("3. Venusaur");
   System.out.println("4. Charmander");
   System.out.println("5. Charmeleon");
   System.out.println("6. Charizard");
   System.out.println("7. Squirtle");
   System.out.println("8. Wartortle");
   System.out.println("9. Blastoise");
   System.out.println("10. Eevee");
   System.out.println("11. Vaporeon");
   System.out.println("12. Jolteon");
   System.out.println("13. Flareon");
   inString = userIn.nextLine();
   inString = inString.trim();
   switch(inString){
      case"1":
         battleArray.add(new Bulbasaur());
         loop = false;
         break;
      case"2":
         battleArray.add(new Ivysaur());
         loop = false;
         break;      
      case"3":
         battleArray.add(new Venusaur());
         loop = false;
         break;      
      case"4":
         battleArray.add(new Charmander());
         loop = false;
         break;            
      case"5":
         battleArray.add(new Charmeleon());
         loop = false;
         break;            
      case"6":
         battleArray.add(new Charizard());
         loop = false;
         break;            
      case"7":
         battleArray.add(new Squirtle());
         loop = false;
         break;        
      case"8":
         battleArray.add(new Wartortle());;
         loop = false;
         break;        
      case"9":
         battleArray.add(new Blastoise());
         loop = false;
         break;        
      case"10":
         battleArray.add(new Eevee());
         loop = false;         
         break;        
      case"11":
         battleArray.add(new Vaporeon());
         loop = false;
         break;              
      case"12":
         battleArray.add(new Jolteon());
         loop = false;         
         break;              
      case"13":
         battleArray.add(new Flareon());
         loop = false;
         break;
      default:
         System.out.println("Invalid");   
      }
   }
   loop = true;
   while(loop){   
   System.out.println("Player 2 choose a pokemon.");
   System.out.println("1. Bulbasaur");
   System.out.println("2. Ivysaur");
   System.out.println("3. Venusaur");
   System.out.println("4. Charmander");
   System.out.println("5. Charmeleon");
   System.out.println("6. Charizard");
   System.out.println("7. Squirtle");
   System.out.println("8. Wartortle");
   System.out.println("9. Blastoise");
   System.out.println("10. Eevee");
   System.out.println("11. Vaporeon");
   System.out.println("12. Jolteon");
   System.out.println("13. Flareon");
   inString = userIn.nextLine();
   inString = inString.trim();
      switch(inString){
      case"1":
         battleArray.add(new Bulbasaur());
         loop = false;
         break;
      case"2":
         battleArray.add(new Ivysaur());
         loop = false;
         break;      
      case"3":
         battleArray.add(new Venusaur());
         loop = false;
         break;      
      case"4":
         battleArray.add(new Charmander());
         loop = false;
         break;            
      case"5":
         battleArray.add(new Charmeleon());
         loop = false;
         break;            
      case"6":
         battleArray.add(new Charizard());
         loop = false;
         break;            
      case"7":
         battleArray.add(new Squirtle());
         loop = false;
         break;        
      case"8":
         battleArray.add(new Wartortle());;
         loop = false;
         break;        
      case"9":
         battleArray.add(new Blastoise());
         loop = false;
         break;        
      case"10":
         battleArray.add(new Eevee());
         loop = false;         
         break;        
      case"11":
         battleArray.add(new Vaporeon());
         loop = false;
         break;              
      case"12":
         battleArray.add(new Jolteon());
         loop = false;         
         break;              
      case"13":
         battleArray.add(new Flareon());
         loop = false;
         break;
      default:
         System.out.println("Invalid");   
      }
   }
   //while(loop){
   // 1st player chooses attack
   // show damage report
   // check for hp 0 (if hp 0 exit loop)
   // 2nd play chooses attack
   // show damage report
   // check for hp 0 (if hp 0 exit loop)
   //}
   //Announce winner
   //End program

}
}