package Hoja4;
public class Ejercicio17 {
    void main(){

        int divisible;
        for (int i =1; i <= 200; i++){
            if (i % 2 == 0){
                 divisible = i;
                IO.println(divisible+" es divisible entre 2");
            } else if (i % 3 ==0){
                 divisible = i;
                IO.println(divisible+" es divisible entre 3");
            }
        }
    }
}
