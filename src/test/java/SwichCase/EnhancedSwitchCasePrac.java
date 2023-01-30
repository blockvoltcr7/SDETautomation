package SwichCase;

public class EnhancedSwitchCasePrac {


    public static void main(String[] args) {
        int stage = 3;

        String season = switch(stage){
            case 0 -> "spring";
            case 1 -> "summer";
            case 2 -> "fall";
            case 3 -> "winter";
            default -> {
                System.out.println("season value is not what is expected");
                yield "invalid stage";
            }
        };

        System.out.println(season);
    }
}
