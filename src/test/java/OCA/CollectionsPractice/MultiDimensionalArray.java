package OCA.CollectionsPractice;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1]);
            System.out.println(sb);
        }

        String array[][] = {{"1", "a"}, {"2", "b"}, {"3", "c"}, {"4", "d"}};
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The number of ")
                    .append(array[i][0])
                    .append(" is ")
                    .append(array[i][1]);
            System.out.println(sb);
        }

        String[][][][] array2 = new String[2][2][3][3];
        array2[0][0][0][0] = "1";
        array2[0][0][0][1] = "2";
        array2[0][0][0][2] = "3";
        array2[0][0][1][0] = "4";
        array2[0][0][1][1] = "5";
        array2[0][0][1][2] = "6";
        array2[0][0][2][0] = "7";

        array2[0][1][0][0] = "8";

        //this is legal
        int[] moreStuff[][] = new int[4][4][4];
        moreStuff[0][0][0] = 1;
        moreStuff[0][0][1] = 2;
        moreStuff[0][0][2] = 3;

        for(int i = 0; i < moreStuff.length; i++){
            for(int j = 0; j < moreStuff[i].length; j++){
                for(int k = 0; k < moreStuff[i][j].length; k++){
                    System.out.println(moreStuff[i][j][k]);
                }
            }
        }


        //this will not compile
//        int[][][] moreStuff2 = new int[4][][4]; //this is illegal (compilation error
//        moreStuff2[0][0][0] = 1;
//        moreStuff2[0][3][1] = 2;

    }
}
