public class patterns {
   public static void main(String[] args) {
       int n = 5;
       // solid square pattern-1
      /* for(int row=1;row<=n;row++){
         for(int col=1;col<=n;col++) {

             System.out.print("* ");
         }
           System.out.println();
       }*/


// solid left half pyramid-2
    /*   for(int row=1;row<=n;row++){
           for(int col=1;col<=row;col++) {

               System.out.print("* ");
           }
           System.out.println();
       }*/


       //inverted left half pyramid-3
     /*  for(int row=1;row<=n;row++){
           for(int col=1;col<=n-row+1;col++) {

               System.out.print("* ");
           }
           System.out.println();
       }*/

// or
     /*  for(int row=1;row<=n;row++){
           for(int col=n;col>=row;col--) {

               System.out.print("* ");
           }
           System.out.println();
       }*/


//right half pyramid-4
     /*  for (int row = 1; row <= n; row++) {
           for (int col = 1; col <=n-row; col++) {
// spaces
               System.out.print("  ");
           }
           //star
           for(int col=1;col<=row;col++){
               System.out.print("* ");
           }
           System.out.println();
       }*/


     // inverted right half pyramid-5


       /*for (int row = 1; row <= n; row++) {

           // spaces
           for (int col = 1; col <= row - 1; col++) {
               System.out.print("  ");
           }

           // stars
           for (int col = 1; col <= n - row + 1; col++) {
               System.out.print("* ");
           }

           System.out.println();
       }*/


// full pyramid-6
/*for(int row=1;row<=n;row++){
    for(int col=1;col<=n-row;col++){
        System.out.print(" ");
    }
    for(int col=1;col<=2*row-1;col++){
        System.out.print("*");
    }
    System.out.println();
}*/


       //inverted full pyramid-7


       /*for (int row = 1; row <= n; row++) {

           // spaces
           for (int col = 1; col <= row - 1; col++) {
               System.out.print(" ");
           }

           // stars
           for (int col = 1; col <= 2 * (n - row) + 1; col++) {
               System.out.print("*");
           }

           System.out.println();
       }*/



       //diamond-8
       /*for(int row=1;row<=n;row++){
           for(int col=1;col<=n-row;col++){
               System.out.print(" ");
           }
           for(int col=1;col<=2*row-1;col++){
               System.out.print("*");
           }
           System.out.println();
       }

       for (int row = 1; row <= n; row++) {
           if (row== 1) {
               continue;
           }

           // spaces
           for (int col = 1; col <= row - 1; col++) {
               System.out.print(" ");
           }

           // stars
           for (int col = 1; col <= 2 * (n - row) + 1; col++) {
               System.out.print("*");
           }

           System.out.println();
       } */
 //hollow square-9
      /*for (int row = 1; row <= n; row++) {

           for (int col = 1; col <= n; col++) {

               if (row == 1 || row == n || col == 1 || col == n) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }

           System.out.println();
       }*/
//hollow pyramid-10


       for (int row = 1; row <= n; row++) {

           // 1. Left spaces
           for (int col = 1; col <= n - row; col++) {
               System.out.print(" ");
           }

           // 2. Stars and inside spaces
           for (int col = 1; col <= 2 * row - 1; col++) {

               if (col == 1 || col == 2 * row - 1 || row == n) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }



           System.out.println();
       }


//inverted hollow pyramid-11

      /* for (int row = 1; row <= n; row++) {

           // Left spaces
           for (int col = 1; col < row; col++) {
               System.out.print(" ");
           }

           // Stars / middle spaces
           for (int col = 1; col <= 2 * (n - row) + 1; col++) {

               if (row == 1 || col == 1 || col == 2 * (n - row) + 1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }

           System.out.println();
       }
*/

       //butterfly beautyfully-12


// Upper half
     /*  for (int row = 1; row <= n; row++) {

           // Left stars
           for (int col = 1; col <= row; col++) {
               System.out.print("*");
           }

           // Middle spaces
           for (int col = 1; col <= 2 * (n - row); col++) {
               System.out.print(" ");
           }

           // Right stars
           for (int col = 1; col <= row; col++) {
               System.out.print("*");
           }

           System.out.println();
       }

// Lower half
       for (int row = n; row >= 1; row--) {
           if(row==n){
               continue;
           }

           // Left stars
           for (int col = 1; col <= row; col++) {
               System.out.print("*");
           }

           // Middle spaces
           for (int col = 1; col <= 2 * (n - row); col++) {
               System.out.print(" ");
           }

           // Right stars
           for (int col = 1; col <= row; col++) {
               System.out.print("*");
           }

           System.out.println();
       }
*/
   }
}



