package assignments.assign01;

public class Lcm_Hcf {

    public static void findHcfAndLCM(int num1,int num2){
        int lcm =0;
        int hcf=0;
        int max = Math.max(num1,num2);

        for(int i=1; i<max; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static void main(String[] args) {
        findHcfAndLCM(32,64);
    }
}
