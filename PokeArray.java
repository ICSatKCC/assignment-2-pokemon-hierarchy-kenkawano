import java.util.*;

public class PokeArray{
   public static void main(String[] args){
     Scanner userIn = new Scanner (System.in);
     String inString = new String("");
     boolean menuloop = true;
	 int counter = 0;
	 private ArrayList<Pokemon> pokemonArray = new ArrayList<>();
      
     while(menuloop = true){
         
         
         System.out.println("1. Add a Pokemon");
         System.out.println("2. Print all Pokemon");
         System.out.println("0. Exit the program");
         System.out.println("\nWhat would you like to do?");
         
         inString = userIn.nextLine();
         
         inString = inString.trim();
         
         switch(inString){
            case "1":
               System.out.println("1. Bulbasaur");
               System.out.println("2. Venusaur");
               System.out.println("3. Ivysaur");
               System.out.println("4. Charmander");
               System.out.println("5. Charmeleon");
               System.out.println("6. Charizard");
               System.out.println("7. Squirtle");
               System.out.println("8. Wartortle");
               System.out.println("9. Blastoise");
               inString = userIn.nextLine();
               inString = inString.trim();
               switch(inString){
                  case "1": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Bulbasaur a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Bulbasaur's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Bulbasaur(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Bulbasaur());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "2": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Ivysaur a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Ivysaur's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Ivysaur(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Ivysaur());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "3": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Venusaur a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Venusaur's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Venusaur(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Venusaur());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "4": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Charmander a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Charmander's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Charmander(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Charmander());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "5": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Charmeleon a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Charmeleon's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Charmeleon(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Charmeleon());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "6": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Charizard a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Charizard's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Charizard(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter,new Charizard());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "7":
					 counter = counter%6;
					 System.out.println("Would you like to give your Squirtle a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Squirtle's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Squirtle(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Squirtle());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
                  case "8": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Wartortle a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Wartortle's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Wartortle(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter, new Wartortle());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
				  case "9": 
					 counter = counter%6;
					 System.out.println("Would you like to give your Blastoise a nickname?(Y/N)");
					 inString = user.nextLine();
					 inString = inString.trim();
					 if(inString == "Y"){
						 System.out.prinln("What is Blastoise's nickname?")
						 inString = userIn.nextLine();
						 pokemonArray.add(counter, new Blastoise(inString));
						 counter++;
					 }
					 else if(inString == "N"){
						 pokemonArray.add(counter,new Blastoise());
						 counter++;
					 }
					 else{
						 System.out.prinln("Invalid response.");
					 }
					 break;
				  default:
					 System.out.prinln("Invalid response.");
					 break;
			   }
			   break;
            case "2":break;
            case "0":
				System.out.println("Ending program.")
				menuloop = false;
				break;
				
			default:
				System.out.prinln("Invalid response.")
				break;
		 }
	  }
	}
}
