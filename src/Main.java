import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character,Integer> slovar = new HashMap<Character, Integer>();
        System.out.println("Введите две строки : ");
        Scanner in=new Scanner(System.in);
        boolean Flag=false;
        String s1=in.next();
        String s2=in.next();
        //ключ-кол-во
        for(int i=0;i<s1.length();i++){
            if(!slovar.containsKey(s1.charAt(i))){
                //если в словаре нет значений данного ключа, то добавляем
                slovar.put(s1.charAt(i),1);
            }
            //иначе просто прибавляем +1 к кол-ву
            else slovar.put(s1.charAt(i),(slovar.get(s1.charAt(i)))+1);
        }

        for(int i=0;i<s2.length();i++){
            //если такой буквы нет в словаре
            if(!slovar.containsKey(s2.charAt(i))){
                System.out.print("Комбинация неверна");
                Flag=true;
                break;
            }
            else if(slovar.get(s2.charAt(i))==0){
                System.out.print("Комбинация неверна");
                Flag=true;
                break;
            }
            else {slovar.put(s2.charAt(i),(slovar.get(s2.charAt(i)))-1);
                if(slovar.get(s2.charAt(i))==0){slovar.remove(s2.charAt(i));}
            }

        }
        if(slovar.size() == 0){System.out.print("Была введена верная комбинация");}
        else if(!Flag)System.out.print("Была введена неверная комбинация");
    }
}
