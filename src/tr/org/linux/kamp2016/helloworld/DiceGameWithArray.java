package tr.org.linux.kamp2016.helloworld;
/* Uncompleted version of DiceArrayGame. Homework!!! */
public class DiceGameWithArray  {
	public static void main (String args[]) {
		// create two Die objects
		int[] playerGroup = new int[10];
		
		for(int i=0;i<playerGroup.length;i++){
			DiceArray zar = new DiceArray();
			zar.roll();
			playerGroup[i] = zar.getFaceValue();
			System.out.println("Player#" + (i+1) + " : " + playerGroup[i]);
		}
		
		int max = 0;
		
		int[] kazananlar= new int[10];
		int counter = 0;
		
		for(int i=0; i < playerGroup.length;i++){
			if(playerGroup[i]>=max){
				max = playerGroup[i];
			}
		}
		for(int i=0; i < playerGroup.length;i++){
			if(playerGroup[i]>=max){
				//max = playerGroup[i];
				kazananlar[counter] = i+1;
				counter++;
			}
		}

		
		System.out.print(max+" ile kazanan: ");
		for(int i = 0; i < counter;i++){		
		
		System.out.print( "Player#"+ (kazananlar[i]) + " ");
		}

	}
	
	
}
