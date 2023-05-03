package ex20;
//Set - TreeSet
//subSet()을 이용한 범위검색 (시작범위는 포함, 끝범위는 포함되지 않음!)

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");			set.add("alien");		set.add("bat");	
		set.add("car");			set.add("Car");			set.add("disc");
		set.add("dance");		set.add("dZZZZ");		set.add("dzzzz");
		set.add("elephant");	set.add("elevator");	set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search: from " + from + " to " + to);
		System.out.println("result1: " + set.subSet(from, to)); //subSet(b, d) ==> d는 포함안됨
		System.out.println("result2: " + set.subSet(from, to + "zzz")); //subSet(b, d+"zzz") ==> d포함됨
		
	}

}

/* (실행 결과:)

[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
range search: from b to d
result1: [bat, car]
result2: [bat, car, dZZZZ, dance, disc]

*/
