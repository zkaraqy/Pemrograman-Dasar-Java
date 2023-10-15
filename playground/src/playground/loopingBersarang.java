package playground;

public class loopingBersarang {

    public static void main(String args[]) {
        // looping bersarang

        /*
        1. 
        
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 
        * * * * * 

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        2. 
        
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        3. 
        
        * * * * * 
          * * * * 
            * * * 
              * * 
                * 

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    break;
                }
                System.out.print("  ");
                if (i == j + 1) {
                    break;
                }
            }
            for (int k = 5; k > 0; k--) {
                System.out.print("* ");
                if (i + 1 == k) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        4. 
        
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        5. 
        
                * 
              * * 
            * * * 
          * * * * 
        * * * * * 

         */
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print("  ");

            }

            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        6. 
        
              *
             * *
            * * *
           * * * *
          * * * * *

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        7. 
        
         * * * * * 
          * * * * 
           * * * 
            * * 
             * 
        
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print(" ");
            }
            for (int j = 5; j > 0; j--) {
                System.out.print("* ");
                if (j == i + 1) {
                    break;
                }
            }

            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        8. 
             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
        
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print(" *");
                if (i == j) {
                    break;
                }
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > 0; j--) {
                System.out.print(" ");
                if ((i + j) == 4) {
                    break;
                } 
            }
            for (int j = 4; j > 0; j--) {
                if (j == i) {
                    break;
                }
                System.out.print(" *");
            }

            System.out.print("\n");
        }

        System.out.print("\n");

        /*
        9. 
        
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
        
         */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
