public class Main {

    public static void main(String[] args){
//        int[] numbers = {23, 45, 67, 12, 67, 34};
//
//        String[] names = {"Juan", "Ana", "Carlos"};
//
//        for(int index = 0; index < names.length; ++index){
//            System.out.println(names[index]);
//        }
//
//
//        for(String name : names){
//            System.out.println(name);
//        }
//
//        int[] numbers = new int[10];
//        boolean[] booleanArray = new boolean[100];
//
//        numbers[5] = 70;
//        numbers[2] = 120;
//
//
//        for(int number : numbers){
//            System.out.println(number);
//        }
//
//        for(boolean flag : booleanArray){
//            System.out.println(flag);
//        }

        int[][] integerMatrix = {
                {1, 2, 3},
                {4, 15, 3},
                {5, 2, 3},
                {6, 2, 3},
                {7, 2, 3}
        };

//        for(int[] array : integerMatrix){
//            System.out.println(array[0]);
//        }

        System.out.println(integerMatrix[1][1]);

        // int[][] checkersBoard = new int[8][8];

        int[][] checkersBoard = {
                {2,0,2,0,2,0,2,0},
                {0,2,0,2,0,2,0,2},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {1,0,1,0,1,0,1,0},
                {0,1,0,1,0,1,0,1}
        };

        System.out.println(checkersBoard[7][7]);





    }

}
