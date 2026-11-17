import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


class main{
    void task1(){
        // TASK1
        System.out.println("--TASK1---");
        int[][] arr = new int[8][8];

        // Initialize random array
        System.out.println("The random matrix [8x8]");
        System.out.println();
        for(int temp[] : arr)
        {
            for(int i = 0; i< temp.length; i++)
            {   
                temp[i] = (int) (Math.random() *100);
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }
        System.out.println('\n');

        // Sum up the first diagonal
        int arrIndex = 0;
        int sum1 = 0;
        for(int temp[] : arr)
        {
            sum1 += temp[arrIndex];
            arrIndex ++;
        }
        System.out.println("The sum of first diagonal: " + sum1);

        // Sum up the second diagonal (for-each loop)
        arrIndex = arr.length - 1;
        int sum2 = 0;
        for (int[] temp : arr) {
            sum2 += temp[arrIndex];
            arrIndex--;
        }
        System.out.println("The sum of second diagonal: " + sum2);

    }

    
   void task2(){

   }


   void task3(){

   }


   void task4(){

        // TASK4
        System.out.println("--TASK4---");
        int[][] ttt = new int[3][3];

        /// Logical assumptions before the biginning:
            // if  ttt[...][...] == 0  -> we can play here 
            // if  ttt[...][...] == 1  -> true is already here  (X) isX
            // if  ttt[...][...] == 2  -> false is already here (O) isX

            
        //draw
        System.out.println("Drawing of the board prime:\n");
        int position = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(position + " | ");
                position++;
            }
            System.out.println("\n-----------");
        }
        System.out.println();





        // The game
        boolean isX = false;
        for(int[] bot_play : ttt){
            for(int i = 0; i < ttt.length; i++){
                int play = (int)(Math.random()*100);
                int field = ThreadLocalRandom.current().nextInt(0, 8 + 1);

                //int position = 0;
                // We need to understand on which ttt[...][...] we work on
                //if field = 0 -> ttt [0][0]
                //if field = 1 -> ttt [0][1]
                //if field = 2 -> ttt [0][2]
                //if field = 3 -> ttt [1][0]
                //if field = 4 -> ttt [1][1]
                //if field = 5 -> ttt [1][2]
                //if field = 6 -> ttt [2][0]
                //if field = 7 -> ttt [2][1]
                //if field = 8 -> ttt [2][2]
            









                
                if(ttt[field][field] != 0){
                    for(int j = 0; j < ttt.length; j++){
                        //// Fill all the numbers up to ttt[...][...] (the randomNum ( the field I need to play at))with " "
                        
                        // its X
                        if(play%2 == 0){
                            isX = true;
                            System.out.print(" X ");
                        }
                        // its O
                        else {
                            System.out.print(" O ");
                        }
                    }
                }
                else
                    continue;
                    




                // // check if index at ttt[field] != 0
                // //     then play
                // //     else try again

                // // // //прописать костылями [0-2] [3-5] [6-8]
                // // // //[0-2]
                // // if(0<=randomNum && randomNum<=2){
                // //     if(ttt[0][randomNum] != 0){
                // //         // its X
                // //         if(play%2 == 0){
                // //             isX = true;
                // //             System.out.print(" X ");
                // //         }
                // //         // its O
                // //         else {
                // //             System.out.print(" O ");
                // //         }
                // //     }
                // //     else
                // //         continue;
                // // }
                
                // // //[3-5]
                // // if(3<=randomNum && randomNum<=5){
                // //     if(ttt[0][randomNum] != 0){
                // //         // its X
                // //         if(play%2 == 0){
                // //             isX = true;
                // //             System.out.print(" X ");
                // //         }
                // //         // its O
                // //         else {
                // //             System.out.print(" O ");
                // //         }
                // //     } 
                // //     else
                // //         continue;
                // // }
                
                // // //[6-8]
                // // if(6<=randomNum && randomNum<=8){
                // //     if(ttt[0][randomNum] != 0){
                // //         // its X
                // //         if(play%2 == 0){
                // //             isX = true;
                // //             System.out.print(" X ");
                // //         }
                // //         // its O
                // //         else {
                // //             System.out.print(" O ");
                // //         }
                // //     }
                // //     else
                // //         continue;
                // // }
                
                

            }
        }

   }
   
   
   void main(){
        int TASK1 = 0;
        int TASK2 = 0;
        int TASK3 = 0;
        int TASK4 = 1;

        if(TASK1 == 1)
            task1();
        else if(TASK2 == 1)
            task2();
        else if(TASK3 == 1)
            task3();
        else if(TASK4 == 1)
            task4();
        else if(TASK1 == 0 && TASK2 == 0 && TASK3 == 0 &&TASK4 == 0)
            System.out.println("All tasks are disabled");


        // TASK1
//endof task1

        // TASK4
//endof task4


    }
}