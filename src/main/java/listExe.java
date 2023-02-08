import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listExe {

    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(30,60,94);
        System.out.println(ortalama(list));
        List<String>list1=Arrays.asList("Adanada","Mersin","ses","radar","ses");
        polindrom(list1);
    }

    public static double ortalama(List<Integer> list){
        double result=0;
        for (Integer i:
                list) {
            result+=i;
        }
        return result/list.size();

    }

    public static void polindrom(List<String>list){
        List<String>newList=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            String str="";
            str+=list.get(i);
            String reverse="";
            for (int j = str.length()-1; j >=0 ; j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)&&!(newList.contains(str))){
                newList.add(str);
                System.out.print(str+" ");
                System.out.println("------------------");
                System.out.println("-------------");
            }
        }
    }

}
