package javaclasspack;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.Map;
public class mse2unit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>stream=Stream.of(1,2,3,4,5);
//		stream.filter(n->n%2==0).forEach(n->System.out.println(n));//input>=output filter out
		// 2
		// 4
		
		stream.map(n->n%2==0).forEach(System.out::println);// output =input no. transform each element of stream 
		// take one element - pass to fn - transform - store in new stream
		
//		false
//		true
//		false
//		true
//		false
		List<Integer>list=Arrays.asList(1,2,3,44,5,6,7,8,9,9,7);
		List<Integer>result=list.stream().map(n->n*n).collect(Collectors.toList());
		// short version write toList() only instead of writing collect.Collectors.toList()
		
		System.out.println(result);
		//[1, 4, 9, 16, 25, 36, 49, 64, 81]
		List<Integer>result1=list.stream().map(n->n/2).toList();//
		//[0, 1, 1, 2, 2, 3, 3, 4, 4]
		System.out.println(result1);
		
		// convert to set 
		Set<Integer>result2=list.stream().map(n->n*n).collect(Collectors.toSet());
		System.out.println(result2);
		//[16, 64, 1, 49, 81, 4, 36, 9, 25] gives only unique values
		
		// convert to array 
		Integer[]arr=list.stream().map(n->n*n).toArray(Integer[]::new);
//		System.out.println(arr); not directly print
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//1 4 9 16 25 36 49 64 81 81 49 
		
		// convert into ArrayList
		ArrayList<Integer> arr1=list.stream().map(n->n*n).collect(Collectors.toCollection(ArrayList::new));
		System.out.println(arr1);
		//[1, 4, 9, 16, 25, 36, 49, 64, 81, 81, 49]
		
		// print names of list in upper case
		List<String> list1=Arrays.asList("mahi","mani","sakshi");
		List<String>r1=list1.stream().map(n->n.substring(0,1).toLowerCase()+n.substring(1).toUpperCase()).toList();
//		[mAHI, mANI, sAKSHI]
		//List<String>r1=list1.stream().map(n->n.substring(4)).toList();
		//[, , hi]
//		List<Character>r1=list1.stream().map(n->n.charAt(0)).toList();
		//[m, m, s]
		System.out.println(r1);
		//[MAHI, MANI, SAKSHI]
		String s="sakshi";
		
//		use of filter +map
		List<Integer>lp=list.stream().filter(n->n%3==0).map(n->n*3).toList();
		System.out.println(lp);
		//[9, 18, 27, 27]
		
//     sorted 
		
		List<Integer>lt=list.stream().sorted().toList();
		System.out.println(lt);
		// [1, 2, 4, 6, 7, 7, 8, 9, 34, 55, 94]
		//		List<Integer>list=Arrays.asList(1,2,34,4,55,6,7,8,9,94,7);
		
		List<Integer>ltr=list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(ltr);
		//[9, 9, 8, 7, 7, 6, 5, 4, 3, 2, 1]
		
		List<String>l0=list1.stream().sorted(Comparator.comparing(n->n.length())).toList();
		List<String>ltrt=list1.stream().sorted(Comparator.comparing(n->n.substring(2))).toList();
		System.out.println(ltrt);
		//[mahi, mani, sakshi]
		
//		limit()	
		List<Integer>o=list.stream().limit(5).toList();
		System.out.println(o);
		//[1, 2, 3, 4, 5]
		
		
// 		skip()
		List<Integer>ot=list.stream().skip(5).toList();
		System.out.println(ot);
		//[6, 7, 8, 9, 9, 7]
		
// 		count() 
		long kp=list.stream().count();
		System.out.println(kp);
		//11
		
//		distinct()
		List<Integer>pl=list.stream().filter(n->n%3==0).distinct().toList();
		System.out.println(pl);
		//[3, 6, 9]
		
//      identity reduce() always gives a single value
		Integer plj=list.stream().reduce(0,(a,b)->a-b);
		System.out.println(plj);
		//-61
		
//		Optional reduce() gives result as Optional[10]
		Optional<Integer> kl=list.stream().reduce((a,b)->a-b);
		System.out.println(kl);
		//Optional[-59]
		
////      identity reduce() always gives a single value
//		Integer plj=list.stream().reduce(0,(a,b)->a+b);
//		System.out.println(plj);
//		//61
//		
////		Optional reduce() gives result as Optional[10]
//		Optional<Integer> kl=list.stream().reduce((a,b)->a+b);
//		System.out.println(kl);
//		//Optional[61]
		
// 		toArray()
//		Integer[]arr3=list.stream().toArray(new Integer[0]);
		//    Stream.toArray() does NOT accept an array argument
		//* It only accepts a generator function
		Integer[]arr3=list.stream().toArray(Integer[]::new);
		Arrays.stream(arr3).forEach(System.out::println);
		
		String[] ar55=list1.stream().toList().toArray(new String[0]);
		Arrays.stream(ar55).forEach(System.out::println);
		//String[] ar55=list1.stream().toArray(new String[0]);
		//    stream().toArray() does NOT take an array argument
		//* That syntax only works with List, not Stream
		String[] ar5=list1.stream().toArray(String[]::new);
		Arrays.stream(ar5).forEach(System.out::println);
//		mahi
//		mani
//		sakshi
		Stream<String> stre = Stream.of("apple", "banana", "orange");
        String[] array = stre.collect(Collectors.toList()).toArray(new String[0]);
//        apple
//        banana
//        orange
        // Print the elements of the array
        Arrays.stream(array).forEach(System.out::println);
        
        
//		collect() toList
        List<Integer>sdj=list.stream().collect(Collectors.toList());
        System.out.println( sdj);
        //[1, 2, 3, 44, 5, 6, 7, 8, 9, 9, 7]
        
        
// 		collect() set
        Set<Integer>sd=list.stream().collect(Collectors.toSet());
        System.out.println(sd);
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        // answer always in ascending order 
        //[1, 2, 3, 5, 6, 7, 8, 9, 44]
        //(sequential stream)
        
		
//		collect()	map
//        Map<Integer,Integer>sd1=list.stream().collect(Collectors.toMap(n->n/2,n->n*n));
        //System.out.println(sd1);
//        sd1.stream().forEach(System.out::println);
        // all above give error
        Map<Integer, Integer> sd1 = list.stream()
        	    .collect(Collectors.toMap(
        	        n -> n / 2,
        	        n -> n * n,
        	        (a, b) -> a
        	    ));

        	sd1.forEach((k, v) -> System.out.println(k + " -> " + v));
//        	Collectors.toMap(
//
//        		    keyMapper,
//
//        		    valueMapper,
//
//        		    (a, b) -> a   // merge function so no two key is same 
//
//        		)
        	//    a = old value (already in map)
        	// b = new value (coming from stream)
        	
//        	0 -> 1
//        	1 -> 4
//        	2 -> 25
//        	3 -> 36
//        	4 -> 64
//        	22 -> 1936
        	
//			min max always use get() as terminal operation with  max,min
        	// Comparator.comparing is static method
        	//Integer::valueOf conversion into object form
        	// get to remove optional extract value 
        	
			 Optional<Integer> maxi=list.stream().max(Comparator.comparing(Integer::valueOf));
			 //Optional[44]
			 Integer maxi=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
			 System.out.println(maxi);
			 
			 //44
			 Integer mini=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
			 System.out.println(mini);
			 //1
			 //Finding the string with min & max first character
			 //
			 //overloading overriding 
			 
        	
	}

}
