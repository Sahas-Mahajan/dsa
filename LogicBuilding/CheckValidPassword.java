package LogicBuilding;

public class CheckValidPassword {
    public static void main(String args[]){
        String password = "Admin@123";

        if(password.length() < 8){
            System.out.println("Not Valid Password");
            return;
        }

        boolean flag = false;
        for(int i = 0; i < password.length(); i++){
            if(password.length() >= 8){
                if(Character.isDigit(password.charAt(i))){
                    flag = true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Not Valid Password");
        }

    }
}
