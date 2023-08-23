package OCA.Loops;

public class Challenge {

    public static void main(String[] args) {

        outer_label:
        while(true){
            int z = 0;
            while(true){
                if(z >= 10){
                    break outer_label;
                }else{
                    System.out.println(z++);
                }
            }
        }

    }
}
